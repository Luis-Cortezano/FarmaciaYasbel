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
      out.write("        <link href=\"/FarmaciaWeb/CSS/PQR.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"/FarmaciaWeb/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"/FarmaciaWeb/JS/scripts.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light navbar-custom\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("            <img src=\"../Imagenes/lo-removebg-preview.png\" class=\"icon\"/>\n");
      out.write("                Farma-online yasbel.com\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0 mr-auto\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Buscar productos...\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn-search my-2 my-sm-0\" type=\"submit\">\n");
      out.write("                        <div class=\"original\">BUSCAR</div>\n");
      out.write("                        <div class=\"letters\">\n");
      out.write("                            <span>B</span>\n");
      out.write("                            <span>U</span>\n");
      out.write("                            <span>S</span>\n");
      out.write("                            <span>C</span>\n");
      out.write("                            <span>A</span>\n");
      out.write("                            <span>R</span>\n");
      out.write("                        </div>\n");
      out.write("                    </button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle nav-text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"bi bi-person\"></i> Mi Cuenta\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\"  data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\">PQR</a>\n");
      out.write("                            <a class=\"dropdown-item text-danger\" href=\"#\">Cerrar Sesion</a>\n");
      out.write("                            <a class=\"dropdown-item text-danger\" href=\"/FarmaciaWeb/CtrProductoLi?accion=home\">Sesion</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link nav-text-white\" href=\"#\">\n");
      out.write("                            <i class=\"bi bi-cart-check-fill\"></i> Carrito\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle nav-text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"bi bi-bookmark\"></i> Comprar por categorías\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Hogar</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Salud y Medicamentos</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Apartado de Bebes</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"offer-banner\">\n");
      out.write("            <p class=\"offer-text\">Ofertas con el 30% de descuento</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <div id=\"carouselExampleIndicators\" class=\"carousel slide\">\n");
      out.write("                <div class=\"carousel-indicators\">\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img src=\"...\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"...\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img src=\"...\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("                </button>\n");
      out.write("                <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"visually-hidden\">Next</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <section id=\"productos\" class=\"product-container\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Add more cards here -->\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("    <div class=\"row-expand-lg py-4\" id=\"footer\" >\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 text-black\">\n");
      out.write("                    <h5>Información</h5>\n");
      out.write("                    <p>Dirección: calle 51d#2g63 </p>\n");
      out.write("                    <p>Teléfono: 324 6794400 </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 text-black\">\n");
      out.write("                    <h5>Métodos De Pago</h5>\n");
      out.write("                    <a href=\"#\"><img src=\"../img/mastercard.png\" alt=\"\" height=\"40px\" width=\"70px\" ></i>\n");
      out.write("                        <a href=\"#\"><img src=\"../img/visa.png\" alt=\"\" height=\"60px\" width=\"50px\"></a>\n");
      out.write("                        <a href=\"#\"><img src=\"../img/nequi.png\" alt=\"\" height=\"20px\" width=\"55px\" > </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 text-black\">\n");
      out.write("                    <h5>Redes Sociales</h5>\n");
      out.write("                    <a href=\"#\" class=\"text-black\"> Facebook <i class=\"fa-brands fa-facebook\"></i></a><br>\n");
      out.write("                    <a href=\"#\" class=\"text-black\"> Instagram <i class=\"fa-brands fa-instagram\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 text-black\">\n");
      out.write("                <p>Tu salud, nuestra prioridad.Descubre la comodidad de cuidarte desde casa con nuestra drogueria\n");
      out.write("                    en linea. Expertos en bienestar a solo un click.\n");
      out.write("                </p>\n");
      out.write("                <a href=\"#\"><button type=\"button\" class=\"btn btn-link\">Terminos de servicio</button></a>\n");
      out.write("                <a href=\"#\"><button type=\"button\" class=\"btn btn-link\">politica de privacidad</button></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">Sistema de PQR</h1>\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"name\"> Nombre</label>\n");
      out.write("                        <input id=\"name\" type=\"text\" placeholder=\"Ingrese su nombre\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"email\"> Correo electrónico</label>\n");
      out.write("                        <input id=\"email\" type=\"email\" placeholder=\"Ingrese su correo\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"phone\"> Teléfono</label>\n");
      out.write("                        <input id=\"phone\" type=\"text\" placeholder=\"Ingrese su teléfono\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"type\"> Tipo de solicitud</label>\n");
      out.write("                        <select id=\"type\">\n");
      out.write("                            <option value=\"\" disabled selected>Seleccione una opción</option>\n");
      out.write("                            <option value=\"petition\">Petición</option>\n");
      out.write("                            <option value=\"complaint\">Queja</option>\n");
      out.write("                            <option value=\"claim\">Reclamo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"description\"> Descripción de la solicitud</label>\n");
      out.write("                        <textarea id=\"description\" placeholder=\"Ingrese los detalles de su solicitud\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"button\"> Enviar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\" id=\"modal\">\n");
      out.write("                <p>Si el problema persiste, llame a la linea +123-456-789</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("        integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("prod");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"card\">\n");
          out.write("\n");
          out.write("\n");
          out.write("                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Descripción de la imagen\" width=\"200\" height=\"200\">\n");
          out.write("                    <div class=\"card-info\">\n");
          out.write("                        <p class=\"text-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                        <p class=\"text-body\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"card-footer\">\n");
          out.write("                        <span class=\"text-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("\n");
          out.write("\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            ");
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
}
