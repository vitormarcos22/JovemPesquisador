package jovempesquisador2

import grails.gorm.services.Service

@Service(Disciplina)
interface DisciplinaService {

    Disciplina get(Serializable id)

    List<Disciplina> list(Map args)

    Long count()

    void delete(Serializable id)

    Disciplina save(Disciplina disciplina)

}