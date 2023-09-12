package com.github.pokatomnik.frontendconf2023.examples.ex00classes

class Example(
    private val foo: Int,
    var bar: String,
    baz: Boolean = false,
) {
    override fun toString(): String {
        return "$foo $bar"
    }
}
