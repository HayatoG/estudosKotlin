/*
    [Aula 25] - When
*/

fun operacao(a: Int, b: Int, c: String): Int {
    when(c){
        "Soma" -> return a + b
        "Subtração" -> return a - b
        else -> {
            println("Operação incorreta")
            return 0
        }
    }
}

fun main(){
    println(operacao(10,10,"Soma"))
    println(operacao(10,20, "Subtração"))
    println(operacao(10,20, "Multiplicação"))
    println(operacao(10,20, "Divisão"))
}