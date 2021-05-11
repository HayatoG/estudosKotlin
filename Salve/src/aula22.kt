class aula22 {
    fun aula() {
        // If - Else parte 2
        // "Melhorando" o IF/Else da aula anterior.

        fun calculaBonus(cargo: String, salario: Float) {
            val bonus = if (cargo == "Coordenador") {
                salario * 0.2f
            } else if (cargo == "Gerente Junior") {
                salario * 0.5f
            } else {
                salario * 2
            }
        }

        // Operador Ternário
        val valor = 10;
        val str = if (valor == 10) "Sim" else "Não"
        println("Ternario: $str")

    }
}