package PraticasProprias

fun main() {
    val post = Post("Aprendendo Injeção de Dependencia!!!")
    post.publish()
}

class Post(private val title: String) : INotifier {
    fun publish() {
        println("Publicando post... Nome: $title")
        send()
    }

    override fun send() {
        println("Notificando usuário...")
    }

}

interface INotifier {
    fun send()
}

