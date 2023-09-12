package com.github.pokatomnik.frontendconf2023.examples.ex05state

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun Example02State02() {
    var clicked by remember { mutableStateOf(0) }
    val incrementClicks = { clicked += 1 }
    Button(onClick = incrementClicks) {
        Text("Кликнуто $clicked раз")
    }
}