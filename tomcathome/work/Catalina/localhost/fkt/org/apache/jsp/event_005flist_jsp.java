package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;
import fw.util.*;

public final class event_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
 String eventDisplayStringPlural =(String) request.getAttribute("event_display_string_plural"); 
      out.write('\r');
      out.write('\n');
 String eventDisplayString =(String) request.getAttribute("event_display_string"); 
      out.write('\r');
      out.write('\n');
 Class eventClass =(Class) request.getAttribute("event_class"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>Alle ");
      out.print( eventDisplayStringPlural );
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("<p>");
      out.print( FktViewHelper.buildCreateButton(eventClass) );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("   \t<th>");
      out.print( StringUtil.firstToUpperCase(eventDisplayString) );
      out.write("</th>\r\n");
      out.write("   \t<th>Start</th>\r\n");
      out.write("   \t<th>Slut</th>\r\n");
      out.write("   \t<th>Opdateret</th>\r\n");
      out.write("\t  <th colspan=\"2\"></th>\r\n");
      out.write("  </tr>\r\n");
 for (Iterator i = ((List) request.getAttribute("list")).iterator(); i.hasNext();) {
	   Event event = (Event) i.next(); 
      out.write("\r\n");
      out.write("  <tr> \r\n");
      out.write("\t");
 if (!(event instanceof TournamentEvent)) { 
      out.write("\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.getText(event.getName(), request) );
      out.write("</td>\r\n");
      out.write("\t");
 } else {
	      TournamentEvent tournamentEvent = (TournamentEvent) event; 
      out.write("\r\n");
      out.write(" \t\t<td>");
      out.print( tournamentEvent.getTournament().getName() + (tournamentEvent.getAdditionalName() != null ? " " + tournamentEvent.getAdditionalName() : "") );
      out.write("</td>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.getFormattedDate(event.getStartDate()) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.getFormattedDate(event.getEndDate()) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.getFormattedTimestamp(event) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.buildEditButton(event) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.buildDeleteButton(event, eventDisplayString) );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<p>");
      out.print( FktViewHelper.buildCreateButton(eventClass) );
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
