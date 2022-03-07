/*
 * Copyright © 2021 camunda services GmbH (info@camunda.com)
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
package io.camunda.zeebe.process.test.api;

import io.camunda.zeebe.protocol.record.Record;

/** The source of records that have been processed by the test engine */
public interface RecordStreamSource {

  /**
   * Gets an iterable of all records that have been published by the test engine.
   *
   * @return an iterable {@link Record}
   */
  Iterable<Record<?>> getRecords();
}
