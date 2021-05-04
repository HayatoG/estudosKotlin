fun calculaBonus(a: Int, b: Int, c: Int) {
    // (a: Int, b: Int, c: Int) -> para o caso de enviar parâmetros


    println("O bonus é: ${a + b * c}")
}

fun hello (nome: String) : String{
    // (nome: String) : String -> : String é o tipo que será retornado
    // na função, caso a mesma retorne algo

    return "Olá meu amigo $nome"
}

class aula18 {
    fun aula() {

        // Trabalhando com funções

        val a = 10
        val b = 20
        val c = 30

        calculaBonus(a, b, c)

        println(hello("Guilherme"))



    }
}