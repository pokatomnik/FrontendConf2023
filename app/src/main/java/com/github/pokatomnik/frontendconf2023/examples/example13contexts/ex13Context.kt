package com.github.pokatomnik.frontendconf2023.examples.example13contexts

import androidx.compose.runtime.compositionLocalOf
import com.github.pokatomnik.frontendconf2023.examples.Theme
import com.github.pokatomnik.frontendconf2023.examples.ThemeId

val localThemeContext = compositionLocalOf {
    Theme(
        themeId = ThemeId.LIGHT,
        onThemeChange = {}
    )
}