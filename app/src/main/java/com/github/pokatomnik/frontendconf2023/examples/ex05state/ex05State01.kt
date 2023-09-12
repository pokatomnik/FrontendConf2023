package com.github.pokatomnik.frontendconf2023.examples.ex05state

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun Example02State01() {
    val clicksState = remember { mutableStateOf(0) }
    val incrementClicks = {
        clicksState.value += 1
    }
    Button(onClick = incrementClicks) {
        Text("Кликнуто ${clicksState.value} раз")
    }
}