package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputWithState( // Этот инпут имеет свое внутренне состояние
    onChange: (newText: String) -> Unit
) {
    val (state, setState) = remember { mutableStateOf("") }
    TextField(value = state, onValueChange = setState)
}

@Composable
fun UserNameField(
    userId: String,
    onUserNameChange: (userName: String) -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        key (userId) { // Перерендериваем инпут когда меняется userId
            InputWithState(onChange = onUserNameChange)
        }
    }
}