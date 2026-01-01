package com.example.instagramui.profileScreen


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ButtonSection(
    modifier: Modifier = Modifier,
) {
    val minWidth = 95.dp
    val height = 30.dp
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ActionButton(
            modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height),
            title = "Following",
            icon = Icons.Default.KeyboardArrowDown
        )
        ActionButton(
            modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height),
            title = "Message",
        )
        ActionButton(
            modifier = Modifier
                .defaultMinSize(minWidth = minWidth)
                .height(height),
            title = "Email",
        )
        ActionButton(
            modifier = Modifier
                .height(height),
            icon = Icons.Default.KeyboardArrowDown
        )


    }
}


@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    title: String? = null,
    icon: ImageVector? = null,
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(5.dp)
            )
    ) {


        if (title != null) {
            Text(
                text = title,
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        if (icon != null) {
            Icon(imageVector = icon, contentDescription = null, tint = Color.Black)
        }


    }

}