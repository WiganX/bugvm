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

import java.util.*;

public enum UIReturnKeyType {
    Default(0),
    Go(1),
    Google(2),
    Join(3),
    Next(4),
    Route(5),
    Search(6),
    Send(7),
    Yahoo(8),
    Done(9),
    EmergencyCall(10);

    private final int n;

    private UIReturnKeyType(int n) { this.n = n; }
    public int value() { return n; }
    public static UIReturnKeyType fromValue(int n) {
        for (UIReturnKeyType v : values()) {
            if (n == v.value()) {
                return v;
            }
        }
        throw new IllegalArgumentException("Unknown UIReturnKeyType value: " + n);
    }
}
