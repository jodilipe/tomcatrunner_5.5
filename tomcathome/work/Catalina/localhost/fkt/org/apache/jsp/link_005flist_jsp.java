package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class link_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<h1>Alle links</h1>\r\n");
      out.write("\r\n");
      out.write("<p>");
      out.print( FktViewHelper.buildCreateButton(Link.class) );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<table> \r\n");
      out.write("  <tr>\r\n");
      out.write("   \t<th>Beskrivelse</th>\r\n");
      out.write("   \t<th>Link</th>\r\n");
      out.write("   \t<th>Vis på linkside</th>\r\n");
      out.write("   \t<th>Opdateret</th>\r\n");
      out.write("\t  <th colspan=\"2\"></th>\r\n");
      out.write("  </tr>\r\n");
 for (Iterator i = ((List) request.getAttribute("list")).iterator(); i.hasNext();) {
	   Link link = (Link) i.next(); 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write(" \t\t<td>");
      out.print( link.getDescription() != null ? link.getDescription().getContent(FktViewHelper.getLocale(request)) : null );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( link.getLinkTo() );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.format(link.getGeneral()) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.getFormattedTimestamp(link) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.buildEditButton(link) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.buildDeleteButton(link, "link") );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<p>");
      out.print( FktViewHelper.buildCreateButton(Link.class) );
      out.write("</p>\r\n");
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
