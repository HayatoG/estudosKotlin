/*
   [Aula 18 - Criação de Funções]
   - Palavras reservadas;
   - O que é uma função?
     - A função é algo que eu posso extrair uma lógica que aparece no meu código.

*/
fun calculaBonus(a: Int, b: Int, c: Int){
    println("O bônus é: ${a + b * c * 2}")
}

/*: String
  : Int
  : Float
  Isso é utilizado quando a função deverá retornar algo, assim como na função abaixo.
 */
fun hello(nome: String) : String{
    return "Olá, $nome"
}

/*fun main() {

    val a = 10
    val b = 20
    val c = 30

    calculaBonus(a, b, c)
    println(hello("Guilherme"))

}*/