package com.github.pokatomnik.frontendconf2023.examples.ex05state

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun Example02State00() {
    val (clicked, setClicks) = remember { mutableStateOf(0) }
    val incrementClicks = { setClicks(clicked + 1) }
    Button(onClick = incrementClicks) {
        Text("Кликнуто $clicked раз")
    }
}