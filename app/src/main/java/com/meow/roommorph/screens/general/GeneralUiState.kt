package com.meow.roommorph.screens.general

data class GeneralUiState(
    val photoPicker: PhotoPickerState = PhotoPickerState()
)

data class PhotoPickerState(
    val model: String? = null
)