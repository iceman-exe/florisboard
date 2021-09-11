/*
 * Copyright (C) 2021 Patrick Goldinger
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

package dev.patrickgold.florisboard.app.ui.settings

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import dev.patrickgold.florisboard.R
import dev.patrickgold.florisboard.app.LocalNavController
import dev.patrickgold.florisboard.app.ui.Routes
import dev.patrickgold.florisboard.app.ui.components.FlorisScreen
import dev.patrickgold.jetpref.ui.compose.Preference

@Composable
fun HomeScreen() = FlorisScreen(title = "Main", backArrowVisible = false) {
    val navController = LocalNavController.current

    Preference(
        iconId = R.drawable.ic_build,
        title = stringResource(R.string.settings__advanced__title),
        onClick = { navController.navigate(Routes.Settings.Advanced) },
    )
    Preference(
        iconId = R.drawable.ic_info,
        title = stringResource(R.string.about__title),
        onClick = { navController.navigate(Routes.Settings.About) },
    )
}