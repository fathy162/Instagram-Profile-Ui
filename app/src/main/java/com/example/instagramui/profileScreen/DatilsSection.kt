package com.example.instagramui.profileScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DatilsSection(

    title: String,
    description: String,
    url: String,
    followedBy: List<String>,
    otherCount: Int,
) {
    val letterSpacing = 0.5.sp
    val lineHeight = 20.sp

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {

        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        )
        Text(
            text = description,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        )
        Text(
            text = url,
            fontSize = 13.sp,
            color = Color(0xFF0233F6),
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        )

        Text(
            text = buildAnnotatedString {
                if (followedBy.isNotEmpty()) {
                    val boldStyle = SpanStyle(
                        color = Color.Black, fontWeight = FontWeight.Bold
                    )
                    append("Followed by ")
                    followedBy.forEachIndexed { index, name ->
                        pushStyle(boldStyle)
                        append(name)
                        pop()
                        if (index < followedBy.size - 1) {
                            append(" , ")
                        }
                    }
                    if (otherCount > 2) {
                        append(" and ")
                        pushStyle(boldStyle)
                        append(
                            "$otherCount others"
                        )
                    }
                }
            },
            fontSize = 15.sp,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        )

    }

}