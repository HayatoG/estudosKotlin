class aula21 {

    fun maiorDeIdade(idade: Int) {
        if (idade >= 18) {
            println("Maior de idade")
        } else {
            println("Não é maior de idade")
        }
    }

    fun maiorDeIdade2(idade: Int) : Boolean {
        return idade >= 18
    }

    fun calculaBonus(cargo: String, salario: Float) : Float{
        // Gerente Junior, Gerente Sênior, Coordenador

        var bonus: Float = salario

        if (cargo == "Coordenador") {
            bonus = salario * 0.2f
        } else if (cargo == "Gerente Júnior") {
            bonus = salario * 0.5f
        } else {
            bonus = salario * 2
        }
        return bonus
    }

    fun aula() {
        // Trabalhando estrutura de decisões

        /*
        maiorDeIdade(10)
        maiorDeIdade(20)
        maiorDeIdade(90)
        maiorDeIdade(3)

        maiorDeIdade2(10)
        maiorDeIdade2(20)
        maiorDeIdade2(90)
        maiorDeIdade2(3)
        */

        println(calculaBonus("Coordenador", 1000f))
        println(calculaBonus("Gerente Júnior", 1000f))
        println(calculaBonus("Gerente Sênior", 1000f))

    }
}