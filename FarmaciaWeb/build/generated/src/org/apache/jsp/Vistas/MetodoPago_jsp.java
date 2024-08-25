package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MetodoPago_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
      out.write("       <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("       <title>Seleccionar Método de Pago</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"bg-light py-5\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 mb-4\">\n");
      out.write("                    <h2>Seleccionar Método de Pago</h2>\n");
      out.write("                    <div class=\"form-check\">\n");
      out.write("                        <input class=\"form-check-input\" type=\"radio\" id=\"contraentrega\" name=\"payment-method\" value=\"cash-on-delivery\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"cash-on-delivery\">Pago en Efectivo (Contraentrega)</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-check\">\n");
      out.write("                        <input class=\"form-check-input\" type=\"radio\" id=\"nequi\" name=\"payment-method\" value=\"nequi\">\n");
      out.write("                        <label class=\"form-check-label\" for=\"nequi\">Nequi</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <h3>Resumen del Pedido</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"d-flex justify-content-between\">\n");
      out.write("                                <span>Producto 1</span>\n");
      out.write("                                <span>$150.000</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between\">\n");
      out.write("                                <span>Producto 2</span>\n");
      out.write("                                <span>$90.000</span>\n");
      out.write("                            </div>\n");
      out.write("                            <hr>\n");
      out.write("                            <div class=\"d-flex justify-content-between fw-bold\">\n");
      out.write("                                <span>Subtotal</span>\n");
      out.write("                                <span>$240.000</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between fw-bold\">\n");
      out.write("                                <span>Envío</span>\n");
      out.write("                                <span>$15.000</span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"d-flex justify-content-between fw-bold\">\n");
      out.write("                                <span>Total</span>\n");
      out.write("                                <span>$255.000</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer text-center\" id=\"card-footer\">\n");
      out.write("                            <button class=\"btn  w-100\" style=\"background-color: #74BD64;\">Continuar al Pago</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n");
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
