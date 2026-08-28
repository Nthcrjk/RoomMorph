package com.meow.roommorph.screens.general

import androidx.annotation.DrawableRes
import com.meow.roommorph.R

enum class SelectorItemEnum(
    val value: String,
) {
    HI_TECH("HI_TECH"),
    LOFT("LOFT"),
    MINIMALISM("MINIMALISM"),
    CYBERPUNK("CYBERPUNK")
}

data class GeneralUiState(
    val photoPicker: PhotoPickerState = PhotoPickerState(),
    val styleSelector: PresetSelectorsState = PresetSelectorsState(),
)

data class PhotoPickerState(
    val model: String? = null
)

data class PresetSelectorsState(
    val selectedId: String? = null,
    val styleList: List<PresetSelectorState> = listOf(
        PresetSelectorState(
            SelectorItemEnum.HI_TECH.value,
            "Хайтек",
            R.drawable.test_room,
        ),
        PresetSelectorState(
            SelectorItemEnum.LOFT.value,
            "Лофт",
            R.drawable.test_room,
        ),
        PresetSelectorState(
            SelectorItemEnum.MINIMALISM.value,
            "Минимализм",
            R.drawable.test_room,
        ),
        PresetSelectorState(
            SelectorItemEnum.CYBERPUNK.value,
            "Киберпанк",
            R.drawable.test_room,
        )
    )
)

data class PresetSelectorState(
    val id: String,
    val text: String,
    @DrawableRes val imageRes: Int,
)