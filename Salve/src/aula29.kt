/**
 * Conversão de valores
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 *
 * Conversão de dados em Kotlin TEM que ser Explícita
 */

class aula29 {
    fun aula() {
        val n1: Float = Float.MAX_VALUE
        val b1: Byte = 100

        println(b1)
        println(b1.toDouble())
        println(b1.toFloat())
        println(b1.toInt())
        println(b1.toLong())
        println(b1.toShort())

        println("19".toInt())
        println("19".toFloat())
        println("19".toDouble())
    }
}