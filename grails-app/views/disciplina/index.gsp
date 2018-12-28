<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <title>Disciplinas</title>
</head>
<body>
<div class="homepage">
    <div id="list-disciplina" class="content scaffold-list" role="main">
        <h1><g:message code="default.list.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <f:table collection="${disciplinaList}"/>
    </div>
    <br>
    <form>
        <div class="form-group">
            <label for="formGroupExampleInput">Nome da Disciplina:</label>
            <input type="text" class="form-control" id="formGroupExampleInput">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Carga Horária:</label>
            <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Ex: 45h">
        </div>
        <div class="form-group">
            <label for="formGroupExampleInput2">Série:</label>
            <br>
            <select>
                <option>6ª</option>
                <option>7ª</option>
                <option>8ª</option>
                <option>9ª</option>
                <option>1º E.M.</option>
                <option>2º E.M.</option>
                <option>3º E.M.</option>
                <option>4º E.M.</option>
            </select>
            <br>

        </div>

        <div class="col-auto my-1">
            <a class="btn btn-primary" href="/disciplina/create"">Cadastrar Disciplina</a>
        </div>
    </form>

</div>
</body>
</html>