package pl.jojczak.penmouses.screen.settings.tab.scroll

import pl.jojczak.penmouses.core.common.utils.PrefKeys
import pl.jojczak.penmouses.screen.settings.mvi.SettingsTabState
import pl.jojczak.penmouses.screen.settings.mvi.SettingsViewAction

internal data class SettingsScrollState(
    val experimentalModeEnabled: Boolean = false,
    val scrollDistance: Float = PrefKeys.SCROLL_DISTANCE.default,
    val scrollDuration: Float = PrefKeys.SCROLL_DURATION.default,
): SettingsTabState()

internal sealed class SettingsScrollViewAction: SettingsViewAction() {
    data class ExperimentalModeUpdate(val enabled: Boolean): SettingsScrollViewAction()
}