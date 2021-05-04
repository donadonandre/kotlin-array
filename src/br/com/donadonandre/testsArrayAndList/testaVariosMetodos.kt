package br.com.donadonandre.testsArrayAndList

fun testaVariosMetodos() {
    val idades = intArrayOf(15, 16, 18, 19, 20, 21, 25, 30, 40, 50)

    val maiorIdade = idades.max() // Obsoleto
    val menorIdade = idades.min() // Obsoleto
    val mediaIdade = idades.average()

    println("Maior: $maiorIdade")
    println("Menor: $menorIdade")
    println("Média: $mediaIdade")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos Maiores? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Existe Maior? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores alunos: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca um de 18: $busca")
}

