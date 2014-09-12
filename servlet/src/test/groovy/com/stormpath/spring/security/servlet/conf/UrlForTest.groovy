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
package com.stormpath.spring.security.servlet.conf

import org.junit.Assert
import org.junit.Test

import static org.junit.Assert.*;

/**
 * @since 0.4.0
 */
class UrlForTest {

    @Test
    public void testOverride() {
        Assert.assertEquals(9, UrlFor.properties.size())
        assertEquals(UrlFor.get("form_login"), "/form_login.jsp")
        assertEquals(UrlFor.get("idsite_logout.action"), "/idsite/logout")
        assertEquals(UrlFor.get("idsite_login.action"), "/idsite/login")
    }
}
