package com.example.instagramui.profileScreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
            .fillMaxWidth()
        ,
    ) {

        Icon(
            modifier = Modifier,
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "back icon",
            tint = Color.Black,

            )
        Text(
            text = "FathiMohamed561",
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp),
            color = Color.Black,
            overflow = TextOverflow.Ellipsis
        )

        Icon(
            modifier = Modifier,
            imageVector = Icons.Outlined.Notifications,
            contentDescription = "back icon",
            tint = Color.Black,

            )
        Icon(
            modifier = Modifier,
            imageVector = Icons.Outlined.MoreVert,
            contentDescription = "back icon",
            tint = Color.Black,

            )
    }

}