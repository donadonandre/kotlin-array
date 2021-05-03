package br.com.donadonandre.testes

import java.math.BigDecimal
import java.math.RoundingMode

fun testaAgregadoresEClassesExternas() {
    val salarios = bigDecimalArrayOf("1500.0", "2000.0", "5000.0", "10000.0")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento:
            Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento)

        }.toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto Inicial: $gastoInicial")
}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000.0".toBigDecimal()) {
    salario + "500.0".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}

private fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

