package com.github.pokatomnik.frontendconf2023.examples.ex12key

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun StatefulInput() {
    val (value, setValue) = remember { mutableStateOf("") }
    BasicTextField(value = value, onValueChange = setValue)
}

@Composable
fun Example12Key() {
    val (inputKey, setInputKey) = remember { mutableStateOf(0) }
    val updateKey = { setInputKey(inputKey + 1) }
    Row {
        key(inputKey) {
            StatefulInput()
        }
        Button(onClick = updateKey) {
            Text("Refresh")
        }
    }
}
