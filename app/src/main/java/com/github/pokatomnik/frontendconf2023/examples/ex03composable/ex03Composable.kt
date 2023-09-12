package com.github.pokatomnik.frontendconf2023.examples.ex03composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Example03Composable(
    title: String,
    onClick: () -> Unit
) {
    Row {
        Column {
            Text(text = title)
        }
        Column {
            Button(onClick = onClick) {
                Text(text = "Нажми меня!")
            }
        }
    }
}