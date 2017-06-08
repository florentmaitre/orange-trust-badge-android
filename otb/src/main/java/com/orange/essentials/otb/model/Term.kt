/*
 * Copyright 2016 Orange
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
/* Orange Trust Badge library
 *
 * Module name: com.orange.essentials:otb
 * Version:     1.0
 * Created:     2016-03-15 by Aurore Penault, Vincent Boesch, and Giovanni Battista Accetta
 */
package com.orange.essentials.otb.model

import com.orange.essentials.otb.model.type.TermType

import java.io.Serializable

/**
 *
 *
 * File name:   Term
 * Version:     0.1.0 (see AndroidManifest.xml)
 * Created:     27/01/2016
 * Created by:  VAPU8214 (Aurore Penault)
 *
 *
 * A term is a block displayed in "Terms" section
 */
data class Term(
        /**
         * Type of a term
         */
        var termType: TermType?,
        /**
         * Localized resource id for term's title
         */
        var titleId: Int,
        /**
         * Localized resource id for term's content
         */
        var contentId: Int) : Serializable
