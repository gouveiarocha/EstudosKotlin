package books.kotlin_em_acao.cap2_basico

import java.io.BufferedReader
import java.io.StringReader

/**
 * Laços de repetição.
 * Pag. 75 a 78.
 */

fun main() {

    //teste1_pag75()

    //teste2_pag76() //exemplo usando try, catch e finally

    //Observação importante para os exemplos abaixo. A última expressão do bloco(try ou catch) é que será o resultado.
    //exemplo usando o try como uma expressão...
    teste3_pag77()
    //mesmo exemplo do anterior, mas observar que podemos retornar um valor no catch, isso é bomo para os casos
    // que queremos continuar a execução e não utilizar o return. Lembrando, somente a ultima expressão será o resultado.
    teste4_pag78()

}

private fun teste4_pag78() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber3(reader)
}

private fun teste3_pag77() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber2(reader)
}

private fun teste2_pag76() {
    println(readNumber(BufferedReader(StringReader("239"))))
}

private fun teste1_pag75() {
    val percentage = 120
    if (percentage !in 0..100) {
        throw IllegalArgumentException("msg erro")
    }

    val number = 20
    //diferente de java, o lançamento de excessão pode ser usado como expressão
    val percentage2 = if (number in 0..100) number else throw IllegalArgumentException("msg erro")
}

/**
 * Métodos
 */

fun readNumber(reader: BufferedReader): Int? {
    try {
        //recebe um dado
        val line = reader.readLine()
        //tentar converter e retornar se sucesso
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        //lança excessão e retornar null
        return null
    } finally {
        //sempre executa
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}

fun readNumber3(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
        //continua a execução...
        println("continuei executando...")
    }
    println(number)
}
