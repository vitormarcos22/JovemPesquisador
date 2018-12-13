package jovempesquisador2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class DisciplinaController {

    DisciplinaService disciplinaService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond disciplinaService.list(params), model:[disciplinaCount: disciplinaService.count()]
    }

    def show(Long id) {
        respond disciplinaService.get(id)
    }

    def create() {
        respond new Disciplina(params)
    }

    def save(Disciplina disciplina) {
        if (disciplina == null) {
            notFound()
            return
        }

        try {
            disciplinaService.save(disciplina)
        } catch (ValidationException e) {
            respond disciplina.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'disciplina.label', default: 'Disciplina'), disciplina.id])
                redirect disciplina
            }
            '*' { respond disciplina, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond disciplinaService.get(id)
    }

    def update(Disciplina disciplina) {
        if (disciplina == null) {
            notFound()
            return
        }

        try {
            disciplinaService.save(disciplina)
        } catch (ValidationException e) {
            respond disciplina.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'disciplina.label', default: 'Disciplina'), disciplina.id])
                redirect disciplina
            }
            '*'{ respond disciplina, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        disciplinaService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'disciplina.label', default: 'Disciplina'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'disciplina.label', default: 'Disciplina'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
