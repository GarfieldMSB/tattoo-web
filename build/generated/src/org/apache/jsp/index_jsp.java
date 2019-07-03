package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Tattoo</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\"/>\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"img-background-top\">\r\n");
      out.write("                <img src=\"images/Fondo1.png\"/>\r\n");
      out.write("                <div class=\"text\">\r\n");
      out.write("                    <h2>El querer plasmar en tu cuerpo tus\r\n");
      out.write("                emociones es el deseo perfecto</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"#\"><img class=\"logo\" src=\"images/Logo.png\"></a>\r\n");
      out.write("            <input type=\"checkbox\" id=\"btn-menu\">\r\n");
      out.write("            <label for=\"btn-menu\"><img src=\"images/MenuLateral.png\" alt=\"\"/></label>\r\n");
      out.write("            <nav class=\"menu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Perfil</a></li>\r\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Categorías<img src=\"images/FlechaAbajo.ico\" alt=\"\"/></a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">BlackWork</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Geométricos</a></li>\r\n");
      out.write("                            <li><a href=\"#\">DotWork</a></li>\r\n");
      out.write("                            <li><a href=\"#\">TrashPolka</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Hiperrealismo</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Realismo Abstracto</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Biomecánico</a></li>\r\n");
      out.write("                            <li><a href=\"#\">WaterColor</a></li>\r\n");
      out.write("                            <li><a href=\"#\">OldSchool</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Neo Tradicional</a></li>\r\n");
      out.write("                            <li><a href=\"#\">New School</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Japones</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">Salir</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            \r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"menu.js\"></script>\r\n");
      out.write("    <!--<img src=\"Proyect Web Page Tattoo.png\" id=\"Proyect Web Page Tattoo.png\" /> -->\r\n");
      out.write("</body>\r\n");
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
}
