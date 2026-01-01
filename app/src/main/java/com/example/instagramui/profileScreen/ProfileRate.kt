package com.example.instagramui.profileScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramui.R

@Composable
fun ProfileRate(
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,

        modifier = modifier
            .fillMaxWidth()


    ) {
        CircularImage(
            modifier = Modifier.size(90.dp),
            image = painterResource(id = R.drawable.img1),
        )
        FollowDatils(
            numberOfRate = "15",
            text = "Posts",
        )
        FollowDatils(
            numberOfRate = "306.9K",
            text = "Followers",
        )
        FollowDatils(
            numberOfRate = "20",
            text = "Following",
        )
    }
}

@Composable
fun CircularImage(
    modifier: Modifier = Modifier,
    image: Painter,
) {

    Image(
        painter = image,
        contentDescription = "description",
        modifier = modifier
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .border(
                width = 1.dp, color = Color.LightGray, shape = CircleShape
            )
            .padding(3.dp)
            .clip(CircleShape)
    )


}


@Composable
fun FollowDatils(
    numberOfRate: String,
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 15.dp),

        ) {
        Text(
            text = numberOfRate,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            ),
            modifier = Modifier.padding(bottom = 5.dp)
        )
        Text(
            text = text,
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            ),

            )
    }


}