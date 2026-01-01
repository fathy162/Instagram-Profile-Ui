package com.example.instagramui.profileScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun TabBarView(
    modifier: Modifier = Modifier,
    imageWithText: List<ImageWithText>,
    onTabSelected: (selectedTabIndex: Int) -> Unit,
) {
    var selectedTapIndex by remember {
        mutableIntStateOf(0)
    }
    val inActiveColor = Color(0xff777777)
    TabRow(
        selectedTabIndex = selectedTapIndex,
        modifier = modifier,
        containerColor = Color.Transparent,
        contentColor = Color.Black,
    ) {
        imageWithText.forEachIndexed { index, item ->

            Tab(
                selected = selectedTapIndex == index,
                selectedContentColor = Color.Black,
                unselectedContentColor = inActiveColor,
                onClick = {
                    selectedTapIndex = index
                    onTabSelected(index)
                }
            ) {
                Icon(
                    painter = item.image,
                    contentDescription = item.text,
                    tint = if (selectedTapIndex == index) Color.Black else inActiveColor,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(20.dp)
                )
            }
        }


    }
}

@Composable
fun PostSection(
    modifier: Modifier = Modifier, posts: List<Painter>
) {
    LazyVerticalGrid(
        GridCells.Fixed(3),

        modifier = modifier.scale(1.01f)
    ) {

        items(posts.size) {
            Image(
                painter = posts[it],
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(1f)
                    .border(width = 1.dp, color = Color.White)
            )
        }

    }
}
