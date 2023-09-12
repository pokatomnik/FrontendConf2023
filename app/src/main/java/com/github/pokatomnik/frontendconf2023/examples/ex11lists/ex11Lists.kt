package com.github.pokatomnik.frontendconf2023.examples.ex11lists

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Example11Lists(list: Collection<User>) {
    Column(modifier = Modifier.fillMaxSize()) {
        list.forEach { user ->
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = user.firstName)
                Text(text = user.lastName)
                if (user.middleName != null) {
                    Text(text = user.middleName)
                }
            }
        }
    }
}