package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fw.model.NamedI18nFrase;
import dk.lindmadsen.module.quote.Quote;

public final class _005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Quote quote = (Quote) request.getAttribute("quote"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"0\">\r\n");
      out.write("\t<tr><td class=\"note_top_left\"></td><td class=\"note_top\">");
      out.print( NamedI18nFrase.getText("home_title", "Velkommen", request) );
      out.write("</td><td class=\"note_top_right\"></td></tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"note_body\" colspan=\"3\">\r\n");
      out.write("\t\t\t<div class=\"home_content\">");
      out.print( NamedI18nFrase.getText("home_content", "Denne web-side handler om bueskydning med fokus på buejagt og 3D-skydning.", request) );
      out.write("</div>\r\n");
      out.write("\t\t\t<div class=\"home_content_image\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/img/bowhunter.gif\"></img></div>\r\n");
  if (quote != null) { 
      out.write("\r\n");
      out.write("\t\t\t<div class=\"home_quote\">");
      out.print( "\"" + quote.getQuote() + ".\"" );
      out.write("</div>\r\n");
      out.write("\t\t\t<div class=\"home_quote_author\">");
      out.print( "- " + quote.getAuthor() + " -" );
      out.write("</div>\r\n");
  } 
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr><td class=\"note_bottom_left\"></td><td class=\"note_bottom\"></td><td class=\"note_bottom_right\"></td></tr>\r\n");
      out.write("</table>\r\n");
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
