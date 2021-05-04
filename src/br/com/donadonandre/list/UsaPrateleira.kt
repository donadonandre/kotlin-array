package br.com.donadonandre.list

fun main() {
    // Funções mais específicas do Map
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
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
}

