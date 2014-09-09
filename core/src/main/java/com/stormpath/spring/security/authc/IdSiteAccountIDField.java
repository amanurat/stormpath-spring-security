/*
 * Copyright 2014 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.spring.security.authc;

public enum IdSiteAccountIDField {

    USERNAME, EMAIL;

    /**
     * Returns the {@code IDSiteAccountIDField} instance associated with the specified String name.
     *
     * @param name The name of the {@code IDSiteAccountIDField} instance to retrieve.
     * @return the {@code IDSiteAccountIDField} instance associated with the specified String name.
     * @throws IllegalArgumentException if {@code name} is null or does not match (case insensitive) an IDSiteAccountIDField
     *                                  value.
     */
    public static IdSiteAccountIDField fromName(String name) {
        for (IdSiteAccountIDField idField : values()) {
            if (idField.name().equalsIgnoreCase(name)) {
                return idField;
            }
        }
        throw new IllegalArgumentException("Unrecognized Account id field name: " + name);
    }
}