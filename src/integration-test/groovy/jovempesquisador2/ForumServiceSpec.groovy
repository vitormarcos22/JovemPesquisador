package jovempesquisador2

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ForumServiceSpec extends Specification {

    ForumService forumService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Forum(...).save(flush: true, failOnError: true)
        //new Forum(...).save(flush: true, failOnError: true)
        //Forum forum = new Forum(...).save(flush: true, failOnError: true)
        //new Forum(...).save(flush: true, failOnError: true)
        //new Forum(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //forum.id
    }

    void "test get"() {
        setupData()

        expect:
        forumService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Forum> forumList = forumService.list(max: 2, offset: 2)

        then:
        forumList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        forumService.count() == 5
    }

    void "test delete"() {
        Long forumId = setupData()

        expect:
        forumService.count() == 5

        when:
        forumService.delete(forumId)
        sessionFactory.currentSession.flush()

        then:
        forumService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Forum forum = new Forum()
        forumService.save(forum)

        then:
        forum.id != null
    }
}
