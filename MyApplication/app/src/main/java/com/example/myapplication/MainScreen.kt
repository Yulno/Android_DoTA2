/*@file:Suppress("DEPRECATION")

package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.AppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun MainScreen(){
    MaterialTheme {

        ApplySystemBarColors()

        Surface(
            color = AppTheme.BgColors.primary,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ){
            DotaScreen()
        }
    }
}

@Composable
private fun ApplySystemBarColors() {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setStatusBarColor(color = Color.Transparent)
        systemUiController.setNavigationBarColor(color = Color.Transparent)
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        MainScreen()
    }
}*/