package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminiatracionProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <title>Yasbel Drugs - Administración de Productos</title>\n");
      out.write("          <link href=\"../CSS/Gestion.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container\">\n");
      out.write("    <h1 class=\"title\">Yasbel Drugs - Administración de Productos</h1>\n");
      out.write("    <div class=\"grid\">\n");
      out.write("      <div class=\"form-section\">\n");
      out.write("        <h2 class=\"subtitle\">Agregar Nuevo Producto</h2>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"name\">Nombre</label>\n");
      out.write("          <input id=\"name\" name=\"name\" type=\"text\" placeholder=\"Nombre del Producto\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"description\">Descripción</label>\n");
      out.write("          <textarea id=\"description\" name=\"description\" placeholder=\"Descripción del Producto\"></textarea>\n");
      out.write("        </div>\n");
      out.write("        <select id=\"category\" name=\"category\">\n");
      out.write("          <option value=\"\" disabled selected>Selecciona una categoría</option>\n");
      out.write("          <option value=\"Categoria 1\">Anti-pirectico</option>\n");
      out.write("          <option value=\"Categoria 2\">Desinflamatorio</option>\n");
      out.write("          <option value=\"Categoria 3\">Sales de Rehidratación</option>\n");
      out.write("          <option value=\"Categoria 4\">Anti-Diarreica</option>\n");
      out.write("          <option value=\"Categoria 4\">Sistema digestivo y Metabolico</option>\n");
      out.write("        </select>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"price\" style=\"padding-top: 10px;\">Stock</label>\n");
      out.write("          <input id=\"price\" name=\"price\" type=\"number\" placeholder=\"Cantidad\">\n");
      out.write("        </div>      \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"price\">Precio</label>\n");
      out.write("          <input id=\"price\" name=\"price\" type=\"number\" placeholder=\"Precio del Producto\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("          <label for=\"imageUrl\">URL de la Imagen</label>\n");
      out.write("          <input id=\"imageUrl\" name=\"imageUrl\" type=\"text\" placeholder=\"URL de la Imagen\">\n");
      out.write("        </div>\n");
      out.write("        <button class=\"button\">Agregar Producto</button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"products-section\">\n");
      out.write("        <h2 class=\"subtitle\">Productos Existentes</h2>\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <div class=\"card-header\">\n");
      out.write("            <h3 class=\"card-title\">Panadol</h3>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-content\">\n");
      out.write("            <img src=\"../Imagenes/panadol-20s.png\" style=\"width: 250px; height: 250px;\" alt=\"Panadol\" class=\"product-image\">\n");
      out.write("            <p>Analgésico para el dolor de cabeza</p>\n");
      out.write("            <div class=\"card-footer\">\n");
      out.write("              <span class=\"price\">$5.999</span>\n");
      out.write("              <button class=\"button small\">Editar</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Repeat similar blocks for other products -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
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
