package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.border
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import com.example.myapplication.ui.theme.AppTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent{
            //MainScreen()
            Main()
        }
    }
}

@Composable
fun Main() {
    // фон
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
    }

        //заставка
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(296.dp)
        )

        Row(
            modifier = Modifier
                .padding(start = 24.dp)
        ){//логотип
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(88.dp)
                .border(
                    1.dp,
                    Color.Gray,
                    RoundedCornerShape(15.dp)
                )
                .clip(RoundedCornerShape(15.dp))
                .background(Color.Black)
        ){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(54.dp)
            )
        }

            //название
        Column ( modifier = Modifier
            .padding(start = 12.dp)
        ) {
            Text(text = "DoTA 2", fontSize = 20.sp, color = Color.White, modifier = Modifier.padding(top = 37.dp, bottom = 7.dp))
            Row(){
            Image(
                painter = painterResource(id = R.drawable.stars),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .height(12.dp)
                    .width(76.dp)
            )
                Text(text = "70M", fontSize = 12.sp,color = Color.Gray)
            }

        }
    }

        // скролл меню
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
            ){
            Row(modifier = Modifier
                .padding(top = 16.dp, start = 24.dp, end = 10.dp)
                .height(22.dp)
                .width(53.dp)
                .clip(shape = RoundedCornerShape(size = 11.dp))
                .background(Color.Gray),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){Text(text = "MOBA", fontSize = 10.sp, color= Color.White)}

            Row(modifier = Modifier
                .padding(top = 16.dp, end = 10.dp)
                .height(22.dp)
                .width(93.dp)
                .clip(shape = RoundedCornerShape(size = 11.dp))
                .background(Color.Gray),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){Text(text = "MULTIPLAYER", fontSize = 10.sp, color= Color.White)}

            Row(modifier = Modifier
                .padding(top = 16.dp, end = 24.dp)
                .height(22.dp)
                .width(73.dp)
                .clip(shape = RoundedCornerShape(size = 11.dp))
                .background(Color.Gray),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){Text(text = "STRATEGY", fontSize = 10.sp, color= Color.White)}
        }

        // описание
        Row(
            modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 24.dp,
                    bottom = 14.dp
                )
        ) {
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the 'Ancient', whilst defending their own.",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }

        // скролл видео
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxWidth()
                .height(150.dp)
                .padding(start = 24.dp, top = 15.dp)
            ){
            Image(painter = painterResource(id = R.drawable.video_preview1), contentDescription = null, contentScale = ContentScale.Fit,modifier = Modifier.clip(RoundedCornerShape(10.dp)))
            Image(painter = painterResource(id = R.drawable.video_preview2), contentDescription = null, contentScale = ContentScale.Fit,modifier = Modifier.clip(RoundedCornerShape(10.dp)))
        }

        //рейтинг
        Column(
            modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 20.dp,
                    bottom = 12.dp,
                )
        ) {
            Text(text = "Review & Ratings", fontSize = 16.sp, color= Color.White)
        }
        Row(
            modifier = Modifier
                .padding(
                    start = 24.dp
                )
        ){
            Text(text = "4.9", fontSize = 48.sp, fontWeight = FontWeight.Bold, color= Color.White)
            Column (
                modifier = Modifier
                    .padding(
                        start = 16.dp
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rating),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(
                            top = 17.dp,
                            bottom = 8.dp
                        )
                        .height(12.dp)
                        .width(76.dp)
                )
                Text(text = "70M Reviews", fontSize = 12.sp, color= Color.Gray)
            }
         }

        // комментарий
        Column  (
            modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp
                )
        ) {
            Row () {
                Image(
                    painter = painterResource(id = R.drawable.avatar1),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(
                            top = 30.dp,
                            bottom = 18.dp
                        )
                        .size(36.dp)
                        .clip(RoundedCornerShape(18.dp))
                )
                Column(){
                    Column(
                        modifier = Modifier
                            .padding(
                                start = 16.dp,
                                end = 24.dp,
                                top = 30.dp,
                                bottom = 7.dp
                            )
                    ){Text(text = "Auguste Conte", fontSize = 12.sp, color= Color.White)}
                    Column(
                        modifier = Modifier
                            .padding(
                                start = 16.dp,
                                end = 24.dp
                            )
                    ){Text(text = "February 14, 2019", fontSize = 12.sp, color= Color.Gray)}
                }
            }
            Text(text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”", fontSize = 12.sp, color= Color.Gray)
        }

        // линия
        Column (
            modifier = Modifier
                .padding(
                    start = 38.dp,
                    top = 25.dp,
                    end = 38.dp,
                    bottom = 25.dp
                )
                .height(0.5.dp)
                .width(300.dp)
                .background(Color.Gray)
        ) { }


        // второй комментарий
        Column  (
            modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp
                )
        ) {
            Row () {
                Image(
                    painter = painterResource(id = R.drawable.avatar2),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(
                            bottom = 18.dp
                        )
                        .size(36.dp)
                        .clip(RoundedCornerShape(18.dp))
                )
                Column() {
                    Column(
                        modifier = Modifier
                            .padding(
                                start = 16.dp,
                                end = 24.dp,
                                bottom = 7.dp
                            )
                    ){Text(text = "Jang Marcelino", fontSize = 12.sp, color= Color.White)}
                    Column(
                        modifier = Modifier
                            .padding(
                                start = 16.dp,
                                end = 24.dp
                            )
                    ){Text(text = "February 14, 2019", fontSize = 12.sp, color= Color.Gray)}
                }
            }
            Text(text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”", fontSize = 12.sp, color= Color.Gray)
        }

        // кнопка
        Row(
            modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 20.dp,
                    bottom = 60.dp,
                )
                .height(64.dp)
                .width(327.dp)
                .clip(shape = RoundedCornerShape(size = 12.dp))
                .clickable { }
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Install",
                fontSize = 20.sp,
            )
        }

    }
}

@Preview
@Composable
fun MainActivityPreview() {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        Main()
    }
}



