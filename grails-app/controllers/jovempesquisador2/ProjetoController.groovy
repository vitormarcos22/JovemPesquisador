package jovempesquisador2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ProjetoController {

    ProjetoService projetoService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond projetoService.list(params), model:[projetos: projetoService.list()]
    }

    def show(Long id) {
        respond projetoService.get(id)
    }

    def create() {
        respond new Projeto(params)
    }

    def save(Projeto projeto) {
        if (projeto == null) {
            notFound()
            return
        }

        try {
            projetoService.save(projeto)
        } catch (ValidationException e) {
            respond projeto.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'projeto.label', default: 'Projeto'), projeto.id])
                redirect projeto
            }
            '*' { respond projeto, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond projetoService.get(id)
    }

    def update(Projeto projeto) {
        if (projeto == null) {
            notFound()
            return
        }

        try {
            projetoService.save(projeto)
        } catch (ValidationException e) {
            respond projeto.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'projeto.label', default: 'Projeto'), projeto.id])
                redirect projeto
            }
            '*'{ respond projeto, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        projetoService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'projeto.label', default: 'Projeto'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'projeto.label', default: 'Projeto'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
