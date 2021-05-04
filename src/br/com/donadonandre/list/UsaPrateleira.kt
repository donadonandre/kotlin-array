package br.com.donadonandre.list

fun main() {
    val assistiramCursoAndroid: List<String> = listOf("André", "Alex", "Jederson")
    val assistiramCursoKotlin: List<String> = listOf("André", "Alex", "Jederson", "João", "Maria")
    val assistiramAmbos = mutableListOf<String>()

    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.addAll(assistiramCursoAndroid)

    println(assistiramAmbos)
    // [André, Alex, Jederson, João, Maria, André, Alex, Jederson]
}