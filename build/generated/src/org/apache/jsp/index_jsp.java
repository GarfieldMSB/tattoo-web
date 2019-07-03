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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tattoo</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilo.css\"/>\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"img-background-top\">\n");
      out.write("                <img src=\"images/Fondo1.png\"/>\n");
      out.write("                <div class=\"text\">El querer plasmar en tu cuerpo tus\n");
      out.write("                emociones es el deseo perfecto</div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#\"><img class=\"logo\" src=\"images/Logo.png\"></a>\n");
      out.write("            <input type=\"checkbox\" id=\"btn-menu\">\n");
      out.write("            <label for=\"btn-menu\"><img src=\"images/MenuLateral.png\" alt=\"\"/></label>\n");
      out.write("            <nav class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Perfil</a></li>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Categorías<img src=\"images/FlechaAbajo.ico\" alt=\"\"/></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">BlackWork</a></li>\n");
      out.write("                            <li><a href=\"#\">Geométricos</a></li>\n");
      out.write("                            <li><a href=\"#\">DotWork</a></li>\n");
      out.write("                            <li><a href=\"#\">TrashPolka</a></li>\n");
      out.write("                            <li><a href=\"#\">Hiperrealismo</a></li>\n");
      out.write("                            <li><a href=\"#\">Realismo Abstracto</a></li>\n");
      out.write("                            <li><a href=\"#\">Biomecánico</a></li>\n");
      out.write("                            <li><a href=\"#\">WaterColor</a></li>\n");
      out.write("                            <li><a href=\"#\">OldSchool</a></li>\n");
      out.write("                            <li><a href=\"#\">Neo Tradicional</a></li>\n");
      out.write("                            <li><a href=\"#\">New School</a></li>\n");
      out.write("                            <li><a href=\"#\">Japones</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Salir</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <script src=\"menu.js\"></script>\n");
      out.write("    <!--<img src=\"Proyect Web Page Tattoo.png\" id=\"Proyect Web Page Tattoo.png\" /> -->\n");
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
}
