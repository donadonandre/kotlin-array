package br.com.donadonandre.array

import br.com.donadonandre.list.Livro

fun main() {
    //listaLivroComNulos.imprimeComMarcadores()

    listaLivroComNulos
        .groupBy { it?.editora ?: "Editora desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it?.titulo ?: "" }}")
        }
}

val listaLivroComNulos: MutableList<Livro?> = mutableListOf(
    Livro(
        titulo = "Java Como Programar",
        autor = "Deitel",
        anoPublicacao = 2015,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    ),
    Livro(
        titulo = "12 Trabalhos de Hércules",
        autor = "Monteiro Lobato",
        anoPublicacao = 1905
    ),
    Livro(
        titulo = "Memóricas Póstmas de Bras Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1888,
        editora = "Editora B"
    )
)

