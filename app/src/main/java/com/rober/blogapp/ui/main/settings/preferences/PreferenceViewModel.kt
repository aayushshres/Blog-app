package com.aayush.blogapp.ui.main.settings.preferences

import com.aayush.blogapp.ui.base.BaseViewModel

class PreferenceViewModel : BaseViewModel<PreferenceState, PreferenceFragmentEvent>() {

    override fun setIntention(event: PreferenceFragmentEvent) {
        when(event){
            is PreferenceFragmentEvent.TouchDarkThemeOption -> viewState = PreferenceState.ConfigureTheme(event.key, event.value)
        }
    }
}