package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;
import fw.*;

public final class training_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>Alle træningstider</h1>\r\n");
      out.write("\r\n");
      out.write("<p>");
      out.print( FktViewHelper.buildCreateButton(Training.class) );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("   \t<th>Dag</th>\r\n");
      out.write("   \t<th>Sted</th>\r\n");
      out.write("   \t<th>Fra</th>\r\n");
      out.write("   \t<th>Til</th>\r\n");
      out.write("   \t<th>Våben</th>\r\n");
      out.write("   \t<th>Beskrivelse</th>\r\n");
      out.write("   \t<th>Trænere</th>\r\n");
      out.write("   \t<th>RSS feed</th>\r\n");
      out.write("   \t<th>Opdateret</th>\r\n");
      out.write("\t  <th colspan=\"2\"></th>\r\n");
      out.write("  </tr>\r\n");
 for (Iterator i = ((List) request.getAttribute("list")).iterator(); i.hasNext();) {
	   Training training = (Training) i.next(); 
      out.write("\r\n");
      out.write("  <tr> \r\n");
      out.write(" \t\t<td>");
      out.print( training.getWeekday() );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( training.getPlace() );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( training.getStart() );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( training.getEnd() );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( training.getWeapon() );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( training.getDescription().getContent(WebApplication.defaultLocale) );
      out.write("</td>\r\n");
      out.write("\t\t");
 StringBuffer sb = new StringBuffer("(");
			 for (Iterator j = training.getTrainers().iterator(); j.hasNext();) {
		   	 Trainer trainer = (Trainer) j.next();
		   	 sb.append(trainer.getName());
		   	 if (j.hasNext())
		   	   sb.append(", ");
	     } 
	     sb.append(")"); 
      out.write("\r\n");
      out.write(" \t\t<td>");
      out.print( sb.toString() );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.format(training.getGenerateRss()) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.getFormattedTimestamp(training) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.buildEditButton(training) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.buildDeleteButton(training, "træningstid") );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<p>");
      out.print( FktViewHelper.buildCreateButton(Training.class) );
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
