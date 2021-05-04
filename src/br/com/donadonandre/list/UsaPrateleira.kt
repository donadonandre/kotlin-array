package br.com.donadonandre.list

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 50.0),
        Pedido(4, 15.0),
        Pedido(5, 80.0),
    )
    println(pedidos.toString())

    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=2, valor=30.0)])

    // Agrupar mais de um valor dentro de uma chave
//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)

    val nomes = listOf(
        "André",
        "Pedro",
        "João",
        "Ana",
        "Diego",
        "Guilherme",
        "Bruna",
        "Barbara"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['A'])

    //  Também podemos usar o groupingBy
    val pedidosAgrupados: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosAgrupados.eachCount())
}

data class Pedido(val numero: Int, val valor: Double)



