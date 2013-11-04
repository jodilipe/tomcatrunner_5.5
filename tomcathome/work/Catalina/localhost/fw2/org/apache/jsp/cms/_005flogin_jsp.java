package org.apache.jsp.cms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
 String userName = (String) request.getAttribute("user_name"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.print( request.getContextPath() );
      out.write("/do/cms/authenticate\" method=\"post\">\r\n");
      out.write("  <div class=\"label\">User</div>\r\n");
      out.write(" \t<div class=\"attribute\"><input type=\"text\" name=\"user_name\" class=\"medium\" value=\"");
      out.print( userName != null ? userName : "" );
      out.write("\"/></div>\r\n");
      out.write(" \t<div class=\"label\">Password</div>\r\n");
      out.write(" \t<div class=\"attribute\"><input type=\"password\" name=\"password\" class=\"medium\"/></div>\r\n");
      out.write(" \t\r\n");
      out.write(" \t<div class=\"buttons\"><input type=\"submit\" name=\"commit\" value=\"Login\"/></div>\r\n");
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
