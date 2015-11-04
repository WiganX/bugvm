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
package com.bugvm.apple.healthkit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("HealthKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HKWorkout/*</name>*/ 
    extends /*<extends>*/HKSample/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HKWorkoutPtr extends Ptr<HKWorkout, HKWorkoutPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HKWorkout.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HKWorkout() {}
    protected HKWorkout(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "workoutActivityType")
    public native HKWorkoutActivityType getWorkoutActivityType();
    @Property(selector = "workoutEvents")
    public native NSArray<HKWorkoutEvent> getWorkoutEvents();
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "totalEnergyBurned")
    public native HKQuantity getTotalEnergyBurned();
    @Property(selector = "totalDistance")
    public native HKQuantity getTotalDistance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "workoutWithActivityType:startDate:endDate:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate);
    @Method(selector = "workoutWithActivityType:startDate:endDate:workoutEvents:totalEnergyBurned:totalDistance:metadata:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate, NSArray<HKWorkoutEvent> workoutEvents, HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKMetadata metadata);
    @Method(selector = "workoutWithActivityType:startDate:endDate:duration:totalEnergyBurned:totalDistance:metadata:")
    public static native HKWorkout create(HKWorkoutActivityType workoutActivityType, NSDate startDate, NSDate endDate, double duration, HKQuantity totalEnergyBurned, HKQuantity totalDistance, HKMetadata metadata);
    /*</methods>*/
}