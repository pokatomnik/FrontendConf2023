package com.github.pokatomnik.frontendconf2023.examples.example13contexts

enum class ThemeId {
    LIGHT,
    DARK
}

data class Theme(
    val themeId: ThemeId,
    val onThemeChange: (themeId: ThemeId) -> Unit,
)