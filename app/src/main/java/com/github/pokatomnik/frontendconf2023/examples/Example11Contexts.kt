package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

enum class ThemeId {
    LIGHT,
    DARK
}

data class Theme(
    val themeId: ThemeId,
    val onThemeChange: (themeId: ThemeId) -> Unit,
)

/**
 * ```typescript
 * const ThemeContext = React.createContext<Theme>({
 *   themeId: ThemeId.LIGHT,
 *   onThemeChange: () => {}
 * })
 * ```
 */
private val localThemeContext = compositionLocalOf {
    Theme(
        themeId = ThemeId.LIGHT,
        onThemeChange = {}
    )
}

/**
 * ```typescript
 * const ThemeProvider = ({ children }: React.PropsWithChildren<object>) => {
 *   const [themeId, setThemeId] = React.useState<ThemeId>(ThemeId.LIGHT)
 *   const themeContextValue = React.useMemo(() => ({
 *     themeId,
 *     onThemeChange: setThemeId
 *   }), [themeId])
 *   return (
 *     <ThemeContext.Provider value={themeContextValue}>
 *       {children}
 *     </ThemeContext.Provider>
 *   );
 * }
 * ```
 */
@Composable
fun ThemeProvider(children: @Composable () -> Unit) {
    val (themeId, setThemeId) = remember { mutableStateOf(ThemeId.LIGHT) }
    val themeContextValue = remember(themeId) {
        Theme(
            themeId = themeId,
            onThemeChange = setThemeId
        )
    }
    CompositionLocalProvider(localThemeContext provides themeContextValue) {
        children()
    }
}

/**
 * ```typescript
 * const useTheme = () => {
 *   return React.useContext(ThemeContext);
 * }
 * ```
 */
@Composable
fun useTheme(): Theme {
    return localThemeContext.current
}