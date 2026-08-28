package com.meow.roommorph.screens.general

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.meow.roommorph.screens.general.ui.PhotoPicker
import com.meow.roommorph.screens.general.ui.PresetSelector
import com.meow.roommorph.ui.kit.PrimaryRoundedButton
import com.meow.roommorph.ui.theme.RoomMorphTheme
import com.meow.roommorph.ui.theme.Typography

@Composable
fun GeneralScreen(
    state: GeneralUiState,
    invokeEvent: (GeneralUiEvent) -> Unit
) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            Spacer(Modifier.height(16.dp))
            Text(
                "Подготовка фото",
                style = Typography.titleLarge
            )
            Spacer(Modifier.height(16.dp))
            PhotoPicker(
                state.photoPicker,
                {
                    invokeEvent(GeneralUiEvent.ChoosePhoto)
                }
            )
            Spacer(Modifier.height(16.dp))
            Text(
                "Выберите стиль",
                modifier = Modifier
                    .fillMaxWidth(),
                style = Typography.titleSmall,
            )
            Spacer(Modifier.height(8.dp))
            PresetSelector(state.styleSelector, {
                invokeEvent(GeneralUiEvent.SelectStyle(it))
            })
            Spacer(Modifier.height(16.dp))
            Spacer(modifier = Modifier.weight(1f))
            PrimaryRoundedButton(
                "Сгенерировать",
                state.photoPicker.model != null && state.styleSelector.selectedId != null
            ){
                invokeEvent(GeneralUiEvent.Generate)
            }
            Spacer(Modifier.height(16.dp))
        }
    }
}

@Preview
@Composable
fun GeneralScreenPreview() {
    RoomMorphTheme {
        GeneralScreen(GeneralUiState(), {})
    }
}