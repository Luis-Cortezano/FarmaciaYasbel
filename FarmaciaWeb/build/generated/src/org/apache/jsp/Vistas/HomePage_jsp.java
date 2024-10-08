package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Farma-online</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\">\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/PQR.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/navbar.css\" rel=\"stylesheet\" type=\"text/css\"/> <!-- Archivo CSS separado -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"/FarmaciaWeb/JS/scripts.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"/FarmaciaWeb/JS/minicarrucel.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");

            if (session.getAttribute("log") == null || session.getAttribute("log").equals('0')) {
                response.sendRedirect("../Vistas/LogginPage.jsp");
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Barra de Navegación -->\r\n");
      out.write("        <!-- Barra de Navegación -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-custom navbar-fixed-top\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"/FarmaciaWeb/CtrProductoLi?accion=home\">\r\n");
      out.write("                <img src=\"/FarmaciaWeb/Imagenes/lo-removebg-preview.png\" class=\"icon\" width=\"60px\" height=\"60px\"/>\r\n");
      out.write("                Farmacia Yasbel\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0 mr-auto\" action=\"/FarmaciaWeb/CtrProductoLi?accion=buscar\" method=\"post\">\r\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar productos...\" aria-label=\"Search\" name=\"busqueda\">\r\n");
      out.write("                    <button class=\"btn-search my-2 my-sm-0\" type=\"submit\">\r\n");
      out.write("                        <div class=\"original\">BUSCAR</div>\r\n");
      out.write("                        <div class=\"letters\">\r\n");
      out.write("                            <span>B</span>\r\n");
      out.write("                            <span>U</span>\r\n");
      out.write("                            <span>S</span>\r\n");
      out.write("                            <span>C</span>\r\n");
      out.write("                            <span>A</span>\r\n");
      out.write("                            <span>R</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"bi bi-person\"></i> Mi Cuenta\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                            <a class=\"dropdown-item text-center\" href=\"#\"><i class=\"bi bi-person\"></i></a>\r\n");
      out.write("                            <a class=\"dropdown-item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsunombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                            <a class=\"dropdown-item\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUsutipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("                            <a class=\"dropdown-item\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">PQR</a>\r\n");
      out.write("                            <a class=\"dropdown-item text-danger\" href=\"/FarmaciaWeb/CtrProductoLi?accion=salir\">Cerrar Sesión</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                            <i class=\"bi bi-cart-check-fill\"></i> Carrito\r\n");
      out.write("                            (<label style=\"color: darkorange\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contador}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>)\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownCategories\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"bi bi-bookmark\"></i> Comprar por categorías\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownCategories\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <main>\r\n");
      out.write("            <br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("            <!-- Carrusel -->\r\n");
      out.write("            <!-- Carrusel -->\r\n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                <ol class=\"carousel-indicators\">\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("                    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    <div class=\"carousel-item active\">\r\n");
      out.write("                        <img class=\"d-block w-100\" src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" alt=\"First slide\">\r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h5>Descuento Exclusivo</h5>\r\n");
      out.write("                            <p>Obtén hasta un 50% de descuento en productos seleccionados.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-item\">\r\n");
      out.write("                        <img class=\"d-block w-100\" src=\"/FarmaciaWeb/Imagenes/visa.png\" alt=\"Second slide\">\r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h5>Ofertas de Temporada</h5>\r\n");
      out.write("                            <p>Las mejores ofertas para la temporada de verano.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-item\">\r\n");
      out.write("                        <img class=\"d-block w-100\" src=\"/FarmaciaWeb/Imagenes/regencia.jpg\" alt=\"Third slide\"> \r\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                            <h5>Compra Online</h5>\r\n");
      out.write("                            <p>Compra desde la comodidad de tu hogar y recibe en la puerta de tu casa.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"sr-only\">Next</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"offer-banner\">\r\n");
      out.write("                <div class=\"offer-text\">\r\n");
      out.write("                    <span class=\"typing-animation\">¡Ofertas con el <span class=\"highlight\">30%</span> de descuento!</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("            <!-- Mini Carrusel de Tarjetas -->\r\n");
      out.write("            <div id=\"miniCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    <div class=\"carousel-item active\">\r\n");
      out.write("                        <div class=\"card-deck\">\r\n");
      out.write("                            <!-- Tarjeta 1 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 1\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 1</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 1.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 2 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 2\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 2</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 2.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 3 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 3\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 3</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 3.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 4 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 4\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 4</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 4.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 5 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 5\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 5</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 5.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 6 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 6\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 6</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 6.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 7 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 7\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 7</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 7.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 8 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 8\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 8</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 8.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 9 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 9\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 9</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 9.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- Tarjeta 10 -->\r\n");
      out.write("                            <div class=\"card\">\r\n");
      out.write("                                <img src=\"/FarmaciaWeb/Imagenes/farmacia-la-botica.jpg\" class=\"card-img-top\" alt=\"Producto 10\">\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <h5 class=\"card-title\">Producto 10</h5>\r\n");
      out.write("                                    <p class=\"card-text\">Descripción breve del producto 10.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Puedes añadir más carousel-item aquí si es necesario -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#miniCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#miniCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"sr-only\">Next</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("            <section id=\"productos\" class=\"product-container\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row-expand-lg py-4\" id=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4 text-black\">\r\n");
      out.write("                        <h5>Información</h5>\r\n");
      out.write("                        <p>Dirección: calle 51d#2g63</p>\r\n");
      out.write("                        <p>Teléfono: 324 6794400</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 text-black\">\r\n");
      out.write("                        <h5>Métodos De Pago</h5>\r\n");
      out.write("                        <a href=\"#\"><img src=\"/FarmaciaWeb/Imagenes/mastercard.png\" alt=\"\" height=\"30px\" width=\"50px\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"/FarmaciaWeb/Imagenes/visa.png\" alt=\"\" height=\"40px\" width=\"40px\"></a>\r\n");
      out.write("                        <a href=\"#\"><img src=\"/FarmaciaWeb/Imagenes/nequi.png\" alt=\"\" height=\"15px\" width=\"40px\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 text-black\">\r\n");
      out.write("                        <h5>Redes Sociales</h5>\r\n");
      out.write("                        <a href=\"#\" class=\"text-black\"> Facebook <i class=\"bi bi-facebook\"></i></a><br>\r\n");
      out.write("                        <a href=\"#\" class=\"text-black\"> Instagram <i class=\"bi bi-instagram\"></i></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 text-black\">\r\n");
      out.write("                    <p>Tu salud, nuestra prioridad. Descubre la comodidad de cuidarte desde casa con nuestra drogueria en linea. Expertos en bienestar a solo un click.</p>\r\n");
      out.write("                    <a href=\"#\"><button type=\"button\" class=\"btn btn-link\">Terminos de servicio</button></a>\r\n");
      out.write("                    <a href=\"#\"><button type=\"button\" class=\"btn btn-link\">Politica de privacidad</button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Sistema de PQR</h1>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form action=\"/FarmaciaWeb/CtrPQR?accion=CrearPQR\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"name\"> Nombre</label>\r\n");
      out.write("                                <input id=\"name\" name=\"nombre\" type=\"text\" placeholder=\"Ingrese su nombre\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"email\">Email</label>\r\n");
      out.write("                                <input id=\"email\" name=\"email\" type=\"text\" placeholder=\"Ingrese su correo electrónico\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"subject\">Asunto</label>\r\n");
      out.write("                                <input id=\"subject\" name=\"asunto\" type=\"text\" placeholder=\"Ingrese el asunto de su PQR\" class=\"form-control\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"message\">Mensaje</label>\r\n");
      out.write("                                <textarea id=\"message\" name=\"mensaje\" placeholder=\"Ingrese su mensaje\" class=\"form-control\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Enviar</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("c");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categorias}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCatCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"catid\" id=\"catid\">\r\n");
          out.write("                                <a class=\"dropdown-item\" href=\"/FarmaciaWeb/CtrProductoLi?accion=buscarcat&catid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCatCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"bi bi-bookmarks\"></i> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getCatNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("prod");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class=\"col-md-4 col-sm-6 mb-4\">\r\n");
          out.write("                                <div class=\"card h-100\">\r\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"card-img-top\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    <div class=\"card-body d-flex flex-column\">\r\n");
          out.write("                                        <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                                        <p class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                        <div class=\"mt-auto\">\r\n");
          out.write("                                            <a href=\"/FarmaciaWeb/CtrProductoLi?accion=comprar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-secondary\">Carrito</a>\r\n");
          out.write("                                            <a href=\"/FarmaciaWeb/CtrProductoLi?accion=AgregarCarrito&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getProCodigo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-primary\">Agregar al carrito</a>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
