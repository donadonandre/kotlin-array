package br.com.donadonandre.list

fun main() {
    // Funções mais específicas do Map
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 125.0,
        6 to 45.0
    )

//    val valorPedido = pedidos[0]
//    val valorPedido = pedidos.getValue(0) // Aqui ele retorna uma Exception
//    println("Valor pedido: $valorPedido")

    println(pedidos.getOrElse(1) {
        "Não tem o pedido"
    })

    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)
    for (numeroDePedidos in pedidos.keys) {
        println(numeroDePedidos)
    }

    for (valorDePedidos in pedidos.values) {
        println(valorDePedidos)
    }

    pedidos.filter { (numero, valor) ->
        true
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println("Pedidos filtrados $pedidosFiltrados")

    val pedidosAcima = pedidos.filterValues { valor -> valor > 70.0 }
    val pedidosPares = pedidos.filterKeys { numero -> numero % 2 == 0 }

    println(pedidosAcima)
    println(pedidosPares)

    // Novas funções
    println(pedidos + Pair(7, 150.0))
    println(pedidos + mapOf(7 to 50.0, 8 to 200.0))
    println(pedidos)

    println(pedidos - 6)
    println(pedidos)

    pedidos.putAll(setOf(7 to 50.0, 8 to 200.0)) // Pode ser um listOf de Pair
    pedidos.putAll(setOf(8 to 30.0)) // Substitui o 8
    pedidos += Pair(9, 210.0)
    println(pedidos)

    pedidos.keys.remove(1)
    pedidos.values.remove(30.0)
    pedidos -= 6
    println(pedidos)


}

