package com.github.pokatomnik.frontendconf2023.examples.ex06renderprop

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun <T : Any>Example06RenderProp(
    initialState: T,
    children: @Composable (
        value: T,
        setValue: (value: T) -> Unit
    ) -> Unit
) {
    val (value, setValue) = remember {
        mutableStateOf(initialState)
    }
    Row {
        children(value, setValue)
    }
}