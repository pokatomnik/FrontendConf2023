package com.github.pokatomnik.frontendconf2023.examples.ex11lists

data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val middleName: String? = null
)