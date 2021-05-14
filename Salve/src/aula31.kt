/**
 * NullSafe
 *
 * Variáveis nulas: val/var variável: Tipo? = null
 * A interrogação permite que a variável seja nula.
 *
 */

class aula31 {
    fun aula() {

        val str: String? = null

        println(str?.length)

        // Outro tipo de validação para Nullsafe no qual não é necesário
        // A interrogação.

        if (str != null){
            println(str.length)
        }

        // !! - "Eu sei o que estou fazendo, eu vou assumir o risco
        // Se der erro, deixa dar erro e eu vou ter que assumir o que vai
        // Acontecer.
        // Assim, ele vai mostrar o erro, mas vai "executar" mostrando o NullPointerException

        println(str!!.length)

    }
}