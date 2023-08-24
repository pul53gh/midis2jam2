/*
 * Copyright (C) 2023 Jacob Wysko
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://www.gnu.org/licenses/.
 */

package org.wysko.midis2jam2.gui.components

import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.dp
import org.wysko.midis2jam2.gui.viewmodel.I18n

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MidiFileSelector(
    modifier: Modifier = Modifier,
    selectedMidiFile: String,
    openMidiFileBrowse: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        TextField(modifier = Modifier.focusable(false).fillMaxWidth(),
            value = selectedMidiFile,
            onValueChange = { },
            label = { Text(I18n["midi_file"].value) },
            singleLine = true,
            readOnly = true,
            trailingIcon = {
                ToolTip(I18n["browse"].value) {
                    IconButton(openMidiFileBrowse, Modifier.pointerHoverIcon(PointerIcon.Hand)) {
                        Icon(Icons.Default.List, contentDescription = I18n["browse"].value)
                    }
                }
            })

    }
}