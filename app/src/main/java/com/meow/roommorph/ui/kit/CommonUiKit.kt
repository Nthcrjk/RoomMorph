package com.meow.roommorph.ui.kit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.meow.roommorph.ui.theme.RoomMorphTheme
import com.meow.roommorph.ui.theme.TextDark
import com.meow.roommorph.ui.theme.PrimaryCyanDark
import com.meow.roommorph.ui.theme.Typography

@Composable
fun PrimaryRoundedButton(
    text: String,
    enabled: Boolean = true,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp),
        enabled = enabled,
        shape = RoundedCornerShape(24.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = PrimaryCyanDark,
            contentColor = Color.White
        )
    ) {
        Text(
            text = text,
            style = Typography.labelLarge,
            color = TextDark
        )
    }
}

@Preview
@Composable()
fun CommonPreview() {
    RoomMorphTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(modifier = Modifier.height(8.dp))
            Text(
                "Кошка",
                style = Typography.bodyLarge
            )
            Box(modifier = Modifier.height(8.dp))
            PrimaryRoundedButton("Кошка", false) {}
        }
    }
}