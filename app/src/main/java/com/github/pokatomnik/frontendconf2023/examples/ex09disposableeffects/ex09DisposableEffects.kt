package com.github.pokatomnik.frontendconf2023.examples.ex09disposableeffects

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect

fun toastStub(message: String) {
    // Показываем здесь сообщение
}

interface PubSub {
    fun subscribe(
        subscriber: (value: String) -> Unit
    ): () -> Unit
}

@Composable
fun useShowToast(pubSub: PubSub) {
    DisposableEffect(pubSub) {
        val unsubscribe = pubSub.subscribe(::toastStub)
        onDispose(unsubscribe)
    }
}
