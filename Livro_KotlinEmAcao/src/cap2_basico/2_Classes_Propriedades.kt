package com.example.gouveiarocha.estudoskotlin.Livro_KotlinEmAcao.cap2_basico

import java.util.*

/**
 * Classes e Propriedades
 * Pag. 51 a 58
 */

private fun main() {

    val person = Person2("Douglas", true)
    //person.name = "T" //não possivel, val (imutavel)
    person.isMarried = false //possivel, var (mudatevl)

    val rectangle = Rectangle(60, 50)
    println(rectangle.isSquare)

}

/**
 * Classes
 */

//Exemplo classe simples em Kotlin, se comparar a classe abaixo com uma classe java, vamos perceber a enorme diferença.
private class Person(val name: String)

/**
 * Propriedades
 */

//No exemplo abaixo, observe que podemos usar val e var na declaração das propriedades, sendo:
//val - somente leitura -> gera um campo e um getter
//var - mutavel e pode ser alterada -> gera um campo, um getter e um setter
private class Person2(val name: String, var isMarried: Boolean)

/**
 * Método de acesso personalizado
 */

//-É possivel escrever uma implementação personalizada do método de acesso de uma propriedade.
//-Abaixo, uma classe Retangulo que pode ser um quadrado. Não é preciso armazenar essa informação como um campo separado,
//podemos verificar se alt e larg são iguais durante a execução.
private class Rectangle(val height: Int, val widht: Int) {

    //1º versão.
    val isSquare: Boolean
        //o metodo get personalizado, faz parte da variavel isSquare.
        get() {
            return height == widht //atribui true ou false de acordo com a condição.
        }

    //2º versão - simplificado.
    val isSquare2: Boolean
        get() = height == widht

}

/**
 * Layout do código-fonte de Kotlin: diretorios e pacotes
 * Definições no livro.
 */

private fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}







