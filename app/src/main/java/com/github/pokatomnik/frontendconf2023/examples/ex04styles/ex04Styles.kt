package com.github.pokatomnik.frontendconf2023.examples.ex04styles

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Example04Styles(
    title: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(start = 4.dp, end = 16.dp)
            .then(modifier)
    ) {
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