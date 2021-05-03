package br.com.donadonandre.list

import br.com.donadonandre.array.listaLivroComNulos
import br.com.donadonandre.testes.imprimeComMarcadores

fun main() {
    val prateleira = Prateleira(
        genero = "Literatura",
        livros = listaLivroComNulos
    )

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

    /* Antes o comando estava
    * prateleira.organizarPorAutor().imprimeComMarcadores()
    *
    * DO jeito que está aí em cima ele parou de ordenar, porque as duas variaveis estão apontando
    * pra mesma lista de livros. COmo a lista está sendo alterada internamente, nós não vemos as listas
    * externas porque é o mesmo objeto, a mesma lista.
     */
}