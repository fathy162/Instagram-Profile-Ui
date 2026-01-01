import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow.Companion.Ellipsis
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramui.profileScreen.CircularImage
import com.example.instagramui.profileScreen.ImageWithText


@Composable
fun HighLightSection(
    modifier: Modifier = Modifier,
    highLights: List<ImageWithText>
) {

    LazyRow(
        modifier = Modifier.padding(top = 10.dp, start = 20.dp),
    ) {
        items(highLights.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(end = 15.dp)
            ) {
                CircularImage(
                    modifier = Modifier.size(70.dp),
                    image = highLights[it].image,
                )
                Text(
                    text = highLights[it].text,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    overflow = Ellipsis
                )
            }
        }
    }
}
