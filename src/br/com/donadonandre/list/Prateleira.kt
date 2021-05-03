package br.com.donadonandre.list

class Prateleira(
    val genero: String,
    val livros: List<Livro?> // List é imutável
) {
    fun organizarPorAutor(): List<Livro?> {
        return livros.sortedBy { it?.autor }
        // Aqui estava errado, quando era Mutable, o método certo era sortBy
    }

    fun organizarPorAnoPublicacao(): List<Livro?> {
        return livros.sortedBy { it?.anoPublicacao }
        // Aqui estava errado, quando era Mutable, o método certo era sortBy
    }
}