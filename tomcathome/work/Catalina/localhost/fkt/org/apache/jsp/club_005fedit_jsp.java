package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fw.mvc.model.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class club_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Club club = (Club) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 List list = (List) request.getAttribute("list"); 
      out.write("\r\n");
      out.write("<h3>Redigering af klub</h3>\r\n");
      out.write(" \r\n");
      out.write("<form action=\"/fkt/do/club/save\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildTextFieldWithLabel(club, "name", 100, "Navn") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextFieldWithLabel(club, "initials", 100, "Initialer") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextAreaWithLabel(club, "address", 5, 50, "Adresse") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextFieldWithLabel(club, "phone", 100, "Telefon") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextFieldWithLabel(club, "fax", 100, "Fax") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextFieldWithLabel(club, "email", 100, "Email") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextFieldWithLabel(club, "website", 100, "Website") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildSelectWithLabel(club, list, Country.class, "Land") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(club) );
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton(Club.class) );
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
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
