/*package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.example.myapplication.ui.theme.AppTheme
import androidx.compose.ui.unit.dp
//import androidx.compose.foundation.layout.InsetAwareSwipeRefresh

@Composable
fun DotaScreen(){
    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    /*InsetAwareSwipeRefresh(
        isRefreshing = false,
        onRefresh = { },
    )   {*/
        LazyColumn(
            state = lazyListState,
            modifier = Modifier
                .fillMaxSize(),
        ) {
            item {
                DotaScreenHeader()
            }
            item {
                ScrollableChipsRow(
                    items = listof("MOBA", "MULTIPLAYER", "STRATEGY"),
                    chipContent = {}
                    modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                    contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
                )
                Text (
                    text = stringResource(id = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the 'Ancient', whilst defending their own."),
                    style = AppTheme.TextStyle.Regular_12_20,
                    color = AppTheme.TextColors.secondary,
                    modifier = Modifier.padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 14.dp,
                        bottom = 14.dp
                    )
                )
            }
            item {
                VideoPreviewRow(
                    previewResList = listOf(
                        R.drawable.video_preview1,
                        R.drawable.video_preview2,
                    ),
                    contentPadding = PaddingValues(start = 24.dp, end = 24. dp)
                )
                item {
                    Text(
                        text = stringResource(id = "Review & Ratings"),
                        style = AppTheme.TextStyle.Bold_16,
                        color = AppTheme.TextColors.primary,
                        modifier = Modifier.padding(
                            start = 24.dp,
                            end = 24.dp,
                            top = 20.dp,
                            bottom = 12.dp,
                        )
                    )
                    RatingBlock(
                        reviewsCount = "7OM",
                        modifier = Modifier.padding(
                            start = 24.dp,
                            end = 24.dp,
                            bottom = 16.dp,
                        )
                    )
                }
            }
            itemsIndexed (comments) { index, item ->
                CommentBlock(
                    item,
                    modifier = Modifier
                        .padding(
                            start = 24.dp,
                            end = 24.dp,
                            top = 16.dp,
                        )
                )
                if (index ‹ comments.lastIndex) {
                Divider(
                    color = AppTheme.BColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier.padding(top = 12.dp, bottom = 10.dp),
                )
                item {
                    PrimaryOvalButton(
                        text = stringResource("Install"),
                        onClick = {
                            Toast.makeText(context, text: "CLICKED", Toast.LENGTH_LONG).show()
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                    start = 24.dp,
                                    end = 24.dp,
                                    top = 20.dp,
                                    bottom = 40.dp,
                                )
                    )
                }
            }
            }
        //}

    }
}*/