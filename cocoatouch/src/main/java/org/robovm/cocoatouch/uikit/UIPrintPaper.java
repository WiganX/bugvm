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
public class /*<name>*/ UIPrintPaper /*</name>*/ 
    extends /*<extends>*/ NSObject /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIPrintPaper /*</name>*/.class);
    }

    /*<constructors>*/
    public UIPrintPaper() {}
    
    /*</constructors>*/
    /*<properties>*/
    @Bind("paperSize") public native @Type("CGSize") CGSize getPaperSize();
    @Bind("printableRect") public native @Type("CGRect") CGRect getPrintableRect();
    /*</properties>*/
    /*<methods>*/
    @Bind("bestPaperForPageSize:withPapersFromArray:") public native static @Type("UIPrintPaper *") UIPrintPaper forPageSize(@Type("CGSize") CGSize pageSize, @Type("NSArray *") NSArray paperList);
    /*</methods>*/

}
