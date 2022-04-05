package com.thurainx.scopingtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.thurainx.scopingtest.features.FirstScreen
import com.thurainx.scopingtest.features.FirstScreenViewModel
import com.thurainx.scopingtest.features.HomeScreen
import com.thurainx.scopingtest.features.HomeViewModel
import com.thurainx.scopingtest.ui.theme.ScopingTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            ScopingTestTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "home_screen") {
                    composable("home_screen") {
                        HomeScreen(navController = navController)
                    }
                    composable("first_screen") {
                        val navigationGraphEntry = remember {
                            navController.getBackStackEntry("first_screen")
                        }
                        val navigationGraphScopedViewModel : FirstScreenViewModel = viewModel(navigationGraphEntry)
                       // val viewModel = FirstScreenViewModel()
                        FirstScreen(viewModel = navigationGraphScopedViewModel)
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScopingTestTheme {
        Greeting("Android")
    }
}