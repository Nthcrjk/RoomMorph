package com.meow.roommorph.screens.general

import android.net.Uri

sealed interface GeneralUiEvent {
    data class SelectStyle(val styleID: String): GeneralUiEvent
    data object Generate: GeneralUiEvent
    data object ChoosePhoto: GeneralUiEvent
    data class SubmitPhoto(val uri: Uri): GeneralUiEvent
}