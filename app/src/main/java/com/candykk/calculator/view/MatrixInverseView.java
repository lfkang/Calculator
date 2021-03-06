/*
 * Copyright (C) 2010 The Android Open Source Project
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

package com.candykk.calculator.view;

import android.content.Context;
import android.text.Html;
import android.text.InputType;
import android.widget.TextView;

import com.candykk.calculator.R;
import com.candykk.calculator.view.display.AdvancedDisplay;

public class MatrixInverseView extends TextView {
    private final static char PLACEHOLDER = '\uFEFF';
    public final static String PATTERN = PLACEHOLDER + "^-1";

    public MatrixInverseView(Context context) {
        super(context);
    }

    public MatrixInverseView(final AdvancedDisplay display) {
        super(display.getContext());
        setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        setText(Html.fromHtml("<sup><small>-1</small></sup>"));
        setTextAppearance(display.getContext(), R.style.Theme_Calculator_Display);
        setPadding(0, 0, 0, 0);
    }

    @Override
    public String toString() {
        return PATTERN;
    }
}
