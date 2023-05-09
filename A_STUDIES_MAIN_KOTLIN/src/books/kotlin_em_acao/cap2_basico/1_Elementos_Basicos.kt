package com.example.estudos_kotlin.Livro_KotlinEmAcao

/**
 * Elementos basicos:
 * Funcoes, Variaveis e Template de strings.
 * Pag. 45 a 51.
 */

fun main() {

    println(max(12, 9))
    println(yearsToCompute)

    example2()

    example4(arrayOf("Carlos", "João"))

}

/**
 * Funções
 */

//first function example
//fun block body -> corpo de bloco -> funções que possuem seu corpo entre chaves.
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b //expression with resulting value
}

//fun expression body -> corpo de expressão -> funções que devolvem uma expressão.
fun max2(a: Int, b: Int): Int = if (a > b) a else b

//simplificando ainda mais -> função inferindo o tipo de retorno... O Kotlin sabe o tipo de retorno da função pela sua expressão.
fun max3(a: Int, b: Int) = if (a > b) a else b

//Resumo Instruções e expressões
//Em Kotlin, if é uma expressão e não uma instrução, como em java. A diferença é que uma expressão tem um valor e pode
//ser usado como parte de outra expressão. No kotlin, a maioria das estruturas de controle são expressões, exceto os
//laçoes de repetição, como for, do e do while.

/**
 * Variáveis
 */

//-Tipos:
val refVal = "Variavel imutavel, tbm podemos chamar de valor"
var refVar = "Variavel mutavel"

//-Podemos ou não definir o tipo da variável. Caso omitimos, o Kt irá tentar inferir o tipo por nós.
val question = "The Ultimate Question of Lige, the Universe, and Everything" //inferencia para String
val answer = 42 //inferencia para Int.
val answer2: Int = 42 //declarando o tipo
val yearsToCompute = 7.5e6

//-Uma ref val deve ser inicializada somente 1 vez durante a execução do bloco em que esta inserida, mas, é possivel inicia
//liza-la com valores diferentes, se o compilador puder garantir que somente uma das instruções sera inicializada. Como no exemplo
//na função abaixo, observe que, a val message nunca será inicializada 2 vezes, portanto essa estrutura de codigo é permitida.
private fun example(): String {
    val message: String
    if (true) {
        message = "Success..."
    } else {
        message = "Fail..."
    }
    return message
}

//-Apesar de uma ref val ser imutavel ser imutavel e não poder ser alterada, o objeto para qual ela aponta poderá ser mutável.
//observe no exemplo abaixo:
private fun example2(){
    val language = arrayListOf("Java")
    language.add("Kotlin")
    println(language) //possible
}

//-Não é possivel mudar o tipo de varivel apos declarada.
private fun example3(){
    var answer = 42
    //answer = "Teste" //not possible
}

/**
 * Template de string
 */

//-Kotlin permite referenciar uma variavel local em string literal com o caracter $ na frente do nome da variavel. Semelhante
//ao + no java, porem, mais compacto e eficiente.
fun example4(args:Array<String>) {
    //vamos criar uma variavel e atribuir uma expressão, deve imprimir o nome caso seja passado no parametro, se não, imprimir 'Koltin'.
    val name = if(args.isNotEmpty()) args [0] else "Kotlin"
    println("Hello, $name") //concatena a variavel name da string impressa

    //para escapar, utilizar \$:
    println("Hello, \$Douglas")

    //expressoes mais complexas podem ser utilizadas, como no exemplo abaixo, usando diretamente o args na impressão
    if (args.isNotEmpty()){
        println("Hello, ${args[1]}!")
    }

    //também é possivel colocar tudo dentro da impressão:
    println("Hello, ${if(args.isEmpty()) args[args.lastIndex] else "someone"}!")

}









