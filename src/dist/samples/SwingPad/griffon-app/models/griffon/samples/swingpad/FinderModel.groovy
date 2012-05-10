/*
 * Copyright 2007-2012 the original author or authors.
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
 */

package griffon.samples.swingpad

/**
 * @author Andres Almiray
 */
class FinderModel extends AbstractDialogModel {
    @Bindable String toFind = ''
    @Bindable String replaceWith = ''
    @Bindable boolean matchCase
    @Bindable boolean regex
    @Bindable boolean wholeWord
    @Bindable String replaced

    protected String getDialogKey() { 'Find' }
    protected String getDialogTitle() { 'Find' }

    void mvcGroupInit(Map<String, Object> args) {
        super.mvcGroupInit(args)
        resizable = false
        modal = false
    }
}