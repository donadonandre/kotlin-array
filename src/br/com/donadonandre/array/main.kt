package br.com.donadonandre.array

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie) {
        print("$s ")
    }

    println()

    val numerosPares = 0..100 step 2 // 2.until(100)
    for(numeroPar in numerosPares){
        print("$numeroPar ")
    }

    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }

    val intervalo = 1500.0..5000.0 // Vale para letras (alfabeto) também
    val salario = 4000.0
    if (salario in intervalo) {
        println("O salário está dentro do intervalo")
    }
    else {
        println("O salário NÃO está dentro do intervalo")
    }
}

