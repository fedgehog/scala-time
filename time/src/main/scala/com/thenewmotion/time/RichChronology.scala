package com.thenewmotion.time

/**
 * Copyright 2009 Jorge Ortiz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 **/
import org.joda.time._

class RichChronology(val self: Chronology) extends AnyVal {
  def zone: Option[DateTimeZone] = nullCheck(self.getZone)
  private def nullCheck[T <: AnyRef](x: T): Option[T] = if (x == null) None else Some(x)
}
