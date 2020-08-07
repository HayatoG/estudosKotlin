fun main() {

    //Ele verifica depois de executar, diferente do "While"
    //O "Do...While" executa uma única vez antes de verificar
    //Se a condição é verdadeira
    var l: Int = 10
    do {
        println(l)
        l += 10
    } while (l <= 100)
}