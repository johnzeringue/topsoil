/*
 * Copyright 2015 CIRDLES.
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
 */
package org.cirdles.topsoil.dataset.field;

import javafx.scene.control.TableRow;
import javafx.util.StringConverter;
import org.cirdles.topsoil.dataset.entry.Entry;

/**
 *
 * @author parizotclement
 */
public final class Fields {

    public static final BooleanField SELECTED = new BooleanField("Selected");

    public static final Field<TableRow<Entry>> ROW = new Field() {

        @Override
        public String getName() {
            return "Row";
        }

        @Override
        public StringConverter getStringConverter() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    };

}
