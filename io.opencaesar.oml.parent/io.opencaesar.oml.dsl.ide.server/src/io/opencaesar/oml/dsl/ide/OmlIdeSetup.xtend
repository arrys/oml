/**
 * 
 * Copyright 2019 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
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
 * 
 */
package io.opencaesar.oml.dsl.ide

import com.google.inject.Guice
import io.opencaesar.oml.dsl.OmlRuntimeModule
import io.opencaesar.oml.dsl.OmlStandaloneSetup
import org.eclipse.xtext.util.Modules2
import io.opencaesar.oml.dsl.ide.diagram.OmlDiagramModule

/**
 * Initialization support for running Xtext languages as language servers.
 */
class OmlIdeSetup extends OmlStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new OmlRuntimeModule, new OmlIdeModule, new OmlDiagramModule))
	}
	
}
