<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Mural</title>
</head>
<body>
    <!-- Header -->
    <header class="masthead d-flex">
        <div class="container text-center my-auto">
            <h1 class="mb-1">Jovem Pesquisador</h1>
            <h3 class="mb-5">
                <em>Questione, busque, responda & resolva!</em>
            </h3>
            <a class="btn btn-primary btn-xl js-scroll-trigger" href="#about">Notificações</a>
        </div>
        <div class="overlay"></div>
    </header>

    <!-- About -->
    <section class="content-section bg-light" id="about">
        <div class="container text-center">
            <div class="row">
                <div class="col-lg-10 mx-auto">
                    <h2>Stylish Portfolio is the perfect theme for your next project!</h2>
                    <p class="lead mb-5">This theme features a flexible, UX friendly sidebar menu and stock photos from our friends at
                        <a href="https://unsplash.com/">Unsplash</a>!</p>
                    <a class="btn btn-dark btn-xl js-scroll-trigger" href="#services">Mais</a>
                </div>
            </div>
        </div>
    </section>

    <!-- Services -->
    <section class="content-section bg-primary text-white text-center" id="services">
        <div class="container">
            <div class="content-section-heading">
                <h3 class="text-secondary mb-0">Assistir agora</h3>
                <h2 class="mb-5">Tutoriais</h2>
            </div>
            <div class="row">
                <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
                    <iframe class="video" width="200" height="150" src="https://www.youtube.com/embed/3kagdzn0lME" picture-in-picture" allowfullscreen>
                    </iframe>
                    <h4>
                        <strong>Método Científico</strong>
                    </h4>
                    <p class="text-faded mb-0">Entenda o método cientifico.</p>
                </div>
                <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
                    <iframe class="video" width="200" height="150" src="https://www.youtube.com/embed/CKBIgNxtRhk" picture-in-picture" allowfullscreen>
                    </iframe>
                    <h4>
                        <strong>Pergunta</strong>
                    </h4>
                    <p class="text-faded mb-0">Veja como elaborar uma boa pergunta.</p>
                </div>
                <div class="col-lg-3 col-md-6 mb-5 mb-md-0">
                    <iframe class="video" width="200" height="150" src="https://www.youtube.com/embed/lKbBWhwuaL4" picture-in-picture" allowfullscreen>
                    </iframe>
                    <h4>
                        <strong>Hipóteses</strong>
                    </h4>
                    <p class="text-faded mb-0">Entenda como elaborar as possíveis respostas para sua pergunta
                        <i class="fas fa-heart"></i>
                    </p>
                </div>
                <div class="col-lg-3 col-md-6">
                    <iframe class="video" width="200" height="150" src="https://www.youtube.com/embed/g-WtxOqIxFc" picture-in-picture" allowfullscreen>
                    </iframe>
                    <h4>
                        <strong>Experimento</strong>
                    </h4>
                    <p class="text-faded mb-0">Saiba como testar sua hipótese.</p>
                </div>
            </div>
        </div>
    </section>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to Grails</h1>

            <p>
                Congratulations, you have successfully started your first Grails application! At the moment
                this is the default page, feel free to modify it to either redirect to a controller or display
                whatever content you may choose. Below is a list of controllers that are currently deployed in
                this application, click on each to execute its default action:
            </p>

            <div id="controllers" role="navigation">
                <h2>Available Controllers:</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            </div>
        </section>
    </div>

</body>
</html>
