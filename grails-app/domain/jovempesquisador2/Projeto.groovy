package jovempesquisador2

class Projeto {

    static hasMany = [usuarios : Usuario, professores : Professor]
    static belongsTo = [usuario : Usuario, professor : Professor, disciplinas : Disciplina]

    String titulo
    String escola
    String enderecoEscola
    Date data
    String tematica
    String resumo
    String introducao
    String fundamentacaoTeorica
    String resultados
    String conclusao
    String bibliografia

    static constraints = {
        titulo(nullable:false, blank:false, maxSize:254, unique:true)
        escola(nullable:false, blank:false, maxSize:128)
        enderecoEscola(nullable:false, blank:false, maxSize:254)
        data(nullable:false, blank:false)
        tematica(nullable:false, blank:false, maxSize:64)
        resumo(nullable:false, blank:false, maxSize:800)
        introducao(nullable:false, blank:false, maxSize:5000)
        fundamentacaoTeorica(nullable:false, blank:false, maxSize:5000)
        resultados(nullable:false, blank:false, maxSize:8000)
        conclusao(nullable:false, blank:false, maxSize:5000)
        bibliografia(nullable:false, blank:false, maxSize:2000)
    }
}