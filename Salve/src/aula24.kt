//Aula 23 foi apenas teoria
class aula24 {
    fun aula() {
        // Operador Elvis ?:
        // val test: Int? = null (o interrogação permite que a variável seja nula)

        // Elvis ?:
        // val op: Int = test ?: 100 -> Se existe um valor em test -> Use
        //                           -> Se não, use 100

        val test: Int? = null
        val op: Int = test ?: 100

        println(op)

    }
}