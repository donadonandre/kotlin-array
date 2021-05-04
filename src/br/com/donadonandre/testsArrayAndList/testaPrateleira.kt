package br.com.donadonandre.testsArrayAndList

import br.com.donadonandre.array.listaLivroComNulos
import br.com.donadonandre.list.Prateleira

fun testaPrateleira() {
    val prateleira = Prateleira(
        genero = "Literatura",
        livros = listaLivroComNulos
    )

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

    /* Agora estamos trabalhando com List então ele está criando objetos separados, diferentes
     */
}