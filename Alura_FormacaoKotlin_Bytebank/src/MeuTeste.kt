fun main() {

    val animal = Animal("Ive", "Marrom")
    println("Nome: ${animal.nome} - Cor: ${animal.cor}")
    animal.teste()

    val gato = Gato("gato", "", "")
    gato.teste()

    val cachorro = Cachorro("cachorro", "azul", "")
    cachorro.teste()

}

open class Animal(val nome: String, val cor: String){
    open fun teste(){
        println("animal")
    }
}

//herança com construtor primario
class Gato(nome: String, cor: String, tipo: String) : Animal(nome, cor){
    //sobescrita normal
    override fun teste(){
        println("teste gato...")
    }
}

//herança com construtor secundário
class Cachorro : Animal {

    val raca: String

    constructor(
        nome: String,
        cor: String,
        raca: String
    ) : super(
        nome = nome,
        cor = cor
    ) {
        this.raca = raca
    }

    override fun teste() {
        println("teste cachorro...")
    }

}