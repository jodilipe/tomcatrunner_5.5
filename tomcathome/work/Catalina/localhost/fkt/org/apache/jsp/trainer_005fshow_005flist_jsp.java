package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class trainer_005fshow_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h3>");
      out.print( FktViewHelper.getLocalizedText("tit_trainer_list", request) );
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("<table id=\"trainer_layout\" cellspacing=\"0\" width=\"100%\"> \r\n");
      out.write("  <tr id=\"trainer_header_row\">\r\n");
      out.write("   \t<td id=\"trainer_header\">");
      out.print( FktViewHelper.getLocalizedText("hdr_name", request) );
      out.write("</td>\r\n");
      out.write("   \t<td id=\"trainer_header\">");
      out.print( FktViewHelper.getLocalizedText("hdr_phone", request) );
      out.write("</td>\r\n");
      out.write("   \t<td id=\"trainer_header\">");
      out.print( FktViewHelper.getLocalizedText("hdr_mail", request) );
      out.write("</td>\r\n");
      out.write("   \t<td id=\"trainer_header\">");
      out.print( FktViewHelper.getLocalizedText("hdr_note", request) );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
 String rowType = "even";  
      out.write('\r');
      out.write('\n');
 for (Iterator i = ((List) request.getAttribute("list")).iterator(); i.hasNext();) {
	   Trainer trainer = (Trainer) i.next(); 
      out.write("\r\n");
      out.write("  <tr id=\"trainer_row_");
      out.print( rowType );
      out.write("\">\r\n");
      out.write(" \t\t<td id=\"trainer_entry\">");
      out.print( trainer.getName() );
      out.write("</td>\r\n");
      out.write(" \t\t<td id=\"trainer_entry\">");
      out.print( (trainer.getPhone() != null ? trainer.getPhone() : "") + (trainer.getPhone() != null && trainer.getPhoneMobile() != null ? " / " : "") + (trainer.getPhoneMobile() != null ? trainer.getPhoneMobile() : "&nbsp;") );
      out.write("</td>\r\n");
      out.write(" \t\t<td id=\"trainer_entry\">");
      out.print( trainer.getEmail() != null ? trainer.getEmail() : "&nbsp;" );
      out.write("</td>\r\n");
      out.write(" \t\t<td id=\"trainer_entry\">");
      out.print( trainer.getNote() != null ? trainer.getNote() : "&nbsp;" );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  ");
 
  	if (rowType.equals("even"))
  	  rowType = "odd";
  	else
  	  rowType = "even";
  
      out.write('\r');
      out.write('\n');
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
