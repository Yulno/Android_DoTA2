/*package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyRow
import com.example.myapplication.ui.theme.AppTheme

@Composable
fun ScrollableChipsRow (

) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = Modifier,
    ) {
        items(items) { item ->
            Chip(
                content = { chipContent(item) },
                paddingValues = chipPaddingValues,
                backgroundColor = AppTheme.BgColors.secondary,
            )
        }
    }
}*/