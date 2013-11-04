package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fkt.mvc.view.*;
import fkt.mvc.model.*;
import fkt.util.text.*;

public final class forumcomment_005fcreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 ForumComment forumComment = (ForumComment) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 ForumSubject forumSubject = (ForumSubject) request.getAttribute("forum_subject"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\t<h3>");
      out.print( FktViewHelper.getLocalizedText(Texts.TIT_COMMENT_CREATE, request) );
      out.write("</h3>\t\r\n");
      out.write("\t<i>\"");
      out.print( forumSubject.getSubject() );
      out.write("\"</i>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"/fkt/do/siteMemberArea/saveForumComment\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildTextAreaWithLabel(forumComment, "comment", 10, 80, FktViewHelper.getLocalizedText(Texts.LBL_COMMENT, request)) );
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<input name=\"forumsubject_id\" type=\"hidden\" value=\"");
      out.print( forumSubject.getId() );
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSubmitButton(FktViewHelper.getLocalizedText(Texts.BTN_SAVE_COMMENT, request)) );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildButton(FktViewHelper.getLocalizedText(Texts.BTN_CANCEL, request), "location.href='/fkt/do/siteMemberArea/showForumSubjectList'") );
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
