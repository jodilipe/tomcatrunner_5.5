package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import commons.StringUtil;
import fw.model.NamedI18nFrase;

public final class site_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write(" \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \t\r\n");
      out.write("\t<title>broadhead.dk</title>\r\n");
      out.write("\t\t<link href=\"");
      out.print( request.getContextPath() );
      out.write("/etc/lm.css\" media=\"all\" rel=\"Stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<table class=\"layout\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t  <tr><td colspan=\"3\" class=\"top\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/img/logo.gif\"/></td></tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<table cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"note_top_left\"></td><td class=\"note_spot_top\">");
      out.print( NamedI18nFrase.getText("menu_title", "Menu", request) );
      out.write("</td><td class=\"note_top_right\"></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"note_spot_body\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/site\">");
      out.print( NamedI18nFrase.getText("menu_item_home", "Hjem", request) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/news\">");
      out.print( NamedI18nFrase.getText("menu_item_news", "Nyheder", request) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/article\">");
      out.print( NamedI18nFrase.getText("menu_item_article", "Artikler", request) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/link\">");
      out.print( NamedI18nFrase.getText("menu_item_link", "Links", request) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/quote\">");
      out.print( NamedI18nFrase.getText("menu_item_quote", "Citater", request) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"note_bottom_left\"></td><td class=\"note_spot_bottom\"></td><td class=\"note_bottom_right\"></td></tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"space\"></div>\r\n");
      out.write("\t\t\t\t\t\t<table cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"message_top_left\"></td><td class=\"message_spot_top\">");
      out.print( NamedI18nFrase.getText("huntingtest_spot_title", "Jagttegn", request) );
      out.write("</td><td class=\"message_top_right\"></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"message_spot_body\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/reset\">");
      out.print( NamedI18nFrase.getText("menu_item_huntingtest", "Jagtprøve", request) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td class=\"message_bottom_left\"></td><td class=\"message_spot_bottom\"></td><td class=\"message_bottom_right\"></td></tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t<td class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t ");
 for (String message : (List<String>) session.getAttribute("messageList")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"message\">");
      out.print( message );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  (String) session.getAttribute("content") , out, false);
      out.write("</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"right\">\r\n");
      out.write("\t\t\t\t\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/survey/_questionnaire.jsp", out, false);
      out.write("</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t  <tr><td colspan=\"3\" class=\"bottom\"></td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
