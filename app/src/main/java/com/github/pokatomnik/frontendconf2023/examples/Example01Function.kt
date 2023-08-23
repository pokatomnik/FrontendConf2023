package com.github.pokatomnik.frontendconf2023.examples

import android.util.Log

/**
 * Простой класс с данными и 1 методом
 * Private -- класс доступен только внутри этого файла
 */
private data class Foo( // конструктор по умолчанию
    /**
     * `val` говорит о том что аргумент `value` должен
     * стать публичным неперезаписываемым полем
     */
    val value: String
) {
    /**
     * Если метод класса перезаписывает метод класса-родителя,
     * то нужно помечать такие методы `override`
     */
    override fun toString(): String { // Возвращает `String`
        return "Value is $value"
    }
}

/**
 * `fun` = `function` из Typescript
 * Private -- функция доступна только внутри этого файла
 */
private fun simpleFunction(
    a: Int, // Аргумент-целое число
    b: String?, // Аргумент-nullable строка
    c: Boolean = false, // Аргумент-true/false со значением по умолчанию
    d: Foo?, // Аргумент-инстанс класса Foo, nullable
    /**
     * Аргумент-колбек, который принимает строку и не возвращает ничего
     * Имеет значение по умолчанию
     */
    callback: (result: String) -> Unit = { },
): Unit {
    // Строки-шаблоны, фигурные скобки можно не указывать, так как извлекать через точку ничего не надо
    val result = "$a, $b, $c,"
    // Вызываем колбек
    callback(
        "$result ${d?.value}" // Извлекаем через точку, фигурные скобки обязательны
    )
}

// Нет модификатора доступа - функция доступна отовсюду
fun Example() {
    // Вариант 1, ОБЫЧНЫЙ
    simpleFunction(
        42,
        "Hello, World!",
        true,
        Foo("The Value"), // Конструктор `Foo` вызывается БЕЗ `new`!

        /**
         * Колбек, в обрамляется фигурными скобками, аргументы разделяются запятыми,
         * Код и аргументы разделяются стрелкой `->`
         */
        { result, ->
            Log.d("RESULT", result)
        }
    )

    // Вариант 2, САХАРНЫЙ
    simpleFunction(
        42,
        null,
        true,
        Foo("The Value"),
    ) { // Если функция передается последним элементом, то ее можно вынести за скобки
        Log.d("RESULT", it) // Если аргумент 1 и он не указан, то он имеет alias `it`
    }

    // Вариант 3, ЯВНЫЙ
    simpleFunction(
        a = 42, // Указываем все аргументы по именам. Те, которые отсутствуют могут не указываться
        b = "Hello, World",
        // c = true, // Пропускаем `c`
        d = Foo(
            value = "Hello, World"
        ),
        callback = {
            Log.d("RESULT", it)
        }
    )
}