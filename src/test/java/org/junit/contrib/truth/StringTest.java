/*
 * Copyright (c) 2011 David Saff
 * Copyright (c) 2011 Christian Gruber
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.junit.contrib.truth;

import static org.junit.Assert.fail;
import static org.junit.contrib.truth.Truth.ASSERT;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for String Subjects.
 * 
 * @author David Saff
 * @author Christian Gruber (cgruber@israfil.net)
 */
@RunWith(JUnit4.class)
public class StringTest {

  @Test public void stringContainsFail() {
    try {
      ASSERT.that("abc").contains("d");
    } catch (AssertionError expected) {
      ASSERT.that(expected.getMessage()).contains(
          "Not true that <abc> contains <d>");
      return;
    }
    fail("Should have thrown");
  }

  @Test public void chain() {
    ASSERT.that("abc").contains("a").contains("b");
  }

  @Test public void stringIs() {
    ASSERT.that("abc").isEqualTo("abc");
  }
}
