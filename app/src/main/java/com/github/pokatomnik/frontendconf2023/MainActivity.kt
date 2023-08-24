package com.github.pokatomnik.frontendconf2023

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.pokatomnik.frontendconf2023.ui.theme.FrontendConf2023Theme

// Активити - окно, Window в терминах веба. У него есть свой lifecycle, их может быть много
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // Запускаем наше Jetpack Compose приложение тут
        super.onCreate(savedInstanceState) // восстанавливаем состояние если оно было сохранено ранее
        /**
         * Аналог createRoot / ReactDOM.render
         * Передает рутовый Jetpack Compose компонент в активити, заставляя ее рендерить этот компонент
         */
        setContent {
            FrontendConf2023Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FrontendConf2023Theme {
        Greeting("Android")
    }
}