fun main() {

    //Ele verifica antes de executar, diferente do "Do ... While"
    var index: Int = 0
    while(index < 100){
        println("$index")
        index += 10

        //Se chegar a 50, o break para a execução do loop
        if (index == 50){
            break
        }
    }
}