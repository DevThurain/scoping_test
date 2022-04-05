package com.thurainx.scopingtest.features

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen(viewModel: FirstScreenViewModel) {
    Scaffold {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            Column {
                Text(text = viewModel.name.value)
                Spacer(modifier = Modifier.height(12.dp))
                TextButton(onClick = {
                    viewModel.name.value = "Thurain"
                }) {
                    Text(text = "Save User")
                }
            }
        }
    }

}