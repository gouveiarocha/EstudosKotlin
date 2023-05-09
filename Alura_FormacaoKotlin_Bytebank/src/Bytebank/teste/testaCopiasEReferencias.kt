import Bytebank.modelo.Cliente
import Bytebank.modelo.ContaCorrente
import Bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente("Joao", "", 1)
    val maria = Cliente("Maria", "", 1)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"

    val contaMaria = ContaPoupanca(maria, 1003)
    contaMaria.titular.nome = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}