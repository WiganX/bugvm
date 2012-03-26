/**
 * 
 */
package org.nullvm.compiler;

import static org.nullvm.compiler.Functions.*;
import static org.nullvm.compiler.Mangler.*;
import static org.nullvm.compiler.Types.*;

import java.util.ArrayList;

import org.nullvm.compiler.llvm.Function;
import org.nullvm.compiler.llvm.FunctionAttribute;
import org.nullvm.compiler.llvm.IntegerConstant;
import org.nullvm.compiler.llvm.Linkage;
import org.nullvm.compiler.llvm.Ret;
import org.nullvm.compiler.llvm.Type;
import org.nullvm.compiler.llvm.Value;
import org.nullvm.compiler.llvm.VariableRef;
import org.nullvm.compiler.trampoline.LdcClass;
import org.nullvm.compiler.trampoline.NativeCall;
import org.nullvm.compiler.trampoline.Trampoline;

import soot.SootMethod;

/**
 * @author niklas
 *
 */
public class NativeMethodCompiler extends AbstractMethodCompiler {

    public NativeMethodCompiler(Config config) {
        super(config);
    }

    protected void doCompile(ModuleBuilder moduleBuilder, SootMethod method) {
        Function outerFunction = createFunction(method, Linkage.external, 
                FunctionAttribute.noinline);
        moduleBuilder.addFunction(outerFunction);
        Function innerFunction = createFunction(mangleMethod(method.makeRef()) + "_inner", 
                method, Linkage.internal, FunctionAttribute.noinline);
        moduleBuilder.addFunction(innerFunction);

        String targetClassName = getInternalName(method.getDeclaringClass());
        String methodName = method.getName();
        String methodDesc = getDescriptor(method);
        Trampoline trampoline = new NativeCall(this.className, targetClassName, methodName, methodDesc, method.isStatic());
        trampolines.add(trampoline);
        
        Type[] parameterTypes = innerFunction.getType().getParameterTypes();
        String[] parameterNames = innerFunction.getParameterNames();
        ArrayList<Value> args = new ArrayList<Value>();
        for (int i = 0; i < parameterTypes.length; i++) {
            args.add(new VariableRef(parameterNames[i], parameterTypes[i]));
        }
        
        Value resultOuter = call(outerFunction, innerFunction.ref(), args);
        outerFunction.add(new Ret(resultOuter));

        if (method.isStatic()) {
            // Add the current class as second parameter
            Trampoline ldc = new LdcClass(className, className);
            trampolines.add(ldc);
            Value clazz = call(innerFunction, ldc.getFunctionRef(), ENV);
            args.add(1, clazz);
        }        
        
        Value frameAddress = call(innerFunction, LLVM_FRAMEADDRESS, new IntegerConstant(0));
        call(innerFunction, NVM_BC_PUSH_NATIVE_FRAME, ENV, frameAddress);
        Value resultInner = call(innerFunction, trampoline.getFunctionRef(), args);
        call(innerFunction, NVM_BC_POP_NATIVE_FRAME, ENV);
        call(innerFunction, NVM_BC_THROW_IF_EXCEPTION_OCCURRED, ENV);
        innerFunction.add(new Ret(resultInner));
    }
    
    
}
