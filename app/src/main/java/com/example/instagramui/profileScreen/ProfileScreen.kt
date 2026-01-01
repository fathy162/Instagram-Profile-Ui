package com.example.instagramui.profileScreen

import HighLightSection
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instagramui.R.drawable

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
) {
    var selectedTapIndex by remember {
        mutableIntStateOf(0)
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 50.dp),
    ) {
        TopBar()
        Spacer(modifier = Modifier.size(10.dp))
        ProfileRate()
        Spacer(modifier = Modifier.size(10.dp))
        DatilsSection(
            title = "Fathi Mohamed",
            description = "I Am Fathi\n" + "🔽And I am NCO in EG.ARMY💪👮✨",
            url = "https://github.com/FathiMohamed561",
            followedBy = listOf("Ahmed Fathy", "Abdalla Fathi", "Islam Kalide"),
            otherCount = 70
        )
        Spacer(modifier = Modifier.size(10.dp))
        ButtonSection()
        Spacer(modifier = Modifier.size(10.dp))
        HighLightSection(
            highLights = listOf(
                ImageWithText(image = painterResource(drawable.img1), text = "Ahmed Fathy"),
                ImageWithText(image = painterResource(drawable.img2), text = "Abdalla Fathy"),
                ImageWithText(image = painterResource(drawable.img9), text = "ISlam khaled"),
                ImageWithText(image = painterResource(drawable.img4), text = "Ahmed Fathy"),
                ImageWithText(image = painterResource(drawable.img5), text = "Abdalla Fathy"),
                ImageWithText(image = painterResource(drawable.img6), text = "Islam&Fathy"),
                ImageWithText(image = painterResource(drawable.img1), text = "Ahmed Fathy"),
                ImageWithText(image = painterResource(drawable.img2), text = "Abdalla Fathy"),
                ImageWithText(image = painterResource(drawable.img9), text = "ISlam khaled"),
                ImageWithText(image = painterResource(drawable.img4), text = "Ahmed Fathy"),
                ImageWithText(image = painterResource(drawable.img5), text = "Abdalla Fathy"),
                ImageWithText(image = painterResource(drawable.img6), text = "Islam&Fathy"),
            )
        )
        Spacer(modifier = Modifier.size(10.dp))
        TabBarView(
            imageWithText = listOf(
                ImageWithText(
                    image = painterResource(id = drawable.ic_grid), text = "Posts"
                ),
                ImageWithText(
                    image = painterResource(id = drawable.ic_reels), text = "Reels"
                ),
                ImageWithText(
                    image = painterResource(id = drawable.ic_igtv), text = "IGTV"
                ),
                ImageWithText(
                    image = painterResource(id = drawable.ic_profile), text = "profile"
                ),
            ),
            modifier = Modifier.fillMaxWidth(),
        ) {
            selectedTapIndex = it
        }
        when (selectedTapIndex) {
            0 -> PostSection(
                posts = listOf(
                    painterResource(id = drawable.img1),
                    painterResource(id = drawable.img2),
                    painterResource(id = drawable.img3),
                    painterResource(id = drawable.img4),
                    painterResource(id = drawable.img5),
                    painterResource(id = drawable.img6),
                    painterResource(id = drawable.img7),
                    painterResource(id = drawable.img8),
                    painterResource(id = drawable.img9),
                    painterResource(id = drawable.img10),
                    painterResource(id = drawable.img1),
                    painterResource(id = drawable.img2),
                    painterResource(id = drawable.img3),
                    painterResource(id = drawable.img4),
                    painterResource(id = drawable.img5),
                    painterResource(id = drawable.img6),
                    painterResource(id = drawable.img7),
                    painterResource(id = drawable.img8),
                    painterResource(id = drawable.img9),
                    painterResource(id = drawable.img10)
                ), modifier = Modifier.fillMaxSize()
            )
        }

    }
}
