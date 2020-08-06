fun main() {
    // for - loop
    // loop infinito

    //Alocou um espaço a cada caractere da String
    val str = "Guilherme Oliveira"
    for (c in str){
        print("$c ")
    }
    print("\n")

    //Ranges
    for (i in 1..100){
        print("$i\n")
    }

    //Com o step, dá pra ir de 2 em 2 (por exemplo)
    for(i in 0..100 step 2){
        print("$i\n")
    }

    //Assim, exibirá de 5 em 5, e caso i seja 80, ele não será exibido
    for (i in 0..100 step 5){
        if (i != 90){
            print("$i ")
        }
    }
    print("\n")
    //Nesse caso, downTo é usado para decrescer
    //O Step também pode ser aplicado neste caso
    for (j in 100 downTo 0 step 10){
        print("$j ")
    }
}