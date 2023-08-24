package com.github.pokatomnik.frontendconf2023.examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

data class User(
    val firstName: String,
    val lastName: String,
    val middleName: String? = null
)

@Composable
fun Example09Lists(list: Collection<User>) {
    Column(modifier = Modifier.fillMaxSize()) {
        list.forEach { user -> // .map нам не нужен, так как мы не возвращаем ничего
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