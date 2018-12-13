package jovempesquisador2

class Aluno extends Usuario{

    String escolaridade
    String endereco

    static constraints = {
        escolaridade(inList:['6º ano','7º ano','8º ano','9º ano','Ensino Médio', 'Superior'], nullable:false, blank:false)
        endereco(nullable:false, blank:false, maxSize:300)
    }
}
