package com.meow.roommorph.screens.general.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.meow.roommorph.ui.theme.RoomMorphTheme
import com.meow.roommorph.R
import com.meow.roommorph.ui.theme.Typography

@Composable
fun PreviewPhotoHolder() {
    Card(
        elevation = CardDefaults.elevatedCardElevation(0.dp)
    ) {
        Column {
            Spacer(Modifier.height(8.dp))
            Text(
                "Фотография комнаты",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                style = Typography.titleMedium,
                textAlign = TextAlign.Center,
            )

            Spacer(Modifier.height(4.dp))
            HorizontalDivider(Modifier.padding(horizontal = 16.dp))
            Spacer(Modifier.height(4.dp))
            AsyncImage(
                model = null,
                contentDescription = "Сгенерированная комната",
                fallback = painterResource(R.drawable.camera_grid),
                placeholder = painterResource(R.drawable.camera_grid)
            )
        }
    }
}

@Preview
@Composable
fun PreviewPhotoHolderPreview() {
    RoomMorphTheme {
        PreviewPhotoHolder()
    }
}