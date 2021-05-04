class aula04 {
    fun aula() {

        // Concatenando
        // OBS: qualquer coisa concatenada com uma string, vira string

        val frase = "Kotlin é uma linguagem"
        val caracteristica = "show!"

        println(frase + " " + caracteristica)
        println("Kotlin é uma linguagem $caracteristica")

        val str = """Olha só como o kotlin
            |ajuda a facilitar a visualização
            |do código
        """.trimMargin()

        println(str)

        // Código no print
        println("Kotlin é uma linguagem ${caracteristica.length}")

    }
}