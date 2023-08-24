package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun Example01Styles_React_way(
    title: String,
) {
    /**
     * Эквивалент коду
     * ```
     * const [times, setTimes] = React.useState(0);
     * ```
     * remember + mutableStateOf = React.useState
     */
    val (times, setTimes) = // Деструкция тут тоже есть, но работает немного по-другому
        remember { // remember - аналог useMemo
            mutableStateOf(0) // Создает состояние типа Int, иммутабельное.
        }

    /**
     * Создаем колбек-обрабочик нажатия на кнопку, указывая его тип
     */
    val increase: () -> Unit = {
        setTimes(times + 1)
    }

    Row {
        Column {
            Text(text = title)
        }
        Column {
            Button(onClick = increase) { // Передаем обработчик, как в реакте!
                Text(text = "Нажато $times раз") // При изменении запустится рекомпозиция
            }
        }
    }
}

@Composable
fun Example01Styles_Mobx_way(
    title: String,
) {
    val timesState = // Объект, содержащий в себе состояния и апдейтер, ссылка сохраняется
        remember {
            mutableStateOf(0)
        }

    /**
     * Создаем колбек-обрабочик нажатия на кнопку, указывая его тип
     */
    val increase: () -> Unit = {
        timesState.value += 1 // Мутируем value. ВНИМАНИЕ, value ДОЛЖЕН быть иммутабельным!
    }

    Row {
        Column {
            Text(text = title)
        }
        Column {
            Button(onClick = increase) { // Передаем обработчик, как в реакте!
                Text(text = "Нажато ${timesState.value} раз") // При изменении запустится рекомпозиция
            }
        }
    }
}

@Composable
fun Example01Styles_Sugar_way(
    title: String,
) {
    /**
     * Делегируем инициализацию функции.
     * Состояние будет проинициализировано при первом обращении
     */
    var times by remember { mutableStateOf(0) }

    /**
     * Создаем колбек-обрабочик нажатия на кнопку, указывая его тип
     */
    val increase: () -> Unit = {
        times += 1 // И даже так!
    }

    Row {
        Column {
            Text(text = title)
        }
        Column {
            Button(onClick = increase) { // Передаем обработчик, как в реакте!
                Text(text = "Нажато ${times} раз") // При изменении запустится рекомпозиция
            }
        }
    }
}
