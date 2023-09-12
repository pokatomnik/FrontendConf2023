package com.github.pokatomnik.frontendconf2023.examples.ex08sideeffects

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

fun toastStub(message: String) {
    // Показываем здесь сообщение
}

@Composable
fun useToast(message: String) {
    LaunchedEffect(message) {
        toastStub(message)
    }
}