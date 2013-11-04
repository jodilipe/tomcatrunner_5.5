package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fw.mvc.model.*;
import fkt.mvc.view.*;

public final class user_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 User user = (User) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 List roles = (List) request.getAttribute("list"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Redigering af medlem</h3>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/fkt/do/user/save\" method=\"post\">\r\n");
      out.write("\t<p><label for=\"userName\">Brugernavn</label><br/>\r\n");
      out.write("\t<input name=\"userName\" size=\"30\" type=\"text\" value=\"");
      out.print( FktViewHelper.getValue(user, "userName") );
      out.write("\"/></p>\r\n");
      out.write("<!-- \r\n");
      out.write("\t<p><label for=\"password\">Ny adgangskode</label><br/>\r\n");
      out.write("\t<input name=\"password\" size=\"30\" type=\"password\"/></p>\r\n");
      out.write(" -->\t\r\n");
      out.write("\t<p>Rettigheder<br/>\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildManyToManyTable(roles, user.getRoles(), 5) );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(user) );
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<p>\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton(User.class) );
      out.write("\r\n");
      out.write("  </p>\r\n");
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
