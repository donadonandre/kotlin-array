package br.com.donadonandre.list

fun main() {
    val pedidos = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    // 3 to 50.0 tem problemas de performance
    println(pedidos)

    val pedido = pedidos[0]
    pedido?.let {
        println("pedido $it")
    }

    for (pedido in pedidos) { // pedido: Map.Entry
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }
}

