package br.com.donadonandre.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
//    salarios[0] = "1500.55".toBigDecimal()
//    ...
//    println(salarios.contentToString())

    val salarios = bigDecimalArrayOf("1500.0", "2000.0", "5000.0", "10000.0")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    //val salariosComAumento: List<BigDecimal> = salarios.map { salario -> salario * aumento }
    val salariosComAumento:
            Array<BigDecimal> = salarios
            .map { salario ->
                if (salario < "5000.0".toBigDecimal()) {
                    salario + "500.0".toBigDecimal()
                }
                else {
                    (salario * aumento).setScale(2, RoundingMode.UP)
                }

            }.toTypedArray()

    println(salariosComAumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

