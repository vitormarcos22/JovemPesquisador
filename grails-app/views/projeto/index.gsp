<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'projeto.label', default: 'Projeto')}" />
        <title>Meus Projetos</title>
    </head>
    <body class="cfundo">
    <div class="homepage">


        <div id="list-projeto" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${projetoList}"/>
        <div>

            <br>


        <div>
            <a class="btn btn-primary" href="/projeto/create"> Novo Projeto </a>
        </div>


        </div>


        </div>
    </div>
    </body>
</html>