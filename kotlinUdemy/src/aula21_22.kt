/*
    [Aula 20] - Controle de Fluxo parte 1 e 2

    "Escrever menos código é o estado da arte"
    Assim, criando códigos menores com a mesma função de códigos maiores e mais complexos.
*/

fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Não é maior de idade")
    }
}

/*
    Utilizando o método booleano, fica mais legível e o código fica limpo, neste caso.
    Incluindo não precisar utilizar if/else.
*/
fun maiorDeIdadev2(idade: Int): Boolean = idade >= 18

fun calcBonus(cargo: String, salario: Float): Float {
    //Gerente Junior, Gerente Sênior, Coordenador

    val bonus: Float
    if (cargo == "Coordenador") {
        return salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        bonus = salario * 0.5f
    } else {
        bonus = salario * 2
    }
    return bonus
}

/*
    O Kotlin sempre sugere uma melhoria, seja ela de identação do código (Ctrl + Alt + L)
    Ele também sugere, com a lâmpada, algumas melhorias em relação a função criada.
    Como pode ver abaixo, a função já começa retornando o "if", assim, sem a necessidade de armazenar conteudo já em outra variável.
*/
fun calcBonusv2(cargo: String, salario: Float): Float {
    //Gerente Junior, Gerente Sênior, Coordenador

    return if (cargo == "Coordenador") {
        return salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2
    }
}

/*
    Operador ternário em JAVA:
    String str = valor == 10 ? "Sim" : "Não";

    Não possui em Kotlin, justamente pq podemos utilizar essa função no if/else, veja:

    val str = if (valor == 10) "Sim" else "Não"
*/

/*
fun main() {

    println(calcBonus("Coordenador", 1000f))
    println(calcBonus("Gerente Junior", 30000f))
    println(calcBonus("Gerente Sênior", 50000f))

}
*/