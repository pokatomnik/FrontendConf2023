package com.github.pokatomnik.frontendconf2023.examples.ex07memoization

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun Example07Memoization(
    list: Collection<Int>
) {
    val total = remember(list) {
        list.fold(0) { acc, current -> acc + current }
    }
    Row {
        Text("Всего: $total")
    }
}
