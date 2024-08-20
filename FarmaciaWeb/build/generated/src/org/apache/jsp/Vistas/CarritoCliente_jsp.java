package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CarritoCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <title>Carrito de Compras</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"../CSS/Gestion-C.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-expand-lg navbar-light navbar-custom\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("      <img src=\"../Imagenes/images.png\" alt=\"Pill Bottle Icon\" class=\"icon\" width=\"30\" height=\"30\"/>\n");
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
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link nav-text-white\" href=\"#\">\n");
      out.write("            <i class=\"bi bi-person\"></i> Mi cuenta\n");
      out.write("          </a>\n");
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
      out.write("         <div class=\"container my-5\">\n");
      out.write("            <h1 class=\"mb-4\">Carrito de compras</h1>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-bordered\">\n");
      out.write("                    <thead class=\"table-light\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Producto</th>\n");
      out.write("                            <th>Precio</th>\n");
      out.write("                            <th>Cantidad</th>\n");
      out.write("                            <th>Total</th>\n");
      out.write("                            <th>Eliminar</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"d-flex align-items-center\">\n");
      out.write("                                    <img src=\"../Imagenes/Acetaminofen.jpg\" alt=\"Acetaminofén\" width=\"64\" height=\"64\" class=\"me-3\" />\n");
      out.write("                                    <div>\n");
      out.write("                                        <h5 class=\"mb-1\">Acetaminofén</h5>\n");
      out.write("                                        <p class=\"mb-0 text-muted\">Alivio del dolor</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>COP 4.000</td>\n");
      out.write("                            <td>\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <button class=\"btn btn-outline-dark\">-</button>\n");
      out.write("                                    <input type=\"number\" value=\"3\" class=\"form-control text-center\" style=\"width: 60px;\" />\n");
      out.write("                                    <button class=\"btn btn-outline-dark\">+</button>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td>COP 12.000</td>\n");
      out.write("                            <td>\n");
      out.write("                                <button class=\"btn btn-outline-dark btn-sm\">\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-trash\" viewBox=\"0 0 16 16\">\n");
      out.write("                                    <path d=\"M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z\"/>\n");
      out.write("                                    <path fill-rule=\"evenodd\" d=\"M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z\"/>\n");
      out.write("                                    </svg>\n");
      out.write("                                </button>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row mt-4\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"card summary-card\">\n");
      out.write("                        <div class=\"summary-card-header\">\n");
      out.write("                            <h2 class=\"card-title mb-0\">Resumen de la compra</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"summary-card-body\">\n");
      out.write("                            <div class=\"d-flex justify-content-between summary-item\">\n");
      out.write("                                <span>Subtotal:</span>\n");
      out.write("                                <span>COP 12.000</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between summary-item\">\n");
      out.write("                                <span>Envío:</span>\n");
      out.write("                                <span>COP 2.000</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between summary-total\">\n");
      out.write("                                <span>Total:</span>\n");
      out.write("                                <span>COP 14.000</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 d-flex align-items-center\">\n");
      out.write("                    <div class=\"d-flex flex-column w-100\">\n");
      out.write("                        <button class=\"btn btn-outline mb-2\" id=\"btn1\" style=\"width: 200px; height: 37px;\">Seguir comprando</button>\n");
      out.write("                        <button class=\"btn btn\" id=\"btn2\" style=\"width: 200px; height: 37px;\">Proceder al pago</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\n");
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
