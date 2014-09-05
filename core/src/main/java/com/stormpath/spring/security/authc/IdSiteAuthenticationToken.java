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

import com.stormpath.sdk.http.HttpRequest;
import com.stormpath.sdk.idsite.IdSiteResultListener;
import com.stormpath.sdk.lang.Assert;
import org.springframework.security.authentication.AbstractAuthenticationToken;

import java.util.Collections;

public class IdSiteAuthenticationToken extends AbstractAuthenticationToken {

    private final HttpRequest request;
    private final IdSiteResultListener idSiteResultListener;

    public IdSiteAuthenticationToken(HttpRequest request, IdSiteResultListener listener) {
        super(Collections.EMPTY_LIST);
        Assert.notNull(request);
        this.request = request;
        this.idSiteResultListener = listener;
    }

    @Override
    public Object getPrincipal() {
        return this.idSiteResultListener;
    }

    @Override
    public Object getCredentials() {
        return this.request;
    }

}
