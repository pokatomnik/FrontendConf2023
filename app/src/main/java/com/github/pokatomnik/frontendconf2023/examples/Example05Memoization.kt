package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

/**
 * React Example
 * ```typescript
 * const Example05Memoization = ({ list }: { readonly list: Array<number> }) => {
 *   const total = React.useMemo(() => {
 *     return list.reduce((acc, current) => acc + current, 0);
 *   }, [list]);
 *
 *   return <span>Current total is {total}</span>
 * }
 * ```
 */

/**
 * Jetpack Compose
 */
@Composable
fun Example05Memoization(
    list: Collection<Int>
) {
    /**
     * `list` в данном случае один из deps.
     * результат выполнения функции будет пересчитываться каждый раз когда
     * приходит новый list ("строгое" равенство)
     */
    val total = remember(list) {
        list.fold(0) { acc, current -> acc + current }
    }

    Text("Current total is: $total")
}