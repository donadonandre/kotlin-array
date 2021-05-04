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
}

data class Pedido(val numero: Int, val valor: Double)



