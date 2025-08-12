package com.aayush.blogapp.ui.main.settings.preferences

sealed class PreferenceState {
    data class ConfigureTheme(val key: String, val value: Boolean): PreferenceState()
}