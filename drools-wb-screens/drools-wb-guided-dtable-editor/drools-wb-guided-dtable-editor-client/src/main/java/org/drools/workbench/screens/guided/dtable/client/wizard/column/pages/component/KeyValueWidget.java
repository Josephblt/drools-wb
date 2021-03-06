/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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
package org.drools.workbench.screens.guided.dtable.client.wizard.column.pages.component;

import javax.inject.Inject;

import com.google.gwt.user.client.ui.IsWidget;
import org.uberfire.client.mvp.UberElemental;

public class KeyValueWidget {

    private View view;

    @Inject
    public KeyValueWidget(final View view) {
        this.view = view;
    }

    public void put(final String key,
                    final IsWidget value) {
        view.setKey(key);
        view.setValueWidget(value);
    }

    public UberElemental<KeyValueWidget> getView() {
        return view;
    }

    public interface View
            extends UberElemental<KeyValueWidget> {

        void setKey(final String key);

        void setValueWidget(final IsWidget value);
    }
}
