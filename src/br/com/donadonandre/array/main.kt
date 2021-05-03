package br.com.donadonandre.array

fun main() {
    var salarios: DoubleArray = doubleArrayOf(1550.5, 2300.0, 5000.0, 8000.0, 10000.0)
    // Double tem problema de arredondamento

    val aumento = 1.1
//    var indice = 0
//    for (salario in salarios) {
//        salarios[indice] = salario * aumento
//        indice++
//    }

//    for (indice in salarios.indices) {
//        salarios[indice] = salarios[indice] * aumento
//    }

    salarios.forEachIndexed{indice, salario ->
        salarios[indice] = salario * aumento
    }
    println(salarios.contentToString())
}

