package br.com.donadonandre.list

fun main() {
    val banco = BancoDeNomes()
    banco.salva("André")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = Companion.dados

    fun salva(nome: String) {
        Companion.dados.add(nome)
    }

    // Lembre-te: Companion é a variável global
    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf("André", "Luiz", "Donadon")
    for (nome in nomes) {
        println("Nome da coleção $nome")
    }
}