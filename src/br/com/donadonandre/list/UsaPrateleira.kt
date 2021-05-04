package br.com.donadonandre.list

fun main() {
    val assistiramCursoAndroid: Set<String> = setOf("André", "Alex", "Jederson")
    val assistiramCursoKotlin: Set<String> = setOf("André", "Alex", "Jederson", "João", "Maria")

    val assistiramAmbos: MutableSet<String> = mutableSetOf()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")

    println(assistiramAmbos)
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
    /*
//    val assistiramAmbos = mutableListOf<String>()
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

    //assistiramAmbos.addAll(assistiramCursoKotlin)
    //assistiramAmbos.addAll(assistiramCursoAndroid)

    println(assistiramAmbos.distinct())
    // [André, Alex, Jederson, João, Maria]
//    println(assistiramAmbos[0]) // Esse código não funciona para set
    */

}