package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fw.util.*;
import fkt.mvc.view.*;
import fkt.mvc.model.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 List spotEvents = (List) request.getAttribute("spot_events"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" height=\"100%\" id=\"table1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td id=\"home_welcome\" colspan=\"2\">");
      out.print( FktViewHelper.getText("welcome", request) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td id=\"event_spot_layout\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t");
 for (Iterator i = spotEvents.iterator(); i.hasNext();) { 
      out.write("\r\n");
      out.write("\t\t\t\t");
   Event event = (Event) i.next(); 
      out.write("\r\n");
      out.write("\t\t\t\t\t<td id=\"event_spot\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( FktViewHelper.buildLinkWithMarker("/fkt/do/site/showEventList", FktViewHelper.getText(event.getName(), request), false) );
      out.write(" <br/>\r\n");
      out.write("\t\t\t\t\t\t");
      out.print( FktViewHelper.getFormattedDate(event.getStartDate(), Formatters.D_MMMMM_YYYY) );
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t");
 if (i.hasNext()) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<td id=\"event_spot_delimiter\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td rowspan=\"2\" align=\"center\"><img src=\"/fkt/files/fencer.jpg\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td id=\"link_layout\">");
      out.print( FktViewHelper.buildLinkWithMarker("http://www.introsport.dk/csf/include/player/action?sid=F0600", FktViewHelper.getText("watch_video", request), true) );
      out.write("</a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td id=\"sponsor_layout\">\r\n");
      out.write("\t  \t<a href=\"http://www.teamcopenhagen.dk\" target=\"_blank\"><img src=\"/fkt/files/team_cph.jpg\"></a>\r\n");
      out.write("\t  \t<a href=\"http://www.ti.dk\" target=\"_blank\"><img src=\"/fkt/files/texas_instruments.gif\"></a>\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t  <td id=\"contact_layout\">\r\n");
      out.write("\t  \t<a href=\"mailto:trekanten@trekanten.org\">Fægteklubben Trekanten</a> - Ryparkens Idrætsanlæg<br>\r\n");
      out.write("\t\t\tLyngbyvej 110, 2100 København Ø, Danmark<br>\r\n");
      out.write("\t\t\tTelefon +45 3927 1313\r\n");
      out.write("\t  </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
