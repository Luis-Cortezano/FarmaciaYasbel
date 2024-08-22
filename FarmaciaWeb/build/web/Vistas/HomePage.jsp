<%-- 
    Document   : Index
    Created on : 13/08/2024, 08:36:58 AM
    Author     : SENA
--%>
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
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="/FarmaciaWeb/JS/scripts.js" type="text/javascript"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light navbar-custom">
            <a class="navbar-brand" href="#">
                <img src="/FarmaciaWeb/Imagenes/lo-removebg-preview.png" class="icon" width="60px" height="60px"/>
                Farmacia yasbel
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">
                <form class="form-inline my-2 my-lg-0 mr-auto">
                    <input class="form-control mr-sm-2" type="search" placeholder="Buscar productos..." aria-label="Search">
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
                        <a class="nav-link dropdown-toggle nav-text-white" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="bi bi-person"></i> Mi Cuenta
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item"  data-bs-toggle="modal" data-bs-target="#exampleModal">PQR</a>
                            <a class="dropdown-item text-danger" href="#">Cerrar Sesion</a>
                            <a class="dropdown-item text-danger" href="/FarmaciaWeb/CtrProductoLi?accion=home">Sesion</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link nav-text-white" href="#">
                            <i class="bi bi-cart-check-fill"></i> Carrito
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle nav-text-white" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="bi bi-bookmark"></i> Comprar por categorías
                        </a>
                        <c:forEach var="cat" items="${categoria}">
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="/FarmaciaWeb/CtrProductoLi?accion=buscarcat&catid=${cat.getId()}"><i class="bi bi-bookmarks"></i>${cat.getNombre()}</a>
                            <input type="hidden" value="${cat.getId()}" name="catid" id="catid">
                        </div>
                        </c:forEach>
                    </li>
                </ul>
            </div>
        </nav>
        <br>
        <br>
        <br>
        <br>

        <div class="offer-banner">
            <p class="offer-text">Ofertas con el 30% de descuento</p>
        </div>
        
            <div id="carouselExampleIndicators" class="carousel slide">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="..." class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="..." class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="..." class="d-block w-100" alt="...">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        
        <br>
        <section id="productos" class="product-container">
            <c:forEach var="prod" items="${productos}">
                <div class="card">


                    <img src="${prod.getFoto()}" alt="Descripción de la imagen" width="200" height="200">
                    <div class="card-info">
                        <p class="text-title">${prod.getNombre()}</p>
                        <p class="text-body">${prod.getDescripcion()}</p>
                    </div>
                    <div class="card-footer">
                        <span class="text-title">${prod.getPrecio()}</span>


                    </div>
                </div>
            </c:forEach>

            <!-- Add more cards here -->

        </section>
    </main>
    <div class="row-expand-lg py-4" id="footer" >
        <div class="container" >
            <div class="row">
                <div class="col-md-4 text-black">
                    <h5>Información</h5>
                    <p>Dirección: calle 51d#2g63 </p>
                    <p>Teléfono: 324 6794400 </p>
                </div>
                <div class="col-md-4 text-black">
                    <h5>Métodos De Pago</h5>
                    <a href="#"><img src="../img/mastercard.png" alt="" height="40px" width="70px" ></i>
                        <a href="#"><img src="../img/visa.png" alt="" height="60px" width="50px"></a>
                        <a href="#"><img src="../img/nequi.png" alt="" height="20px" width="55px" > </a>
                </div>
                <div class="col-md-4 text-black">
                    <h5>Redes Sociales</h5>
                    <a href="#" class="text-black"> Facebook <i class="bi bi-facebook"></i></a><br>
                    <a href="#" class="text-black"> Instagram <i class="bi bi-instagram"></i></a>
                </div>
            </div>
            <div class="col-md-4 text-black">
                <p>Tu salud, nuestra prioridad.Descubre la comodidad de cuidarte desde casa con nuestra drogueria
                    en linea. Expertos en bienestar a solo un click.
                </p>
                <a href="#"><button type="button" class="btn btn-link">Terminos de servicio</button></a>
                <a href="#"><button type="button" class="btn btn-link">politica de privacidad</button></a>

            </div>

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
                <div class="form">
                    <div class="form-group">
                        <label for="name"> Nombre</label>
                        <input id="name" type="text" placeholder="Ingrese su nombre">
                    </div>
                    <div class="form-group">
                        <label for="email"> Correo electrónico</label>
                        <input id="email" type="email" placeholder="Ingrese su correo">
                    </div>
                    <div class="form-group">
                        <label for="phone"> Teléfono</label>
                        <input id="phone" type="text" placeholder="Ingrese su teléfono">
                    </div>
                    <div class="form-group">
                        <label for="type"> Tipo de solicitud</label>
                        <select id="type">
                            <option value="" disabled selected>Seleccione una opción</option>
                            <option value="petition">Petición</option>
                            <option value="complaint">Queja</option>
                            <option value="claim">Reclamo</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="description"> Descripción de la solicitud</label>
                        <textarea id="description" placeholder="Ingrese los detalles de su solicitud"></textarea>
                    </div>
                    <button type="submit" class="button"> Enviar</button>
                </div>
            </div>
            <div class="modal-footer" id="modal">
                <p>Si el problema persiste, llame a la linea +123-456-789</p>
            </div>
        </div>
    </div>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
crossorigin="anonymous"></script>

</body>
</html>
