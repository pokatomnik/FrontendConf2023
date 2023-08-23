package com.github.pokatomnik.frontendconf2023.examples

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
fun Example01Styles(
    title: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier // Сначала применяем необходимые стили этого компонента
            // flex: 1
            .fillMaxSize()
            // background-color: blue
            .background(Color.Blue)
            // Одновременно и margin и padding
            // margin-left: 4px; margin-right: 16px;
            .padding(
                /**
                 * dp -- функция-расширение у типа Int.
                 * Device-independent pixels.
                 */
                start = 4.dp,
                end = 16.dp
            )
            .then(modifier) // Применяем пользовательские стили, переданные через "prop"
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