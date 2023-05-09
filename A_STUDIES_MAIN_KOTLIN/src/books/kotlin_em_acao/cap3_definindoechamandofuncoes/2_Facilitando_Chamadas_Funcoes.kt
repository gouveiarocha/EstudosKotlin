package books.kotlin_em_acao.cap3_definindoechamandofuncoes

import strings.joinToString

/**
 * Facilitando a chamada de funções
 * Pag 82 a
 */

fun main() {

    val list = listOf(1, 2, 3)

    println(list) //implicitamente chama toString

    // No código acima, o retorno default do toString será: (1, 2, 3) - mas, supondo que você queira um formato
    // diferente, a seguir, vamos criar uma função para isso - chamada joinToString.

    println(joinToString(list, "; ", "{", "}"))
    // A função joinToString modifica o retorno default do toString.

    // Observar abaixo, que podemos chamar o nome do parametro - isso é bom para os casos como o exemplo abaixo,
    // onde os parametros estão em branco e logo pode ficar confuso de compreender. Considerar que nem sempre teremos
    // a ide para auxiliar - como por exemplo ao ler o código no git.
    println(joinToString(list, separator = ":", "#", " "))

    // Agora, vamos modificar essa função usando as melhorias que o Kotlin nos oferece - a seguir vamos criar uma 2º
    // versão do método, e nele mesmo comentar as modificações e melhorias.
    println(joinToStringV2(list)) //ex onde omitimos alguns parametros, pois possuem inicialização padrão
    println(joinToStringV2(list, postfix = " - fim!")) //nesse ex, também omitimos, mas observar que queremos passar o
    //postfix, nesse caso, é necessário passar o nome do parametro.

    /** 3.2.3 */

    // Funções de nivel superior ->
    println(strings.joinToString(list, " ", "1", "2"))

    // Propriedade de nivel superior (aproveitando o arquivo NivelSuperior.kt) ->
    strings.performOperation()
    strings.performOperation()
    strings.reportOperationCount()

    // Também é permitido definir constantes em uma propriedade de nivel superior... ->
    println("Teste ${strings.UNIX_LINE_SPEARATOR} pulando a linha usando a constante no nivel superior!!!")

    /** 3.3 */

    // Funções de Extensão
    // Conceito: é uma função que pode ser chamada como membro de uma classa, mas está definida fora dela!
    fun String.lastChar(): Char = this.get(this.length - 1)
    println("Kotlin".lastChar()) //BUM!!! Temos uma função nossa dentro da classe String, sem precisar importa-la!!!
    // Usamos o this como em um método usual, e como tal, podemos também omiti-lo:
    fun String.firstChar(): Char = get(0)
    println("Douglas".firstChar())
    // OBS: Diferente dos métodos definidos na classe, as funções de extensão n tem acesso a membros privados da classe.


}

private fun <T> joinToString(
    collection: Collection<T>, separator: String, prefix: String, postfix: String
): String {
    val result = StringBuffer(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// Melhorias
// Podemos iniciar os parametros com valores default, assim evitamos sobrecargas excessivas do método. No caso do
//nosso joinToString, podemos deixar o separador padrão virgula, e nosso prefix e postfix podem ser vazios
private fun <T> joinToStringV2(
    collection: Collection<T>, separator: String = ",", prefix: String = "", postfix: String = ""
): String {
    val result = StringBuffer(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}