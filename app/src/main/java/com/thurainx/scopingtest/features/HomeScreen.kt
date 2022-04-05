package com.thurainx.scopingtest.features

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column {
                TextButton(onClick = {
                    navController.navigate("first_screen")
                }) {
                    Text(text = "go to First Screen")
                }
//                TextButton(onClick = {
//                    navController.navigate()
//                }) {
//                    Text(text = "go to Second Screen")
//                }
            }
        }
    }

}