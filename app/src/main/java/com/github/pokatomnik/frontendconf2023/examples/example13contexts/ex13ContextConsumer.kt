package com.github.pokatomnik.frontendconf2023.examples.example13contexts

import androidx.compose.runtime.Composable
@Composable
fun useTheme(): Theme {
    return localThemeContext.current
}