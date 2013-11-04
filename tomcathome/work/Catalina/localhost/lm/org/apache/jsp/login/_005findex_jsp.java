package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fw.module.login.User;

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
 String userName = (String) request.getAttribute("userName"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.print( request.getContextPath() );
      out.write("/do/login/authenticate\" method=\"post\">\r\n");
      out.write("  <div class=\"edit_field_label\">User</div>\r\n");
      out.write(" \t<div class=\"edit_field\"><input type=\"text\" name=\"user\" size=\"30\" value=\"");
      out.print( userName != null ? userName : "" );
      out.write("\"/></div>\r\n");
      out.write(" \t<div class=\"edit_field_label\">Password</div>\r\n");
      out.write(" \t<div class=\"edit_field\"><input type=\"password\" name=\"password\" size=\"30\"/></div>\r\n");
      out.write("\r\n");
      out.write("\t<input type=\"submit\" name=\"commit\" value=\"Login\"/>\r\n");
      out.write("</form>");
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
