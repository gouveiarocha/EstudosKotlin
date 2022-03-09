package com.example.gouveiarocha.estudoskotlin.Paralelos.Beecrownd

import java.text.DecimalFormat
import kotlin.math.pow

fun main() {

    //
    val area = Math.PI * 100.64.pow(2)
    val df = DecimalFormat("#####.####")
    println("A=${df.format(area)}")

    positiveAndAverage(7f, -5f, 6f, -3.4f, 4.6f, 12f)

}

fun positiveAndAverage(vararg numbers: Float) {

    /**
     * Leia 6 (ou mais) valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha,
     * deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
     */

    if  (numbers.size >= 6) {
        var positiviesCount = 0
        var sum = 0f

        for (i in numbers) {
            if (i > 0) {
                positiviesCount++
                sum += i
            }
        }

        println("valores positivos: $positiviesCount")
        println("media: ${sum / positiviesCount}")
    }

}