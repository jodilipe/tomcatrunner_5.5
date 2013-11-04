package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fw.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class tournament_005fevent_005fshow_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 String eventsTitle = (String) request.getAttribute("events_title"); 
      out.write('\r');
      out.write('\n');
 String eventsReverseAction = (String) request.getAttribute("events_reverse_action"); 
      out.write('\r');
      out.write('\n');
 String eventsAction = (String) request.getAttribute("events_action"); 
      out.write('\r');
      out.write('\n');
 String eventsLinkTitle = (String) request.getAttribute("events_link_title"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>");
      out.print( FktViewHelper.getText(eventsTitle, request) );
      out.write("</h3>\r\n");
      out.write("<center>\r\n");
      out.print( FktViewHelper.buildPaginationTable(TournamentEvent.class, "site", eventsAction, request) );
      out.write('\r');
      out.write('\n');
      out.print( FktViewHelper.buildLinkWithMarker("site", eventsReverseAction, FktViewHelper.getText(eventsLinkTitle, request)) );
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<p/>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\"> \r\n");
 for (Iterator i = ((List) request.getAttribute("all_events_list")).iterator(); i.hasNext();) {
	   TournamentEvent event_item = (TournamentEvent) i.next(); 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<table width=\"100%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"event_list_item_title\">");
      out.print( event_item.getTournament().getName() + " " + event_item.getAdditionalName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td rowspan=\"2\" align=\"right\">");
      out.print( FktViewHelper.buildImage("flags", event_item.getTournament().getCountry().getCode().toLowerCase() + ".gif", FktViewHelper.getText(event_item.getTournament().getCountry().getDescription(), request)) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"event_list_item_time\">");
      out.print( FktViewHelper.getFormattedDate(event_item.getStartDate(), Formatters.D_MMMMM_YYYY) );
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( FktViewHelper.getFormattedDate(event_item.getEndDate(), Formatters.D_MMMMM_YYYY) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print( FktViewHelper.buildTournamentEventQualificationComment(event_item, request) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">");
      out.print( FktViewHelper.getTextOrBlank(event_item.getTournament().getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">");
      out.print( FktViewHelper.getTextOrBlank(event_item.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr> \r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<table cellpadding=\"3\"><tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( FktViewHelper.buildLinkList(event_item.getLinks(), request) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( FktViewHelper.buildDocumentLinks(event_item.getDocuments(), request) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr></table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr><td id=\"event_list_spacing\">&nbsp;</td></tr>\r\n");
 } 
      out.write("\r\n");
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
