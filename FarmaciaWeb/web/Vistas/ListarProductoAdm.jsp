<%-- 
    Document   : ListarProducto
    Created on : 14/08/2024, 07:55:01 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <title>Listar Productos</title>
        <link href="../CSS/IndexAdmin.css" rel="stylesheet" type="text/css"/>
    </head>
    <%
        /* if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')){
        response.sendRedirect("../Vistas/Loggin.jsp");
    }*/
    %>

    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3 sidebar">
                    <div class="header d-flex justify-content-between align-items-center mb-3">
                        <a href="#" class="logo d-flex align-items-center text-light">
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <path d="M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z"/>
                            <path d="m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9"/>
                            <path d="M12 3v6"/>
                            </svg>
                            Farmacia Yasbel
                        </a>
                        <button class="notification-btn btn btn-link text-light">
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <path d="M6 8a6 6 0 0 1 12 0c0 7 3 9 3 9H3s3-2 3-9"/>
                            <path d="M10.3 21a1.94 1.94 0 0 0 3.4 0"/>
                            </svg>
                            <span class="sr-only">Toggle notifications</span>
                        </button>
                    </div>
                    <nav class="nav">
                       
                        <div class="collapsible">
                            <button class="collapsible-trigger">
                                Gestión de Productos
                                <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                                <path d="m9 18 6-6-6-6"/>
                                </svg>
                            </button>
                            <div class="collapsible-content">
                                <a href="#" class="collapsible-link">Droguería</a>
                                <a href="IndexAdmin.jsp" class="collapsible-link submenu-btn">Inventario</a>
                                <a href="GestionPedidoAdm.jsp" class="collapsible-link submenu-btn">Procesamiento de Pedidos</a>
                                <a href="#" class="collapsible-link submenu-btn">Gestión de Clientes</a>
                                <a href="ListarProductoAdm.jsp" class="collapsible-link submenu-btn">Gestion de Productos</a>
                                <a href="#" class="collapsible-link submenu-btn">Sistema de Pagos y Facturación</a>
                                <a href="#" class="collapsible-link submenu-btn">Análisis y Estadísticas</a>
                                <a href="#" class="collapsible-link submenu-btn">Productos Disponibles</a>
                            </div>
                        </div>
                    </nav>
                </div>
                <div class="col-md-9 main-content">
                    <header class="header d-flex justify-content-between align-items-center mb-3">
                        <a href="#" class="menu-toggle btn btn-link">
                            <svg class="icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <path d="M3 9h18v10a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V9Z"/>
                            <path d="m3 9 2.45-4.9A2 2 0 0 1 7.24 3h9.52a2 2 0 0 1 1.8 1.1L21 9"/>
                            <path d="M12 3v6"/>
                            </svg>
                            <span class="sr-only">Home</span>
                        </a>
                        <form class="search-form d-flex">
                            <input type="search" class="form-control" placeholder="Buscar productos...">
                            <svg class="icon search-icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                            <circle cx="11" cy="11" r="8"/>
                            <path d="m21 21-4.3-4.3"/>
                            </svg>
                        </form>
                        <div class="user-menu">
                            <button class="user-btn btn btn-link">
                                <img src="/placeholder.svg" width="32" height="32" alt="Avatar" class="avatar">
                                <span class="sr-only">Toggle user menu</span>
                            </button>
                            <div class="user-menu-content">
                                <div class="user-menu-label">Mi Cuenta</div>
                                <div class="user-menu-separator"></div>
                                <a href="#" class="user-menu-item">Cerrar sesión</a>
                                
                            </div>
                        </div>
                    </header>
                    <main class="main">
                        <div class="container mt-5 border" style="border-radius: 15px">
                            <div class="row">
                                <div class="col-sm-4"></div>
                                <div class="col-sm-4"></div>
                                <div class="col-sm-4">
                                    <form class="form-inline mt-4" action="/AppWeb/CtrProducto?accion=buscarn">
                                        <div class="form-group mx-sm-3 mb-2">
                                            <button type="submit" class="btn btn-secondary mb-2" name="accion" value="buscarn" style="background: #74BD64"><i class="bi bi-search"></i> Buscar</button>
                                            <input type="text" class="form-control" name="txtbuscar" placeholder="nombre del producto">
                                            
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <table class="table table-bordered">
                                <thead class="thead-light border">
                                    <tr table-success>
                                        <th scope="col" class="text-center border" width="110"><a class="btn btn-success ml-2" data-bs-toggle="modal" data-bs-target="#agregarproducto" style="background: #74BD64"><i class="bi bi-database-fill-add"></i></a></th>
                                        <th scope="col" colspan="7" class="text-center border">PRODUCTOS DE LA FARMACIA</th>
                                    </tr>
                                    <tr>
                                        <th scope="col" class="text-center border">Id</th>
                                        <th scope="col" class="text-center border">Nombre</th>
                                        <th scope="col" class="text-center border">Foto</th>
                                        <th scope="col" class="text-center border">Descripcion</th>
                                        <th scope="col" class="text-center border">Precio</th>
                                        <th scope="col" class="text-center border">Stock</th>
                                        <th scope="col" class="text-center border">Categ</th>
                                        <th scope="col" class="text-center border">Acciones</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="pro" items="${producto}">  
                                    <tr>
                                        <th scope="row" class="border">${pro.getId()}</th>
                                        <td class="border">${pro.getNombre()}</td>
                                        <td class="border"><img src="${pro.getFoto()}" width="100" height="80"></td>
                                        <td class="border">${pro.getDescripcion()}</td>
                                        <td class="border">${pro.getPrecio()}</td>
                                        <td class="border">${pro.getStok()}</td>
                                        <td class="border">${pro.getCategoria()}</td>
                                        <td scope="col" class ="text-center border">
                                            <input type="hidden" name="id" id="id" value="${pro.getId()}">
                                            <a class="btn btn-warning" href="/AppWeb/CtrProducto?accion=EditarPro&idpro=${pro.getId()}" data-bs-toggle="modal" data-bs-target="#editarproducto"><i class="bi bi-pencil-fill"></i></a>
                                            <a class="btn btn-danger" id="btneliminar" href="#"><i class="bi bi-trash-fill"></i></a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>

                        <!-- Modal -->
                        <div class="modal fade" id="agregarproducto" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title fs-5" id="exampleModalLabel">Agregar Producto</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form class="form-sing" action="/AppWeb/CtrProducto?accion=Agregar" method="POST" >
                                            <div class="form-row">
                                                <div class="col-6">
                                                    <label>Nombre</label> 
                                                    <input type="text" class="form-control" name="txtnombre" placeholder="nombre" required="">
                                                </div>  
                                                <div class="col-6">
                                                    <label>Precio</label> 
                                                    <input type="number" class="form-control" name="txtprecio" placeholder="precio" required="">
                                                </div>
                                                <div class="col-6">
                                                    <label>Descripcion</label> 
                                                    <input type="text" class="form-control" name="txtdescripcion" placeholder="descripcion" required="">
                                                </div>
                                                <div class="col-6">
                                                    <label>Stock</label> 
                                                    <input type="number" class="form-control" name="txtstock" placeholder="disponibilidad" required="">
                                                </div>
                                                <div class="col-6">
                                                    <label>Categoria</label> 
                                                    <select class="form-control" name="categoria">
                                                        <c:forEach var="cat" items="${categorias}">
                                                            <option value="${cat.getId()}">${cat.getNombre()}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                                <div class="col-6">
                                                    <label>Imagen</label> 
                                                    <input type="file" class="form-control" name="foto" id="foto" required="">
                                                </div>
                                            </div>    

                                            <center>
                                                <button type="submit" class="btn btn-primary mt-4 mb-2 formulario_btn" name="btnagregar" value="Agregar">Agregar <i class="bi bi-floppy"></i></button>
                                                <a class="btn btn-danger formulario_btn mt-4 mb-2" name="regresar" href="#">Regrsar <i class="bi bi-box-arrow-left"></i></a>
                                            </center>

                                        </form>
                                    </div>
                                    <div class="modal-footer">

                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Moda2 -->
                        <div class="modal fade" id="editarproducto" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h1 class="modal-title fs-5" id="exampleModalLabel">Editar Producto</h1>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form class="form-sing" action="/AppWeb/CtrProducto?accion=actualizarpro" method="POST" >
                                            <div class="form-row">
                                                <div class="col-6">
                                                    <label>Nombre</label> 
                                                    <input type="hidden" class="form-control" name="txtid" id="txtid" value="${Productoe.getId()}"> 
                                                    <input type="text" class="form-control" name="txtnombre" value="${Productoe.getNombre()}" placeholder="nombre" required="">
                                                </div>  
                                                <div class="col-6">
                                                    <label>Precio</label> 
                                                    <input type="number" class="form-control" name="txtprecio" value="${Productoe.getPrecio()}" placeholder="precio" required="">
                                                </div>
                                                <div class="col-6">
                                                    <label>Descripcion</label> 
                                                    <input type="text" class="form-control" name="txtdescripcion" value="${Productoe.getDescripcion()}" placeholder="descripcion" required="">
                                                </div>
                                                <div class="col-6">
                                                    <label>Stock</label> 
                                                    <input type="number" class="form-control" value="${Productoe.getStok()}" name="txtstock" placeholder="disponibilidad" required="">
                                                </div>
                                                <div class="col-6">
                                                    <label>Categoria</label> 
                                                    <select class="form-control" name="categoria" onchange="actualizarInputOculto(this)">
                                                        <c:forEach var="cat" items="${categorias}">
                                                            <option value="${cat.getId()}">${cat.getNombre()}</option>
                                                        </c:forEach>
                                                    </select>
                                                    <input type="hidden" class="form-control" name="cat" id="cat" value="${Productoe.getCategoria()}"> 
                                                    <script>
                                                        function actualizarInputOculto(selectElement) {
                                                            var inputOculto = document.getElementById("cat");
                                                            inputOculto.value = selectElement.value;
                                                        }
                                                    </script>
                                                </div>
                                                <div class="col-6">
                                                    <label>Imagen</label> 
                                                    <input type="file" class="form-control" name="foto" id="foto" onchange="actualizarInputOculto2(this)">
                                                    <input type="hidden" class="form-control" value="${Productoe.getFoto()}" name="foto2" id="foto2">
                                                    <script>
                                                        function actualizarInputOculto2(selectElement) {
                                                            var inputOculto = document.getElementById("foto2");
                                                            var filePath = selectElement.value;
                                                            var fileName = filePath.split('\\').pop().split('/').pop(); // Esto obtiene el nombre del archivo
                                                            inputOculto.value = "Imagenes/" + fileName;
                                                            //inputOculto.value = "Imagenes/" + selectElement.value;
                                                        }
                                                    </script>
                                                </div>
                                            </div>    

                                            <center>
                                                <button type="submit" class="btn btn-primary mt-4 mb-2 formulario_btn" name="btnagregar" value="Agregar">Agregar <i class="bi bi-floppy"></i></button>
                                                <a class="btn btn-danger formulario_btn mt-4 mb-2" name="regresar" href="#">Regrsar <i class="bi bi-box-arrow-left"></i></a>
                                            </center>

                                        </form>
                                    </div>
                                    <div class="modal-footer">

                                    </div>
                                </div>
                            </div>
                        </div>

                    </main>
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>                        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>  
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="../JS/IndexAdmin.js" type="text/javascript"></script>
        <script src="/AppWeb/JS/Funciones3.js" type="text/javascript"></script>
        <script>
                                            $(document).ready(function () {

            <c:if test="${editarPro}">
            $('#editarproducto').modal('show');
        </c:if>

                                            });
    </script>
</body>
</html>
