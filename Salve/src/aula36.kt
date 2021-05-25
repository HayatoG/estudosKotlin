class aula36 {
    fun aula() {
    // N parâmetros - vararg
        /*fun media(n1: Float, n2: Float, n3: Float = 0f, n4: Float = 0f) {
            if(n4 != 0f) {
                val media = (n1 + n2 + n3 + n4) / 4
            }
        }*/
        fun media1(vararg notas: Float) {

            if (notas.isNotEmpty()) {
                println()
                var result = 0f
                for (nota in notas) {
                    result += nota
                }
                println("A média é ${result/notas.size}")
            }
        }

        // Este tipo aceita qualquer coisa como parâmetro
        fun <T> media(vararg valores: T) {
            for (valor in valores) {
                println(valor)
            }
        }

        media(0f, 5f, 7f, 10f)
        media(1, 4f, "", false, "G")

    }
}