/*
 * Copyright 2008-2016 the original author or authors.
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
package org.codehaus.griffon.gradle

import spock.lang.Unroll

@Unroll
class GriffonPluginWithAppliedGroovyPluginSpecification extends AbstractPluginSpecification {
    def setupSpec() {
        project {
            apply plugin: 'org.codehaus.griffon.griffon'
            apply plugin: 'groovy'
            project.griffon {
                version = '2.8.0'
            }
        }
    }

    def 'sourceSets.main.groovy contains griffon-app/#srcDir'() {
        expect:
        project.sourceSets.main.groovy.srcDirs.contains(project.file("griffon-app/${srcDir}"))

        where:
        srcDir << [
            'models',
            'views',
            'controllers',
            'services',
            'conf',
            'lifecycle'
        ]
    }
}