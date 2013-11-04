package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class training_005fshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Weekday monday = (Weekday) request.getAttribute("monday"); 
      out.write('\r');
      out.write('\n');
 Weekday tuesday = (Weekday) request.getAttribute("tuesday"); 
      out.write('\r');
      out.write('\n');
 Weekday wednesday = (Weekday) request.getAttribute("wednesday"); 
      out.write('\r');
      out.write('\n');
 Weekday thursday = (Weekday) request.getAttribute("thursday"); 
      out.write('\r');
      out.write('\n');
 Weekday friday = (Weekday) request.getAttribute("friday"); 
      out.write('\r');
      out.write('\n');
 Weekday saturday = (Weekday) request.getAttribute("saturday"); 
      out.write('\r');
      out.write('\n');
 Weekday sunday = (Weekday) request.getAttribute("sunday"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>");
      out.print( FktViewHelper.getText("training_title", request) + " " + FktViewHelper.getWeekNo() );
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" id=\"training_layout\" cellspacing=\"0\">\r\n");
      out.write("\t<tr id=\"training_header_row\">\r\n");
      out.write("\t\t<td id=\"training_title\">&nbsp;</td>\r\n");
      out.write("\t\t<td id=\"training_header\">");
      out.print( FktViewHelper.getText(monday.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_header\">");
      out.print( FktViewHelper.getText(tuesday.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_header\">");
      out.print( FktViewHelper.getText(wednesday.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_header\">");
      out.print( FktViewHelper.getText(thursday.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_header\">");
      out.print( FktViewHelper.getText(friday.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_header\">");
      out.print( FktViewHelper.getText(saturday.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_header\">");
      out.print( FktViewHelper.getText(sunday.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr id=\"training_ryp_row\">\r\n");
      out.write("\t\t<td id=\"training_location\">Ryparken</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(monday, "ryp", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(tuesday, "ryp", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(wednesday, "ryp", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(thursday, "ryp", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(friday, "ryp", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(saturday, "ryp", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(sunday, "ryp", request) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr id=\"training_dgi_row\">\r\n");
      out.write("\t\t<td id=\"training_location\">DGI-Byen</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(monday, "dgi", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(tuesday, "dgi", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(wednesday, "dgi", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(thursday, "dgi", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(friday, "dgi", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(saturday, "dgi", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(sunday, "dgi", request) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr id=\"training_kge_row\">\r\n");
      out.write("\t\t<td id=\"training_location\">Køge</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(monday, "kge", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(tuesday, "kge", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(wednesday, "kge", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(thursday, "kge", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(friday, "kge", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(saturday, "kge", request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"training_event\">");
      out.print( FktViewHelper.buildTrainingEvents(sunday, "kge", request) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
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
