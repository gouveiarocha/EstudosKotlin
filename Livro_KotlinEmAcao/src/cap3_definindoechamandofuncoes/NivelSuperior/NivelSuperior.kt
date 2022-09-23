@file:JvmName("StringFunctions")
package strings

// Função de nivel superior
fun <T> joinToString(
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

// Propriedade de nivel superior
var opCount = 0
fun performOperation(){
    opCount++
}
fun reportOperationCount(){
    println("Operation perfomed $opCount times")
}

// Constante
val UNIX_LINE_SPEARATOR = "\n"