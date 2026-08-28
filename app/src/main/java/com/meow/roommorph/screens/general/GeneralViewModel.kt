package com.meow.roommorph.screens.general

import android.net.Uri
import androidx.lifecycle.viewModelScope
import com.meow.roommorph.common.base.BaseViewModel
import com.meow.roommorph.core.navigation.INavigationManager
import com.meow.roommorph.core.navigation.NavigationManagerImpl
import com.meow.roommorph.core.notification.INotificationManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GeneralViewModel @Inject constructor(
    navigationManager: INavigationManager,
    notificationManager: INotificationManager
): BaseViewModel<GeneralUiState, GeneralUiEvent, GeneralUiEffects>(navigationManager, notificationManager) {

    override fun initUiState(): MutableStateFlow<GeneralUiState> {
        return MutableStateFlow(GeneralUiState())
    }

    override fun onEvent(event: GeneralUiEvent) {
        when(event) {
            is GeneralUiEvent.SelectStyle -> {
                updateSelectedStyle(event.styleID)
            }
            is GeneralUiEvent.ChoosePhoto -> {
                viewModelScope.launch {
                    _effect.send(GeneralUiEffects.OpenPhotoPicker)
                }
            }
            is GeneralUiEvent.Generate -> {

            }
            is GeneralUiEvent.SubmitPhoto -> {
                updatePhoto(event.uri)
            }
        }
    }

    private fun updateSelectedStyle(selected: String) {
        _state.update { current ->
            current.copy(
                styleSelector = current.styleSelector.copy(
                    selectedId = selected
                )
            )
        }
    }

    private fun updatePhoto(uri: Uri?) {
        _state.update { current ->
            current.copy(
                photoPicker = current.photoPicker.copy(
                    model = uri?.toString()
                )
            )
        }
    }

}