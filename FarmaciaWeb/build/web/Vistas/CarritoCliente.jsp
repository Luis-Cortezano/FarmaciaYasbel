<%-- 
    Document   : CarritoClienrte
    Created on : 14/08/2024, 08:01:33 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Carrito de Compras</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css">
        <link href="../CSS/Gestion-C.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         <nav class="navbar navbar-expand-lg navbar-light navbar-custom">
    <a class="navbar-brand" href="#">
      <img src="../Imagenes/images.png" alt="Pill Bottle Icon" class="icon" width="30" height="30"/>
      Farma-online yasbel.com
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
        <li class="nav-item">
          <a class="nav-link nav-text-white" href="#">
            <i class="bi bi-person"></i> Mi cuenta
          </a>
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
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="#">Hogar</a>
            <a class="dropdown-item" href="#">Salud y Medicamentos</a>
            <a class="dropdown-item" href="#">Apartado de Bebes</a>
          </div>
        </li>
      </ul>
    </div>
  </nav>
         <div class="container my-5">
            <h1 class="mb-4">Carrito de compras</h1>
            <div class="table-responsive">
                <table class="table table-bordered">
                    <thead class="table-light">
                        <tr>
                            <th>Producto</th>
                            <th>Precio</th>
                            <th>Cantidad</th>
                            <th>Total</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <div class="d-flex align-items-center">
                                    <img src="../Imagenes/Acetaminofen.jpg" alt="Acetaminofén" width="64" height="64" class="me-3" />
                                    <div>
                                        <h5 class="mb-1">Acetaminofén</h5>
                                        <p class="mb-0 text-muted">Alivio del dolor</p>
                                    </div>
                                </div>
                            </td>
                            <td>COP 4.000</td>
                            <td>
                                <div class="input-group">
                                    <button class="btn btn-outline-dark">-</button>
                                    <input type="number" value="3" class="form-control text-center" style="width: 60px;" />
                                    <button class="btn btn-outline-dark">+</button>
                                </div>
                            </td>
                            <td>COP 12.000</td>
                            <td>
                                <button class="btn btn-outline-dark btn-sm">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                                    <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
                                    <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
                                    </svg>
                                </button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="row mt-4">
                <div class="col-md-6">
                    <div class="card summary-card">
                        <div class="summary-card-header">
                            <h2 class="card-title mb-0">Resumen de la compra</h2>
                        </div>
                        <div class="summary-card-body">
                            <div class="d-flex justify-content-between summary-item">
                                <span>Subtotal:</span>
                                <span>COP 12.000</span>
                            </div>
                            <div class="d-flex justify-content-between summary-item">
                                <span>Envío:</span>
                                <span>COP 2.000</span>
                            </div>
                            <div class="d-flex justify-content-between summary-total">
                                <span>Total:</span>
                                <span>COP 14.000</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 d-flex align-items-center">
                    <div class="d-flex flex-column w-100">
                        <button class="btn btn-outline mb-2" id="btn1" style="width: 200px; height: 37px;">Seguir comprando</button>
                        <button class="btn btn" id="btn2" style="width: 200px; height: 37px;">Proceder al pago</button>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
