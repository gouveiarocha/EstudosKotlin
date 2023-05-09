package com.example.gouveiarocha.estudoskotlin.Paralelos.Estudos.Kotlin.KOAN

fun main() {

    println(useFoo())

}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)