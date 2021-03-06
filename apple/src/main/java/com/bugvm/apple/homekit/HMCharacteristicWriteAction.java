/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.homekit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HomeKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HMCharacteristicWriteAction/*</name>*/ <T extends NSObject> 
    extends /*<extends>*/HMAction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HMCharacteristicWriteActionPtr extends Ptr<HMCharacteristicWriteAction, HMCharacteristicWriteActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HMCharacteristicWriteAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HMCharacteristicWriteAction(SkipInit skipInit) { super(skipInit); }
    public HMCharacteristicWriteAction(HMCharacteristic characteristic, T targetValue) { super((SkipInit) null); initObject(init(characteristic, targetValue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "characteristic")
    public native HMCharacteristic getCharacteristic();
    @Property(selector = "targetValue")
    public native T getTargetValue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCharacteristic:targetValue:")
    protected native @Pointer long init(HMCharacteristic characteristic, T targetValue);
    @Method(selector = "updateTargetValue:completionHandler:")
    public native void updateTargetValue(T targetValue, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
