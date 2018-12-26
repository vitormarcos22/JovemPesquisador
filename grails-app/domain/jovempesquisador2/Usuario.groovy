package jovempesquisador2

class Usuario {

    static hasMany = [projetos : Projeto, foruns : Forum]

    String nome
    String sexo
    String cpf
    Date dataNascimento
    String escola
    String email
    String senha
    String telefone

    static constraints = {
        nome(nullable:false, blank:false, maxSize:128)
        sexo(nullable:false, blank:false, maxSize:12)
        cpf(nullable:false, blank:false, maxSize:14, unique:true)
        dataNascimento(nullable:false, blank:false)
        escola(nullable:false, blank:false, maxSize:128)
        email(email:true, nullable:false, blank:false, unique:true)
        senha(nullable:false, blank:false, maxSize:15, minSize:8)
        telefone(nullable:false, blank:false, maxSize:14)
    }
}