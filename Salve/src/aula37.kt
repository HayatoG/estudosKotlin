class aula37 {
    fun aula() {

        // Este tipo aceita qualquer coisa como parâmetro
        fun <T> media(vararg valores: T) {
            for (valor in valores) {
                println(valor)
            }
        }

        val str = "lorem ipsum"
        str.capitalize()
        str.decapitalize()
        str.contains("bla")
        str.startsWith("L")
        str.startsWith("l", false) // -> false para ignorar se é maiusculo ou n

        arrayOf(1, 3, 4, 1, 6).size


    }
}