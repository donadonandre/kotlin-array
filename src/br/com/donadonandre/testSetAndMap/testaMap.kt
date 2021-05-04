package br.com.donadonandre.testSetAndMap

fun testaMap() {
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    // 3 to 50.0 tem problemas de performance
    println(pedidos)

    val pedido = pedidos[0]
    pedido?.let {
        println("pedido $it")
    }

    for (p in pedidos) { // pedido: Map.Entry
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    // Adicionando...
    pedidos[4] = 70.0
    println(pedidos)

    pedidos.put(5, 80.0) // Convencional é a versão de cima
    println(pedidos)

    // Atualizando...
    pedidos[1] = 100.0
    println(pedidos)

    // Adicionando caso não exista (não atualiza)
    pedidos.putIfAbsent(2, 600.0)
    println(pedidos)

    // Removendo
    pedidos.remove(3) // Pode colocar o value junto para garantir melhor
    println(pedidos)
}

