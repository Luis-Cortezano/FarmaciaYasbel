package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Farma-online</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\">\n");
      out.write("        <link href=\"../CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"../JS/scripts.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light navbar-custom\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("       \n");
      out.write("      <img src=\"../Imagenes/images.png\" alt=\"Icon\" class=\"icon\"/>\n");
      out.write("      Farma-online yasbel.com\n");
      out.write("    </a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("      <form class=\"form-inline my-2 my-lg-0 mr-auto\">\n");
      out.write("        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar productos...\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn-search my-2 my-sm-0\" type=\"submit\">\n");
      out.write("          <div class=\"original\">BUSCAR</div>\n");
      out.write("          <div class=\"letters\">\n");
      out.write("            <span>B</span>\n");
      out.write("            <span>U</span>\n");
      out.write("            <span>S</span>\n");
      out.write("            <span>C</span>\n");
      out.write("            <span>A</span>\n");
      out.write("            <span>R</span>\n");
      out.write("          </div>\n");
      out.write("        </button>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle nav-text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"bi bi-person\"></i> Mi Cuenta\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <a class=\"dropdown-item\"  data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">PQR</a>\n");
      out.write("            <a class=\"dropdown-item text-danger\" href=\"#\">Cerrar Sesion</a>\n");
      out.write("            <a class=\"dropdown-item text-danger\" href=\"/FarmaciaWeb/CtrProductoLi?accion=home\">Sesion</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link nav-text-white\" href=\"#\">\n");
      out.write("            <i class=\"bi bi-cart-check-fill\"></i> Carrito\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle nav-text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"bi bi-bookmark\"></i> Comprar por categorías\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Hogar</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Salud y Medicamentos</a>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">Apartado de Bebes</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <div class=\"offer-banner\">\n");
      out.write("        <p class=\"offer-text\">Ofertas con el 30% de descuento</p>\n");
      out.write("      </div>\n");
      out.write("<div class=\"carousel-container\">\n");
      out.write("    <div class=\"carousel\">\n");
      out.write("      <div class=\"carousel-item\"><img src=\"../img/acetaminofen.jpg\" alt=\"Image 1\"></div>\n");
      out.write("      <div class=\"carousel-item\"><img src=\"../img/acetaminofen.jpg\" alt=\"Image 2\"></div>\n");
      out.write("      <div class=\"carousel-item\"><img src=\"../img/dolex.jpg\" alt=\"Image 3\"></div>\n");
      out.write("      <div class=\"carousel-item\"><img src=\"../img/enjBucal.png\" alt=\"Image 4\"></div>\n");
      out.write("      <!-- Add more images as needed -->\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    <br>\n");
      out.write("            <section id=\"productos\" class=\"product-container\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <c:foreach var=\"prod\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${producto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Descripción de la imagen\">\n");
      out.write("                <div class=\"card-info\">\n");
      out.write("                    <p class=\"text-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    <p class=\"text-body\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-footer\">\n");
      out.write("                    <span class=\"text-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                    <div class=\"card-button\">\n");
      out.write("                        <svg class=\"svg-icon\" viewBox=\"0 0 20 20\">\n");
      out.write("                            <path d=\"M17.72,5.011H8.026c-0.271,0-0.49,0.219-0.49,0.489c0,0.271,0.219,0.489,0.49,0.489h8.962l-1.979,4.773H6.763L4.935,5.343C4.926,5.316,4.897,5.309,4.884,5.286c-0.011-0.024,0-0.051-0.017-0.074C4.833,5.166,4.025,4.081,2.33,3.908C2.068,3.883,1.822,4.075,1.795,4.344C1.767,4.612,1.962,4.853,2.231,4.88c1.143,0.118,1.703,0.738,1.808,0.866l1.91,5.661c0.066,0.199,0.252,0.333,0.463,0.333h8.924c0.116,0,0.22-0.053,0.308-0.128c0.027-0.023,0.042-0.048,0.063-0.076c0.026-0.034,0.063-0.058,0.08-0.099l2.384-5.75c0.062-0.151,0.046-0.323-0.045-0.458C18.036,5.092,17.883,5.011,17.72,5.011z\"></path>\n");
      out.write("                            <path d=\"M8.251,12.386c-1.023,0-1.856,0.834-1.856,1.856s0.833,1.853,1.856,1.853c1.021,0,1.853-0.83,1.853-1.853S9.273,12.386,8.251,12.386z M8.251,15.116c-0.484,0-0.877-0.393-0.877-0.874c0-0.484,0.394-0.878,0.877-0.878c0.482,0,0.875,0.394,0.875,0.878C9.126,14.724,8.733,15.116,8.251,15.116z\"></path>\n");
      out.write("                            <path d=\"M13.972,12.386c-1.022,0-1.855,0.834-1.855,1.856s0.833,1.853,1.855,1.853s1.854-0.83,1.854-1.853S14.994,12.386,13.972,12.386z M13.972,15.116c-0.484,0-0.878-0.393-0.878-0.874c0-0.484,0.394-0.878,0.878-0.878c0.482,0,0.875,0.394,0.875,0.878C14.847,14.724,14.454,15.116,13.972,15.116z\"></path>\n");
      out.write("                        </svg>\n");
      out.write("                    </div>\n");
      out.write("                    </c:foreach>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Add more cards here -->\n");
      out.write("          \n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("    <div class=\"row-expand-lg py-4\" id=\"footer\" >\n");
      out.write("        <div class=\"container\" >\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 text-black\">\n");
      out.write("              <h5>Información</h5>\n");
      out.write("              <p>Dirección: calle 51d#2g63 </p>\n");
      out.write("              <p>Teléfono: 324 6794400 </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 text-black\">\n");
      out.write("              <h5>Métodos De Pago</h5>\n");
      out.write("              <a href=\"#\"><img src=\"../img/mastercard.png\" alt=\"\" height=\"40px\" width=\"70px\" ></i>\n");
      out.write("              <a href=\"#\"><img src=\"../img/visa.png\" alt=\"\" height=\"60px\" width=\"50px\"></a>\n");
      out.write("              <a href=\"#\"><img src=\"../img/nequi.png\" alt=\"\" height=\"20px\" width=\"55px\" > </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 text-black\">\n");
      out.write("              <h5>Redes Sociales</h5>\n");
      out.write("              <a href=\"#\" class=\"text-black\"> Facebook <i class=\"fa-brands fa-facebook\"></i></a><br>\n");
      out.write("              <a href=\"#\" class=\"text-black\"> Instagram <i class=\"fa-brands fa-instagram\"></i></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 text-black\">\n");
      out.write("            <p>Tu salud, nuestra prioridad.Descubre la comodidad de cuidarte desde casa con nuestra drogueria\n");
      out.write("              en linea. Expertos en bienestar a solo un click.\n");
      out.write("            </p>\n");
      out.write("            <a href=\"#\"><button type=\"button\" class=\"btn btn-link\">Terminos de servicio</button></a>\n");
      out.write("            <a href=\"#\"><button type=\"button\" class=\"btn btn-link\">politica de privacidad</button></a>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Sistema de PQR</h1>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"name\"> Nombre</label>\n");
      out.write("                                <input id=\"name\" type=\"text\" placeholder=\"Ingrese su nombre\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"email\"> Correo electrónico</label>\n");
      out.write("                                <input id=\"email\" type=\"email\" placeholder=\"Ingrese su correo\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"phone\"> Teléfono</label>\n");
      out.write("                                <input id=\"phone\" type=\"text\" placeholder=\"Ingrese su teléfono\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"type\"> Tipo de solicitud</label>\n");
      out.write("                                <select id=\"type\">\n");
      out.write("                                    <option value=\"\" disabled selected>Seleccione una opción</option>\n");
      out.write("                                    <option value=\"petition\">Petición</option>\n");
      out.write("                                    <option value=\"complaint\">Queja</option>\n");
      out.write("                                    <option value=\"claim\">Reclamo</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"description\"> Descripción de la solicitud</label>\n");
      out.write("                                <textarea id=\"description\" placeholder=\"Ingrese los detalles de su solicitud\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"button\"> Enviar</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\" id=\"modal\">\n");
      out.write("                        <p>Si el problema persiste, llame a la linea +123-456-789</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("            integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
