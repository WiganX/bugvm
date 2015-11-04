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
package com.bugvm.apple.coreaudio;

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
import com.bugvm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioBuffer/*</name>*/ 
    extends /*<extends>*/Struct<AudioBuffer>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioBufferPtr extends Ptr<AudioBuffer, AudioBufferPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    public AudioBuffer(long handle) {
        super(handle);
    }
    
    /*<properties>*//*</properties>*/
    public AudioBuffer setData(long dataPointer, int length) {
        setData0(dataPointer);
        setDataByteSize(length);
        return this;
    }
    public AudioBuffer setData(byte[] data) {
        setArrayData(data, data.length);
        return this;
    }
    public AudioBuffer setData(short[] data) {
        setArrayData(data, data.length);
        return this;
    }
    public AudioBuffer setData(int[] data) {
        setArrayData(data, data.length);
        return this;
    }
    public AudioBuffer setData(float[] data) {
        setArrayData(data, data.length);
        return this;
    }
    public AudioBuffer setData(Buffer data) {
        setDataByteSize(data.capacity());
        setData0(BufferMarshalers.BufferMarshaler.toNative(data, 0));
        return this;
    }
    private AudioBuffer setArrayData(Object array, int length) {
        setDataByteSize(length);
        setData0(VM.getArrayValuesAddress(array));
        return this;
    }
    
    @SuppressWarnings("unchecked")
    public <T extends Buffer> T getDataAsBuffer(Class<T> bufferType) {
        long dataPointer = getDataPointer();
        if (bufferType == ByteBuffer.class) {
            return (T) VM.newDirectByteBuffer(dataPointer, getDataByteSize());
        } else if (bufferType == ShortBuffer.class) {
            return (T) VM.newDirectByteBuffer(dataPointer, getDataByteSize() << 1).order(ByteOrder.nativeOrder()).asShortBuffer();
        } else if (bufferType == IntBuffer.class) {
            return (T) VM.newDirectByteBuffer(dataPointer, getDataByteSize() << 2).order(ByteOrder.nativeOrder()).asIntBuffer();
        } else if (bufferType == FloatBuffer.class) {
            return (T) VM.newDirectByteBuffer(dataPointer, getDataByteSize() << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        } else {
            throw new UnsupportedOperationException("Buffer type not supported: " + bufferType);
        }
    }

    public byte[] getDataAsByteArray() {
        int length = getDataByteSize();
        byte[] data = new byte[length];
        getDataAsBuffer(ByteBuffer.class).get(data, 0, length);
        return data;
    }
    public short[] getDataAsShortArray() {
        int length = getDataByteSize();
        short[] data = new short[length];
        getDataAsBuffer(ShortBuffer.class).get(data, 0, length);
        return data;
    }
    public int[] getDataAsIntArray() {
        int length = getDataByteSize();
        int[] data = new int[length];
        getDataAsBuffer(IntBuffer.class).get(data, 0, length);
        return data;
    }
    public float[] getDataAsFloatArray() {
        int length = getDataByteSize();
        float[] data = new float[length];
        getDataAsBuffer(FloatBuffer.class).get(data, 0, length);
        return data;
    }
    /*<members>*/
    @StructMember(0) public native int getNumberChannels();
    @StructMember(0) public native AudioBuffer setNumberChannels(int numberChannels);
    @StructMember(1) private native int getDataByteSize();
    @StructMember(1) private native AudioBuffer setDataByteSize(int dataByteSize);
    /*</members>*/
    @StructMember(2) public native @Pointer long getDataPointer();
    @StructMember(2) private native AudioBuffer setData0(@Pointer long data);
    /*<methods>*//*</methods>*/
}