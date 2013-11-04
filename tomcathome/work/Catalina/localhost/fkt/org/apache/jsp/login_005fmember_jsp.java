package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fkt.mvc.view.*;
import fkt.util.text.*;

public final class login_005fmember_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h3>Log på</h3>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/fkt/do/memberAccess/login\" method=\"post\">\r\n");
      out.write("\t<p><label for=\"login\">");
      out.print( FktViewHelper.getLocalizedText(Texts.LBL_USER_NAME, request) );
      out.write("</label><br/>\r\n");
      out.write("\t<input name=\"login\" size=\"30\" type=\"text\"/></p>\r\n");
      out.write("\r\n");
      out.write("\t<p><label for=\"password\">");
      out.print( FktViewHelper.getLocalizedText(Texts.LBL_PASSWORD, request) );
      out.write("</label><br/>\r\n");
      out.write("\t<input name=\"password\" size=\"30\" type=\"password\"/></p>\r\n");
      out.write("\r\n");
      out.write("\t<p>");
      out.print( FktViewHelper.getLocalizedText(Texts.TXT_OR_RECIEVE_FORGOTTEN_PASSWORD, request) );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t<p><label for=\"email\">");
      out.print( FktViewHelper.getLocalizedText(Texts.LBL_EMAIL, request) );
      out.write("</label><br/>\r\n");
      out.write("\t<input name=\"email\" size=\"30\" type=\"text\"/></p>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSubmitButton(FktViewHelper.getLocalizedText(Texts.BTN_LOGIN_OR_SEND, request)) );
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
