package br.com.donadonandre.testsArrayAndList

fun testaMaiorEMenorIdade() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55)
    // Nesse caso eu não preciso especificar o tamanho do IntArray na declaração

    var maiorIdade = 0

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("A maior idade é: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("A menor idade é: $menorIdade")
}