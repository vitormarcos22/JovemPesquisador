package jovempesquisador2

import grails.gorm.services.Service

@Service(Forum)
interface ForumService {

    Forum get(Serializable id)

    List<Forum> list(Map args)

    Long count()

    void delete(Serializable id)

    Forum save(Forum forum)

}