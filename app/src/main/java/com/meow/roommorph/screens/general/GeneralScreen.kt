package com.meow.roommorph.screens.general

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.meow.roommorph.screens.general.ui.PreviewPhotoHolder
import com.meow.roommorph.ui.theme.RoomMorphTheme
import com.meow.roommorph.ui.theme.Typography


@Composable
fun GeneralScreen(
    state: GeneralUiState
) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                "Подготовка фото",
                style = Typography.titleLarge
            )
            Spacer(Modifier.height(16.dp))
            PreviewPhotoHolder(state.photoPicker)
        }
    }
}

@Preview
@Composable
fun GeneralScreenPreview() {
    RoomMorphTheme {
        GeneralScreen(GeneralUiState())
    }
}