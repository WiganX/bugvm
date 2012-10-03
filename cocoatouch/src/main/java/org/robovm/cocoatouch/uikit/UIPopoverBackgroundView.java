/*
 * Copyright (C) 2012 RoboVM
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
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIPopoverBackgroundView /*</name>*/ 
    extends /*<extends>*/ UIView /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIPopoverBackgroundView /*</name>*/.class);
    }

    /*<constructors>*/
    public UIPopoverBackgroundView() {}
    
    /*</constructors>*/
    /*<properties>*/
    @Bind("arrowDirection") public native @Type("UIPopoverArrowDirection") UIPopoverArrowDirection getArrowDirection();
    @Bind("setArrowDirection:") public native void setArrowDirection(@Type("UIPopoverArrowDirection") UIPopoverArrowDirection v);
    @Bind("arrowOffset") public native @Type("CGFloat") float getArrowOffset();
    @Bind("setArrowOffset:") public native void setArrowOffset(@Type("CGFloat") float v);
    /*</properties>*/
    /*<methods>*/
    @Bind("arrowBase") public native static @Type("CGFloat") float getArrowBase();
    @Bind("arrowHeight") public native static @Type("CGFloat") float getArrowHeight();
    @Bind("contentViewInsets") public native static @Type("UIEdgeInsets") UIEdgeInsets getContentViewInsets();
    @Bind("wantsDefaultContentAppearance") public native static @Type("BOOL") boolean wantsDefaultContentAppearance();
    /*</methods>*/

}
