/*package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AppTheme
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.TransparentDarkBlue

@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier,
) {
    HeaderBackground(
        painter = painterResource(R.drawable.header),
        modifier = Modifier
            .fillMaxWidth()
            .height(296.dp)
    )
    DotaLogo(
        painter = painterResource(R.drawable.logo),
        modifier = Modifier
            .padding(41.dp)
    )
    Dota(
        painter = painterResource(R.drawable.stars),
        modifier = Modifier
            .padding(horizontal = 124.dp,
                vertical = 16.dp)
    )
}

@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    //content: @Composable () -> Unit,
) {
    Box(modifier = modifier){
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun DotaLogo(
    painter: Painter,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(top = 274.dp, start = 21.dp)
            .size(88.dp)
            .border(
                2.dp,
                Color.Gray,
                RoundedCornerShape(15.dp)
            )
            .clip(RoundedCornerShape(15.dp))
            .background(Color.Black)

    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .size(54.dp)
        )
    }
}

@Composable
private fun Dota(
    painter: Painter,
    modifier: Modifier = Modifier,
){
    Box(modifier = modifier){
        Text(
            text = "DoTA 2",
            fontSize = 20.sp,
            color = Color.White
        )
        Image(
            painter = painterResource(id = R.drawable.stars),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    top = 341.dp,
                    start = 12.dp)
        )
    }
}


@Preview
@Composable
fun DotaScreenHeaderPreview() {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        DotaScreenHeader()
    }
}
*/