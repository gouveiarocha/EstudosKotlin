package cap2_basico

import java.util.*

/**
 * Laços de repetição.
 * Pag. 69 a
 */

fun main() {

    //lacosWhile()

    println("---------------")

    // laço for -> o for no kotlin tem mudanças, nao usamos a maneira padrão do java, criando uma variavel e
    // incrementando-a a cada passo no laço, para isso, usamos uma faixa entre dois valores que geralmente são numeros,
    // um valor inicial e um valor final. exemplo:

    var oneToTen = 0..10
    for (i in oneToTen) {
        print("$i")
    }

    println("---------------")

    // intervalos de inteiros para jogar fizzbuzz, pagina 70
    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    println("---------------")

    // contando de tras para frente a partir de 100 e incluindo somente numeros pares
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }

    println("---------------")

    // iterando por um mapa - exp pag 72
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    println("---------------")

    // exemplo onde não é necessário criar uma variavel separada para armazenar o indice e incrementa-lo manualmente
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    println("---------------")

    //usando o in para verificar se um determinado caractere pertence a um intervalo
    println(isLetter('b'))
    println(isNotDigit('5'))

    //usando verificação com in em ramos de when
    println(recognize('@'))

    //verificando se outro objeto pertence ao intervalo usando o in
    println("Kotlin" in "Scala".."Java") //true
    println("Kotlin" in "Java".."Scala") //false

}

fun recognize(caracter: Char) = when (caracter) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}

fun isLetter(caracter: Char) = caracter in 'a'..'z' || caracter in 'A'..'Z'
fun isNotDigit(caracter: Char) = caracter !in '0'..'9'

fun lacosWhile() {

    // laços while e do-while - praticamente igual java

    // laço while -> o corpo é executado então a condição for verdadeira
    var condicao = true
    while (condicao) {
        //corpo
    }

    // laço do-while -> o corpo sempre será executado na primeira vez, depois, será exectuado enquanto a condição
    // forverdadeira
    do {
        //corpo
    } while (condicao)

}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}



