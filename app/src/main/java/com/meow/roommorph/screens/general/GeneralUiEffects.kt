package com.meow.roommorph.screens.general

sealed interface GeneralUiEffects {
    data object OpenPhotoPicker: GeneralUiEffects
}