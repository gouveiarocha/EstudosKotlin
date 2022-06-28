package cap2_basico

import java.io.BufferedReader
import java.io.StringReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

/**
 * Laços de repetição.
 * Pag. 75 a...
 */

fun main() {

    //teste1_pag75()

    //exemplo usando try, catch e finally
    teste2_pag76()

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

fun readNumber(reader: BufferedReader):Int? {

    try {
        //recebe um dado
        val line = reader.readLine()
        //tentar converter e retornar se sucesso
        return Integer.parseInt(line)
    }catch (e: NumberFormatException){
        //lança excessão e retornar null
        return null
    }finally {
        //sempre executa
        reader.close()
    }
}
