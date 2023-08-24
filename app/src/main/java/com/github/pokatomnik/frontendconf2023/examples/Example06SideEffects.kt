package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun showToast(message: String) {
    // Тут должен показываться Toast
}

@Composable
fun Example06LaunchedEffect(someValue: Int) {
    // Запускаем сайдэффект когда нам "пришло" новое значение
    LaunchedEffect(someValue) {
        showToast("Current value changed to $someValue") // Показываем toast
    }

    // Хедер, например
    Row(modifier = Modifier.fillMaxWidth().height(48.dp)) {
        Text(text = "Current value: $someValue") // Показываем тут текущее значение
    }
}