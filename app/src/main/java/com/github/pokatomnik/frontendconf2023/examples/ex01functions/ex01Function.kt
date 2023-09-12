package com.github.pokatomnik.frontendconf2023.examples.ex01functions

data class SomeClass(val value: String)

fun example(
    a: Int,
    b: String?,
    c: Boolean = false,
    foo: SomeClass?,
    callback: (result: String) -> Unit,
) {
    val result = "$a, $b, $c,"
    callback("$result ${foo?.value}")
}