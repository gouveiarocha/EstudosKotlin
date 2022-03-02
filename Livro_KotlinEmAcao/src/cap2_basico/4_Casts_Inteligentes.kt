package cap2_basico

import java.lang.IllegalArgumentException

/**
 * Casts inteligentes.
 * Pag. 64 a 69
 */

fun main() {

    //Aqui, ele vai calcular (1+2)+4
    println(eval((Sum(Sum(Num(1), Num(2)), Num(4)))))

    //Aqui, ele vai calcular 2x5
    println(emult(Mult(Num(2), Num(5))))

}

//Exemplo cast inteligente abaixo, retirado do livro, explicação linha a linha.

interface Expr

class Num(val value: Int) : Expr
class Sum(val n1: Expr, val n2: Expr) : Expr

//Observar a palavra reservado is, ela verificar se a variavel é do tipo escolhido e retorna um boolean. Semelhante
//a instanceOf do java, com a dif que em java é necessário fazer um cast, em Kotlin não.
//Observar também que a IDE mostra a varival que esta usando o cast inteligente, ela fica em evidencia.
fun eval(e: Expr): Int { //recebe expressão e retorna inteiro
    val a = e as Num //exemplo de cast explicito.
    if (e is Num) { //se a expressão for classe Num,
        val n = e as Num //cast desnecessário, devido utilizar o 'is' no if acima, o Kotlin fará o cast automaticamente.
        return e.value //retorna value, que é um int. observar variavel e em evidencia.
    }
    if (e is Sum) { //se a expressão for classe Sum,
        return eval(e.n1) + eval(e.n2) //retona a soma dos numeros, que nessa caso são valores da classe Num.
    }
    throw IllegalArgumentException("Unknown expression...")

}

//Refatorado usando retorno com expressão if
fun eval2(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval2(e.n1) + eval2(e.n2)
    } else {
        throw IllegalArgumentException("Unknown expression...")
    }

//Refatorando com expressão when, também com cast inteligente.
fun eval3(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval3(e.n1) + eval3(e.n2)
        else -> throw IllegalArgumentException("Unknown expression...")
    }

//Exemplo que fiz, com multiplicar.
class Mult(val n1: Expr, val n2: Expr) : Expr

fun emult(e: Expr): Int {
    if (e is Num) {
        return e.value
    }
    if (e is Mult) {
        return emult(e.n1) * emult(e.n2)
    }
    throw IllegalArgumentException("Unknown expression...")
}

//Blocos como ramos. Tanto exp if como when podem conter blocos e a ulktima expressão do bloco será o resultado. Ex:
fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            //bloco
            println("num: ${e.value}")
            e.value //retorno, se e for do tipo Num
        }
        is Sum -> {
            //bloco
            val n1 = evalWithLogging(e.n1)
            val n2 = evalWithLogging(e.n2)
            println("sum: $n1 + $n2")
            n1 + n2 //retorno, se e for do tipo Sum
        }
        else -> throw IllegalArgumentException("Unknown expression...")
    }