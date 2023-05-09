package books.kotlin_em_acao.cap3_definindoechamandofuncoes

/**
 * Criando coleções em Kotlin
 * Pag. 80 a 82
 */

fun main() {

    // Observar que as listas em Kotlin usam as mesmas classes de Java, isso foi pensado para facilitar integração
    //das linguagens.
    introducao()

    // Porém, em Kotlin podemos fazer muito mais, por exemplo, podemos obter o último elemento de uma lista ou
    //encontrar o valor máximo em uma coleçao de números.
    exemplos1()

}

private fun introducao() {

    val set = hashSetOf(1, 7, 53) //conjunto...
    val list = arrayListOf(1, 7, 53) //lista...
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three") //map...

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

}

private fun exemplos1() {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())
    val numbers = setOf(1, 14, 2)
    println(numbers.maxOrNull())
}