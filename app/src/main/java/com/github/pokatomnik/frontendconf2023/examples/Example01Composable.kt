package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable // Темная магия Jetpack compose
fun Example01Composable( // Только функциональные компоненты, никаких классов
    /**
     * Список пропсов. Списком. Объекта props нет.
     */
    title: String,
    onClick: () -> Unit
) { // Обратите внимание, фукнция ничего не возвращает, так надо.
    Row {// Как <div /> `display: flex; flex-direction: row;`
        Column { // Как <div /> `display: flex; flex-direction: column;`
            Text(text = title) // Как <span /> / <p /> / <hN />
        }
        Column {
            Button(onClick = onClick) { // Как <button />
                Text(text = "Нажми меня!")
            }
        }
    }
}