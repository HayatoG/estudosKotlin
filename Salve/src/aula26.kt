class aula26 {
    fun aula() {
        // for - loop
        // loop infinito

        val str = "Guilherme"
        for (c in str) {
            //print("$c ")
        }

        for (i in 0..100 step 5) {
            if (i != 80)
                print("$i ")
        }

        for (j in 100 downTo 0) {
            if (j <= 10)
                print("$j ")
        }
    }
}