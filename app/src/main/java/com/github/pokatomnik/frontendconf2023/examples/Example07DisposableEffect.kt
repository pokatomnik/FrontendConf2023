package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

interface PubSub {
    fun subscribe(subscriber: (value: String) -> Unit): Subscription
}

interface Subscription {
    fun unsubscribe(): Unit
}

@Composable
fun Example07DisposableEffect(
    pubSub: PubSub
) {
    val (state, setState) = remember { mutableStateOf("") }

    DisposableEffect(pubSub) {
        val subscription = pubSub.subscribe { message -> // Сначала подписываемся
            setState(message)
        }

        onDispose {
            subscription.unsubscribe() // Отписываемся когда меняется pubSub
        }
    }

    return Text(text = state)
}
