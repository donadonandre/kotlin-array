package br.com.donadonandre.testes

import br.com.donadonandre.funcs.*
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

    // Calculando o gasto com salarios nos próximos 6 meses
    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto Inicial: $gastoInicial")

    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto Total: $gastoTotal")

    // Media dos 3 maiores salários
    val salariosOrdenados = salariosComAumento.sorted()
    //val tresUltimosSalarios: List<BigDecimal> = salariosOrdenados.takeLast(3)
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
    val media = tresUltimosSalarios.media()
    println("A média dos 3 maiores salários são: $media")
}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000.0".toBigDecimal()) {
    salario + "500.0".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}




