/*
    [AULA 17 - Formatação de Strings]
*/
// Qualquer coisa concatenada com uma string, vira string

fun aula17() {
    val frase = "Kotlin é uma linguagem"
    val caracteristica = "show!"

    println("Kotlin é uma linguagem $caracteristica")

    val str = """Esta é uma frase
        |MUITO GRANDE
        |TESTANDO AS 3 ASPAS
        |PARA FAZER UMA GRANDE FRASE.
    """.trimMargin()

    //Funcionalidade de colocar código junto do println
    println("$str \nTamanho da frase ${str.length}")
}