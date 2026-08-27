package com.meow.roommorph.screens.general.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.meow.roommorph.R
import com.meow.roommorph.ui.theme.CardDark
import com.meow.roommorph.ui.theme.PrimaryCyanDark
import com.meow.roommorph.ui.theme.TextWhite
import com.meow.roommorph.ui.theme.RoomMorphTheme
import com.meow.roommorph.ui.theme.TextBlack

@Composable
fun PresetSelector(
    modifier: Modifier = Modifier
) {
    var scrollState = rememberScrollState()
    Row(
        modifier = modifier
            .horizontalScroll(scrollState),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        PresetItem(
            "",
            "Английский",
            painterResource(R.drawable.test_room),
            true,
            {}
        )
        PresetItem(
            "",
            "Английский",
            painterResource(R.drawable.test_room),
            false,
            {}
        )
        PresetItem(
            "",
            "Английский",
            painterResource(R.drawable.test_room),
            false,
            {}
        )
    }
}

@Composable
fun PresetItem(
    id: String,
    text: String,
    painter: Painter,
    isSelected: Boolean,
    onClick: () -> Unit
) {

    val containerColor by animateColorAsState(
        targetValue = if (isSelected) PrimaryCyanDark else CardDark,
        animationSpec = tween(durationMillis = 200),
        label = "cardContainerColor"
    )

    val textColor by animateColorAsState(
        targetValue = if (isSelected) TextBlack else TextWhite,
        animationSpec = tween(durationMillis = 200),
        label = "cardTextColor"
    )

    Card(
        modifier = Modifier
            .width(96.dp)
            .height(148.dp),
        colors = CardDefaults.cardColors(
            containerColor = containerColor
        ),
        elevation = CardDefaults.elevatedCardElevation(0.dp),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(8.dp)),
                painter = painter,
                contentDescription = ""
            )
            Box(modifier = Modifier.height(4.dp))
            Text(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp),
                text = text,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                color = textColor,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
                maxLines = 3,
            )
        }
    }
}

@Preview
@Composable()
fun PresetSelectorPreview() {
    RoomMorphTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            PresetSelector()
        }
    }
}