package com.github.pokatomnik.frontendconf2023.examples.ex02functioncall

import android.util.Log
import com.github.pokatomnik.frontendconf2023.examples.ex01functions.SomeClass
import com.github.pokatomnik.frontendconf2023.examples.ex01functions.example

fun run02() {
    example(
        a = 1,
        b ="hello",
        c = true,
        foo = SomeClass("world"),
        callback = { result ->
            Log.d("RESULT", result)
        }
    )
}