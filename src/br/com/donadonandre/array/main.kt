package br.com.donadonandre.array

import br.com.donadonandre.list.Livro
import br.com.donadonandre.testes.imprimeComMarcadores

fun main() {
    listaLivroComNulos.imprimeComMarcadores()
}

val listaLivroComNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Java Como Programar",
        autor = "Deitel",
        anoPublicacao = 2015,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Memóricas Póstmas de Bras Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1888,
        editora = "Editora B"
    )
)

