package jovempesquisador2

class Professor extends Usuario{

    static hasMany = [projetos : Projeto]
    static belongsTo = [disciplina : Disciplina]

    String formacao
    String matricula

    static constraints = {
        formacao(nullable:false, blank:false, maxSize:80)
        matricula(nullable:false, blank:false, maxSize:30, unique:true)
        disciplina(nullable:false)
    }
}
