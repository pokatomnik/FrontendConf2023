package com.github.pokatomnik.frontendconf2023.examples.ex02functioncall

import android.util.Log
import com.github.pokatomnik.frontendconf2023.examples.ex01functions.SomeClass
import com.github.pokatomnik.frontendconf2023.examples.ex01functions.example

fun run01() {
    example(
        1,
        "hello",
        true,
        SomeClass("world")
    ) { result ->
        Log.d("RESULT", result)
    }
}