package jovempesquisador2

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ForumController {

    ForumService forumService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond forumService.list(params), model:[forumCount: forumService.count()]
    }

    def show(Long id) {
        respond forumService.get(id)
    }

    def create() {
        respond new Forum(params)
    }

    def save(Forum forum) {
        if (forum == null) {
            notFound()
            return
        }

        try {
            forumService.save(forum)
        } catch (ValidationException e) {
            respond forum.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'forum.label', default: 'Forum'), forum.id])
                redirect forum
            }
            '*' { respond forum, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond forumService.get(id)
    }

    def update(Forum forum) {
        if (forum == null) {
            notFound()
            return
        }

        try {
            forumService.save(forum)
        } catch (ValidationException e) {
            respond forum.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'forum.label', default: 'Forum'), forum.id])
                redirect forum
            }
            '*'{ respond forum, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        forumService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'forum.label', default: 'Forum'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'forum.label', default: 'Forum'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
