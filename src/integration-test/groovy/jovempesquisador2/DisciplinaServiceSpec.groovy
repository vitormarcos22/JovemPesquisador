package jovempesquisador2

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DisciplinaServiceSpec extends Specification {

    DisciplinaService disciplinaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Disciplina(...).save(flush: true, failOnError: true)
        //new Disciplina(...).save(flush: true, failOnError: true)
        //Disciplina disciplina = new Disciplina(...).save(flush: true, failOnError: true)
        //new Disciplina(...).save(flush: true, failOnError: true)
        //new Disciplina(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //disciplina.id
    }

    void "test get"() {
        setupData()

        expect:
        disciplinaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Disciplina> disciplinaList = disciplinaService.list(max: 2, offset: 2)

        then:
        disciplinaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        disciplinaService.count() == 5
    }

    void "test delete"() {
        Long disciplinaId = setupData()

        expect:
        disciplinaService.count() == 5

        when:
        disciplinaService.delete(disciplinaId)
        sessionFactory.currentSession.flush()

        then:
        disciplinaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Disciplina disciplina = new Disciplina()
        disciplinaService.save(disciplina)

        then:
        disciplina.id != null
    }
}
