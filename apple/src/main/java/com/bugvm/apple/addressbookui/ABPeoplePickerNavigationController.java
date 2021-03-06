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
package com.bugvm.apple.addressbookui;

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
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.addressbook.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 2.0 and later.
 * @deprecated Deprecated in iOS 9.0.
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("AddressBookUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABPeoplePickerNavigationController/*</name>*/ 
    extends /*<extends>*/UINavigationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ABPeoplePickerNavigationControllerPtr extends Ptr<ABPeoplePickerNavigationController, ABPeoplePickerNavigationControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ABPeoplePickerNavigationController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ABPeoplePickerNavigationController() {}
    protected ABPeoplePickerNavigationController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "peoplePickerDelegate")
    public native ABPeoplePickerNavigationControllerDelegate getPeoplePickerDelegate();
    @Property(selector = "setPeoplePickerDelegate:", strongRef = true)
    public native void setPeoplePickerDelegate(ABPeoplePickerNavigationControllerDelegate v);
    @Property(selector = "displayedProperties")
    public native @com.bugvm.rt.bro.annotation.Marshaler(ABProperty.AsListMarshaler.class) List<? extends ABProperty> getDisplayedProperties();
    @Property(selector = "setDisplayedProperties:")
    public native void setDisplayedProperties(@com.bugvm.rt.bro.annotation.Marshaler(ABProperty.AsListMarshaler.class) List<? extends ABProperty> v);
    @Property(selector = "addressBook")
    public native ABAddressBook getAddressBook();
    @Property(selector = "setAddressBook:")
    public native void setAddressBook(ABAddressBook v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "predicateForEnablingPerson")
    public native NSPredicate getPredicateForEnablingPerson();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPredicateForEnablingPerson:")
    public native void setPredicateForEnablingPerson(NSPredicate v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "predicateForSelectionOfPerson")
    public native NSPredicate getPredicateForSelectionOfPerson();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPredicateForSelectionOfPerson:")
    public native void setPredicateForSelectionOfPerson(NSPredicate v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "predicateForSelectionOfProperty")
    public native NSPredicate getPredicateForSelectionOfProperty();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPredicateForSelectionOfProperty:")
    public native void setPredicateForSelectionOfProperty(NSPredicate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
