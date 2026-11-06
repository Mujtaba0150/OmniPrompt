package com.mrndstvndv.search.ui.debug

import androidx.compose.runtime.Composable
import com.mrndstvndv.search.ui.components.settings.SettingsGroup
import com.mrndstvndv.search.ui.components.settings.SettingsSwitch

/** Row shown only in debug builds, for silencing update prompts. */
@Composable
fun DebugUpdatePromptsEntry(
    disabled: Boolean,
    onDisabledChange: (Boolean) -> Unit,
) {
    SettingsGroup {
        SettingsSwitch(
            title = "Hide update prompts (debug)",
            subtitle = "No update banner or badge, and no automatic check in search",
            checked = disabled,
            onCheckedChange = onDisabledChange,
        )
    }
}
