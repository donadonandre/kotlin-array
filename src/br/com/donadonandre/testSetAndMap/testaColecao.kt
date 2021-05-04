package br.com.donadonandre.testSetAndMap

fun testaCopia() {
    val banco = BancoDeNomes()
//    var nomeSalvos = banco.nomes
    // 1 - Esse código burla o que estamos trabalhando pois nomes é mutável.
    var nomeSalvos: Collection<String> = banco.nomes as Collection<String>

    // 2 - Com esse comando nós estamos burlando a regra da banco.nomes que deveria ser privada
    //nomeSalvos.add("Teste")


    banco.salva("André")

    println(nomeSalvos)
    //println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    // 3 - colando o toList, não permite mais que o Casting seja feito
    val nomes: Collection<String> get() = Companion.dados.toList()

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