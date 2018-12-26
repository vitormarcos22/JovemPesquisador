package jovempesquisador2

class Forum {

    static hasMany = [usuarios : Usuario]
    static belongsTo = Usuario

    String topico
    Date dataPergunta
    Date dataResposta
    String pergunta
    String resposta

    static constraints = {
        topico(nullable:false, blank:false, maxSize:128)
        dataPergunta(nullable:false, blank:false)
        dataResposta(nullable:false, blank:false)
        pergunta(nullable:false, blank:false, maxSize:328)
        resposta(nullable:false, blank:false, maxSize:428)
    }
}
