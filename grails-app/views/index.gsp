<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
    <!-- Header -->
    <header class="masthead d-flex">
        <div class="container text-center my-auto">
            <h1 class="mb-1">Stylish Portfolio</h1>
            <h3 class="mb-5">
                <em>A Free Bootstrap Theme by Start Bootstrap</em>
            </h3>
            <a class="btn btn-primary btn-xl js-scroll-trigger" href="#about">Find Out More</a>
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
                    <a class="btn btn-dark btn-xl js-scroll-trigger" href="#services">What We Offer</a>
                </div>
            </div>
        </div>
    </section>

    <!-- Services -->
    <section class="content-section bg-primary text-white text-center" id="services">
        <div class="container">
            <div class="content-section-heading">
                <h3 class="text-secondary mb-0">Services</h3>
                <h2 class="mb-5">What We Offer</h2>
            </div>
            <div class="row">
                <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
                    <span class="service-icon rounded-circle mx-auto mb-3">
                        <i class="icon-screen-smartphone"></i>
                    </span>
                    <h4>
                        <strong>Responsive</strong>
                    </h4>
                    <p class="text-faded mb-0">Looks great on any screen size!</p>
                </div>
                <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
                    <span class="service-icon rounded-circle mx-auto mb-3">
                        <i class="icon-pencil"></i>
                    </span>
                    <h4>
                        <strong>Redesigned</strong>
                    </h4>
                    <p class="text-faded mb-0">Freshly redesigned for Bootstrap 4.</p>
                </div>
                <div class="col-lg-3 col-md-6 mb-5 mb-md-0">
                    <span class="service-icon rounded-circle mx-auto mb-3">
                        <i class="icon-like"></i>
                    </span>
                    <h4>
                        <strong>Favorited</strong>
                    </h4>
                    <p class="text-faded mb-0">Millions of users
                        <i class="fas fa-heart"></i>
                        Start Bootstrap!</p>
                </div>
                <div class="col-lg-3 col-md-6">
                    <span class="service-icon rounded-circle mx-auto mb-3">
                        <i class="icon-mustache"></i>
                    </span>
                    <h4>
                        <strong>Question</strong>
                    </h4>
                    <p class="text-faded mb-0">I mustache you a question...</p>
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
