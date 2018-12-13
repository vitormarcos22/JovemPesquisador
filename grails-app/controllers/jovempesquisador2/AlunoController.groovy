package jovempesquisador2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class AlunoController {

    AlunoService alunoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond alunoService.list(params), model:[alunoCount: alunoService.count()]
    }

    def show(Long id) {
        respond alunoService.get(id)
    }

    def create() {
        respond new Aluno(params)
    }

    def save(Aluno aluno) {
        if (aluno == null) {
            notFound()
            return
        }

        try {
            alunoService.save(aluno)
        } catch (ValidationException e) {
            respond aluno.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'aluno.label', default: 'Aluno'), aluno.id])
                redirect aluno
            }
            '*' { respond aluno, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond alunoService.get(id)
    }

    def update(Aluno aluno) {
        if (aluno == null) {
            notFound()
            return
        }

        try {
            alunoService.save(aluno)
        } catch (ValidationException e) {
            respond aluno.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'aluno.label', default: 'Aluno'), aluno.id])
                redirect aluno
            }
            '*'{ respond aluno, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        alunoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'aluno.label', default: 'Aluno'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'aluno.label', default: 'Aluno'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
