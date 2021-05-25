class aula35 {
    fun aula() {
        //Parâmetros

        fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numer: Int = 0) {
            println("Rua: $rua")
            println("Cidade: $cidade, $estado - $cep")
        }

        endereco(cidade = "São Paulo", estado = "São Paulo", cep = "11")


    }
}