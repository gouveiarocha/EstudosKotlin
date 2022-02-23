package com.example.gouveiarocha.estudoskotlin.Livro_KotlinEmAcao.cap2_basico

import java.lang.Exception
import com.example.gouveiarocha.estudoskotlin.Livro_KotlinEmAcao.cap2_basico.Colors.*

/**
 * Classes enum e Expressão 'when'
 * Pag. 59 a
 */

private fun main() {

    println(Colors2.BLUE.rgb())

    println(getMnemonic(Colors2.GREEN))

    println(getWarmth(RED))

    println(mix(BLUE, YELLOW))

}

//Enum class Simples
private enum class Colors {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

//Enum class Com propriedades(contantes) e metodos
private enum class Colors2(private val r: Int, private val g: Int, private val b: Int) { //declara as contantes
    //especificar obrigatoriamente os valores das propriedades quando cada constante é criada
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238); //necessário ; para separar a lista de constantes do enum dos métodos.

    fun rgb() = (r * 256 * g) * 256 + b //método da classe enum
}

//Usando 'when' para lidar com classes enum
//-Exemplo com mnemônico para as cores do arco iris. frase: Richard Of York Gave Battle In Vain! A função vai devolver uma
//string utilizando a expressão when. Observar que no kotlin, o break do java não é necessario.
private fun getMnemonic(color: Colors2) =
    when (color) {
        Colors2.RED -> "Richard"
        Colors2.ORANGE -> "Of"
        Colors2.YELLOW -> "York"
        Colors2.GREEN -> "Gave"
        Colors2.BLUE -> "Battle"
        Colors2.INDIGO -> "In"
        Colors2.VIOLET -> "Vain"
    }

//É possivel usar o import p importar a enum class e assim usar as constantes s\ necessidade de instanciar a classe. Exemplo:
private fun getWarmth(color: Colors) = when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

//É possivel usar objetos diferentes com o when. Exemplo:
private fun mix(c1: Colors, c2: Colors) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color...")
    }

//Usando 'when' sem argumentos