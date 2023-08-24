package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Example08ConditionalRendering(
    userName: String?,
    total: Int?,
) {
    Row(modifier = Modifier.fillMaxWidth().height(48.dp)) { // Сделаем вид что это хедер
        if (userName != null) {
            Text(text = userName) // Вот тут тип userName -- String а не String?
        }
        Text(text = if (total == null) "Empty" else "Total: $total") // if является выражением
    }
}