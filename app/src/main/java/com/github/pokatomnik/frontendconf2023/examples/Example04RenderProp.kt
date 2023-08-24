package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

/**
 * ```typescript
 * const Example04RenderProp = <T extends unknown & {}>({
 *   initialValue,
 *   children
 * }: {
 *   readonly initialValue: T,
 *   readonly children: (
 *     value: T;
 *     setValue: (value: T) => void;
 *   ) => React.ReactNode;
 * }) => {
 *   const [value, setValue] = React.useState(initialState);
 *   return (
 *     <>
 *       children(value, setValue)
 *     </>
 *   );
 * }
 * ```
 */

// Jetpack Compose
@Composable
fun <T : Any>Example04RenderProp(
    initialValue: T,
    children: @Composable (
        value: T,
        setValue: (newValue: T) -> Unit
    ) -> Unit
) {
    val (value, setValue) = remember { mutableStateOf(initialValue) }
    children(
        value = value,
        setValue = setValue
    )
}