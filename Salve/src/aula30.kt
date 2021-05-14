import java.lang.Exception
import java.lang.NumberFormatException

/**
 * Realizando tratamento de exceções
 * Ajuda a continuar o fluxo e tratar exeções específicas de erros no código
 * Prestar atençaõ na ordem dos erros, pois, "NumberFormatException" é mais específico
 * que o Genérico "Exception".
 * Ordem correta -> Mais específico
 *               -> Mais genérico
 *
 * Finally é importante dependendo do tipo de execução feita, como a conexão
 * em um banco de dados, por exemplo, como abrir uma conexão e usar o finally para encerrar
 * a conexão com o banco.
 */

class aula30 {
    fun aula() {

        try {
            println("teste".toInt())
        } catch (e: NumberFormatException){
            println("Este valor não é um número!\n")
        } catch (e: Exception) {
            println("Algo de errado ocorreu!!\n")
        } finally {
            println("Continuando código")
            println("Continuei o código")
        }





    }
}