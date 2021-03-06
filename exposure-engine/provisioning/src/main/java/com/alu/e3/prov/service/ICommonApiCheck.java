/**
 * Copyright © 2012 Alcatel-Lucent.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * Licensed to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.alu.e3.prov.service;

import com.alu.e3.prov.restapi.model.Api;

public interface ICommonApiCheck {

	public abstract void assertHasDefaultContext(Api provRequest);

	public abstract boolean assertCompositionApiConsistency(Api provRequest);

	/**
	 * checks that validation schema section is OK 
	 * - file names are unique
	 * - file extension matches grammar type xsd / wsdl
	 * - xml stream is consistent
	 * - in wsdl check that one and only one resource has isMain = true
	 * @param provRequest
	 */
	public abstract void assertValidatioSchemaConsystency(Api provRequest);


}