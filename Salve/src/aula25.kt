class aula25 {
    fun aula() {
        // Uso de when

        fun operacao(a: Int, b: Int, c: String): Int{
            when (c) {
                "Soma" -> {
                    return a + b
                }
                "Subtração" -> {
                    return a - b
                }
                else -> {
                    println("Operação incorreta")
                    return 0
                }
            }

            /*when {
                a > 0 && b > 0 -> {
                    println("Variáveis maiores que zero")
                }
            }*/

            //Range - Intervalo de valores - ..
            /*when {
                a in 1..99 -> {
                    println("Século")
                }
            }*/
        }

        println(operacao(10,10,"Soma"))
        println(operacao(10,10,"Subtração"))

        operacao(10, 10,"Somaaa")
    }
}