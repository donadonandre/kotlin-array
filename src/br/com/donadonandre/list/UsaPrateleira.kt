package br.com.donadonandre.list

fun main() {
    val banco = BancoDeNomes()
//    var nomeSalvos = banco.nomes
    // Esse código burla o que estamos trabalhando pois nomes é mutável.
    var nomeSalvos: MutableCollection<String> = banco.nomes as MutableCollection<String>

    // Com esse comando nós estamos burlando a regra da banco.nomes que deveria ser privada
    // Não é suficiente
    nomeSalvos.add("Teste")


    banco.salva("André")

    println(nomeSalvos)
    //println(banco.nomes)
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