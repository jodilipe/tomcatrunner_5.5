package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fkt.mvc.view.*;
import fkt.mvc.model.*;
import fkt.util.text.*;

public final class forumsubject_005fcreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 ForumSubject forumSubject = (ForumSubject) request.getAttribute("object"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\t<h3>");
      out.print( FktViewHelper.getLocalizedText(Texts.TIT_FORUMSUBJECT_CREATE, request) );
      out.write("</h3>\t\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/fkt/do/siteMemberArea/saveForumSubject\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildTextFieldWithLabel(forumSubject, "subject", 80, FktViewHelper.getLocalizedText(Texts.LBL_SUBJECT, request)) );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSubmitButton(FktViewHelper.getLocalizedText(Texts.BTN_SAVE_SUBJECT, request)) );
      out.write("\r\n");
      out.write("  \r\n");
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
