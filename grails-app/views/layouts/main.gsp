<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <!-- Bootstrap Core CSS -->
    <asset:stylesheet src="bootstrap.min.css" />

    <!-- Custom Fonts -->
    <asset:stylesheet src="fontawesome-free/css/all.min.css"/>
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
    <asset:stylesheet src="simple-line-icons/css/simple-line-icons.css"/>

    <!-- Custom CSS -->
    <asset:stylesheet src="stylish-portfolio.min.css"/>

    <!-- Custom CSS -->
        <asset:stylesheet src="modelo-pag.css"/>

    <g:layoutHead/>
</head>
<body>

    <!-- Navigation -->
    <a class="menu-toggle rounded" href="#">
        <i class="fas fa-bars"></i>
    </a>
    <nav id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <li class="sidebar-brand">
                <a class="js-scroll-trigger" href="/">Mural</a>
            </li>
            <li class="sidebar-nav-item">
                <a class="js-scroll-trigger" href="/usuario>Perfil</a>
            </li>
            <li class="sidebar-nav-item">
                <a class="js-scroll-trigger" href="/projeto">Projetos</a>
            </li>
            <li class="sidebar-nav-item">
                <a class="js-scroll-trigger" href="/disciplina">Disciplinas</a>
            </li>
            <li class="sidebar-nav-item">
                <a class="js-scroll-trigger" href="/forum">Fórum</a>
            </li>
            <li class="sidebar-nav-item">
                <a class="js-scroll-trigger" href="/usuario">Sair</a>
            </li>
        </ul>
    </nav>

    <g:layoutBody/>

    <!-- Bootstrap core JavaScript -->
    <asset:javascript src="jquery.min.js"/>
    <asset:javascript src="bootstrap.bundle.min.js"/>

    <!-- Plugin JavaScript -->
    <asset:javascript src="jquery.easing.min.js"/>

    <!-- Custom scripts for this template -->
    <asset:javascript src="stylish-portfolio.min.js"/>

</body>
</html>
