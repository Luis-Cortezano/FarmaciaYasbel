<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Farma-online</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <link href="/FarmaciaWeb/CSS/PQR.css" rel="stylesheet" type="text/css"/>
        <link href="/FarmaciaWeb/CSS/style.css" rel="stylesheet" type="text/css"/>
        <link href="/FarmaciaWeb/CSS/navbar.css" rel="stylesheet" type="text/css"/> <!-- Archivo CSS separado -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="/FarmaciaWeb/JS/scripts.js" type="text/javascript"></script>
        <script src="/FarmaciaWeb/JS/minicarrucel.js" type="text/javascript"></script>
    </head>
    <body>
        <%-- Verifica si el usuario está logueado --%>
        <%
            if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
                response.sendRedirect("../Vistas/LogginPage.jsp");
            }
        %>

        <!-- Barra de Navegación -->
        <!-- Barra de Navegación -->
        <nav class="navbar navbar-expand-lg navbar-custom navbar-fixed-top">
            <a class="navbar-brand" href="/FarmaciaWeb/CtrProductoLi?accion=home">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" class="icon" width="60px" height="60px"/>
                Farmacia Yasbel
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <form class="form-inline my-2 my-lg-0 mr-auto" action="/FarmaciaWeb/CtrProductoLi?accion=buscar" method="post">
                    <input class="form-control mr-sm-2" type="search" placeholder="Buscar productos..." aria-label="Search" name="busqueda">
                    <button class="btn-search my-2 my-sm-0" type="submit">
                        <div class="original">BUSCAR</div>
                        <div class="letters">
                            <span>B</span>
                            <span>U</span>
                            <span>S</span>
                            <span>C</span>
                            <span>A</span>
                            <span>R</span>
                        </div>
                    </button>
                </form>

                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="bi bi-person"></i> Mi Cuenta
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item text-center" href="#"><i class="bi bi-person"></i></a>
                            <a class="dropdown-item">${usuario.getUsunombre()}</a>
                            <a class="dropdown-item">${usuario.getUsutipo()}</a>
                            <a class="dropdown-item" data-bs-toggle="modal" data-bs-target="#exampleModal">PQR</a>
                            <a class="dropdown-item text-danger" href="/FarmaciaWeb/CtrProductoLi?accion=salir">Cerrar Sesión</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <i class="bi bi-cart-check-fill"></i> Carrito
                            (<label style="color: darkorange">${contador}</label>)
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownCategories" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="bi bi-bookmark"></i> Comprar por categorías
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownCategories">
                            <c:forEach var="c" items="${categorias}">
                                <input type="hidden" value="${c.getCatCodigo()}" name="catid" id="catid">
                                <a class="dropdown-item" href="/FarmaciaWeb/CtrProductoLi?accion=buscarcat&catid=${c.getCatCodigo()}"><i class="bi bi-bookmarks"></i> ${c.getCatNombre()}</a>
                            </c:forEach>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>


        <main>
            <br><br><br><br>

            <!-- Carrusel -->
            <!-- Carrusel -->
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" alt="First slide">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Descuento Exclusivo</h5>
                            <p>Obtén hasta un 50% de descuento en productos seleccionados.</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="/FarmaciaWeb/Imagenes/visa.png" alt="Second slide">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Ofertas de Temporada</h5>
                            <p>Las mejores ofertas para la temporada de verano.</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="/FarmaciaWeb/Imagenes/regencia.jpg" alt="Third slide"> 
                        <div class="carousel-caption d-none d-md-block">
                            <h5>Compra Online</h5>
                            <p>Compra desde la comodidad de tu hogar y recibe en la puerta de tu casa.</p>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>


            <br>
            <div class="offer-banner">
                <div class="offer-text">
                    <span class="typing-animation">¡Ofertas con el <span class="highlight">30%</span> de descuento!</span>
                </div>
            </div>

            <br>
            <!-- Mini Carrusel de Tarjetas -->
            <div id="miniCarousel" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="card-deck">
                            <!-- Tarjeta 1 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 1">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 1</h5>
                                    <p class="card-text">Descripción breve del producto 1.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 2 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 2">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 2</h5>
                                    <p class="card-text">Descripción breve del producto 2.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 3 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 3">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 3</h5>
                                    <p class="card-text">Descripción breve del producto 3.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 4 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 4">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 4</h5>
                                    <p class="card-text">Descripción breve del producto 4.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 5 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 5">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 5</h5>
                                    <p class="card-text">Descripción breve del producto 5.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 6 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 6">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 6</h5>
                                    <p class="card-text">Descripción breve del producto 6.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 7 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 7">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 7</h5>
                                    <p class="card-text">Descripción breve del producto 7.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 8 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 8">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 8</h5>
                                    <p class="card-text">Descripción breve del producto 8.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 9 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 9">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 9</h5>
                                    <p class="card-text">Descripción breve del producto 9.</p>
                                </div>
                            </div>
                            <!-- Tarjeta 10 -->
                            <div class="card">
                                <img src="/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg" class="card-img-top" alt="Producto 10">
                                <div class="card-body">
                                    <h5 class="card-title">Producto 10</h5>
                                    <p class="card-text">Descripción breve del producto 10.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Puedes añadir más carousel-item aquí si es necesario -->
                </div>
                <a class="carousel-control-prev" href="#miniCarousel" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#miniCarousel" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>

            <br>
            <section id="productos" class="product-container">
                <div class="container">
                    <div class="row">
                        <c:forEach var="prod" items="${productos}">
                            <div class="col-md-4 col-sm-6 mb-4">
                                <div class="card h-100">
                                    <img src="${prod.getProFoto()}" class="card-img-top" alt="${prod.getProNombre()}">
                                    <div class="card-body d-flex flex-column">
                                        <h5 class="card-title">${prod.getProNombre()}</h5>
                                        <p class="card-text">${prod.getProDescripcion()}</p>
                                        <div class="mt-auto">
                                            <a href="/FarmaciaWeb/CtrProductoLi?accion=comprar&id=${prod.getProCodigo()}" class="btn btn-secondary">Carrito</a>
                                            <a href="/FarmaciaWeb/CtrProductoLi?accion=AgregarCarrito&id=${prod.getProCodigo()}" class="btn btn-primary">Agregar al carrito</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </section>
        </main>

        <div class="row-expand-lg py-4" id="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 text-black">
                        <h5>Información</h5>
                        <p>Dirección: calle 51d#2g63</p>
                        <p>Teléfono: 324 6794400</p>
                    </div>
                    <div class="col-md-4 text-black">
                        <h5>Métodos De Pago</h5>
                        <a href="#"><img src="/FarmaciaWeb/Imagenes/mastercard.png" alt="" height="30px" width="50px"></a>
                        <a href="#"><img src="/FarmaciaWeb/Imagenes/visa.png" alt="" height="40px" width="40px"></a>
                        <a href="#"><img src="/FarmaciaWeb/Imagenes/nequi.png" alt="" height="15px" width="40px"></a>
                    </div>
                    <div class="col-md-4 text-black">
                        <h5>Redes Sociales</h5>
                        <a href="#" class="text-black"> Facebook <i class="bi bi-facebook"></i></a><br>
                        <a href="#" class="text-black"> Instagram <i class="bi bi-instagram"></i></a>
                    </div>
                </div>
                <div class="col-md-4 text-black">
                    <p>Tu salud, nuestra prioridad. Descubre la comodidad de cuidarte desde casa con nuestra drogueria en linea. Expertos en bienestar a solo un click.</p>
                    <a href="#"><button type="button" class="btn btn-link">Terminos de servicio</button></a>
                    <a href="#"><button type="button" class="btn btn-link">Politica de privacidad</button></a>
                </div>
            </div>
        </div>

        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Sistema de PQR</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="/FarmaciaWeb/CtrPQR?accion=CrearPQR" method="post">
                            <div class="form-group">
                                <label for="name"> Nombre</label>
                                <input id="name" name="nombre" type="text" placeholder="Ingrese su nombre" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input id="email" name="email" type="text" placeholder="Ingrese su correo electrónico" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="subject">Asunto</label>
                                <input id="subject" name="asunto" type="text" placeholder="Ingrese el asunto de su PQR" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="message">Mensaje</label>
                                <textarea id="message" name="mensaje" placeholder="Ingrese su mensaje" class="form-control"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary">Enviar</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
