/*
Copyright 2007-2013 Selenium committers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
 
 package org.openqa.selenium.support;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to mark a field on a Page Object to indicate that lookup should use a series of @FindBy tags
 * It will then search for all elements that match any of the FindBy criteria. Note that elements
 * are not guaranteed to be in document order.
 *
 * Eg:
 *
 * <pre class="code">
 * &#64;FindAll({&#64;FindBy(how = How.ID, using = "foo"),
 *           &#64;FindBy(className = "bar")})
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface FindAll {
  FindBy[] value();
}
