package com.github.pokatomnik.frontendconf2023.examples.example13contexts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun ThemeProvider(children: @Composable () -> Unit) {
    val (themeId, setThemeId) = remember {
        mutableStateOf(ThemeId.LIGHT)
    }
    val themeContextValue = remember(themeId) {
        Theme(
            themeId = themeId,
            onThemeChange = setThemeId
        )
    }
    CompositionLocalProvider(
        localThemeContext provides themeContextValue
    ) {
        children()
    }
}