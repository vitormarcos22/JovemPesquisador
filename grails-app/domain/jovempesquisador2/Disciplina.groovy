package jovempesquisador2

class Disciplina {

    static hasMany = [professores : Professor]
    static hasMany = [projetos : Projeto]
    static  belongsTo = [projeto : Projeto]

    String nome
    int cargaHoraria
    String serie

    static constraints = {
        nome(nullable:false, blank:false, maxSize:128)
        cargaHoraria(nullable:false, blank:false)
        serie(nullable:false, blank:false, maxSize:8)
    }
}
