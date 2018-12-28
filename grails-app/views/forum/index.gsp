<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'forum.label', default: 'Forum')}" />
    <title>Forum</title>
</head>
<body>
<div class="homepage">
    <div id="list-forum" class="content scaffold-list" role="main">
        <h1><g:message code="default.list.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <f:table collection="${forumList}"/>
    </div>
    <br>

    <div class="col-auto my-1">
        <a class="btn btn-primary" href="/forum/create"">Cadastrar forúm</a>
    </div>
    <br>
    <form class="was-validated">
        <div class="mb-3">
            <label for="validationTextarea">Escreva aqui a sua pergunta:</label>
            <textarea class="form-control is-invalid" id="validationTextarea" placeholder="ex: Estou com dúvida sobre a ferramenta..." required></textarea>
            <div class="invalid-feedback">
                Por favor, insira uma mensagem na área de texto.
            </div>
        </div>

        <!-- Área -->
        <form>
            <div class="form-row align-items-center">
                <div class="col-auto my-1">
                    <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                    <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                        <option selected>Selecionar...</option>
                        <option value="1">Educação</option>
                        <option value="2">Tecnologia</option>
                        <option value="3">Meio Ambiente</option>
                        <option value="4">Ciência</option>
                    </select>
                </div>
                <div class="col-auto my-1">
                    <div class="custom-control custom-checkbox mr-sm-2">
                        <input type="checkbox" class="custom-control-input" id="customControlAutosizing">
                        <label class="custom-control-label" class="concordo" for="customControlAutosizing">Concordo que minha pergunta está no padrão do respeito e da educação</label>
                    </div>
                </div>
                <div class="col-auto my-1">
                    <button type="submit" class="btn btn-primary">Submeter pergunta</button>
                </div>
            </div>
        </form>

        <!---Resposta--->

        <h1></h1>
        <form class="was-validated">
            <div class="mb-3">
                <label for="validationTextarea">Escreva aqui resposta:</label>
                <textarea class="form-control is-invalid" id="validationTextarea"></textarea>
                <div class="invalid-feedback">
                    Por favor, insira uma mensagem na área de texto!
                </div>
            </div>
            <div class="col-auto my-1">
                <div class="custom-control custom-checkbox mr-sm-2">
                    <input type="checkbox" class="custom-control-input" id="customControlAutosizing">
                    <label class="custom-control-label" for="customControlAutosizing">Concordo que minha resposta está no padrão do respeito e da educação</label>
                </div>
            </div>
            <div class="col-auto my-1">
                <button type="submit" class="btn btn-primary">Submeter resposta</button>
            </div>
</form>

</div>
</body>
</html>