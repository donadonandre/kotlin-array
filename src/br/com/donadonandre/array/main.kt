package br.com.donadonandre.array

import br.com.donadonandre.list.Livro

fun main() {
    val livro1 = Livro(
        titulo = "Java Como Programar",
        autor = "Deitel",
        anoPublicacao = 2015,
        editora = "Editora A"
    )

    val livro2 = Livro(
        titulo = "Memóricas Póstmas de Bras Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1888,
        editora = "Editora B"
    )

    val livro3 = Livro(
        titulo = "Clean Code",
        autor = "Uncle Bob",
        anoPublicacao = 2009,
        editora = "Editora C"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3)

    // Lista permite usar o método add, o array não

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    livros.imprimeComMarcadores()

    livros.remove(livro2)

    livros.imprimeComMarcadores()

    val ordenandoPorAnoPublicacao = livros.sorted() // Esse método só funcionara depois que a classe Livro extender Comparable
    ordenandoPorAnoPublicacao.imprimeComMarcadores()
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros ####\n$textoFormatado")
}

