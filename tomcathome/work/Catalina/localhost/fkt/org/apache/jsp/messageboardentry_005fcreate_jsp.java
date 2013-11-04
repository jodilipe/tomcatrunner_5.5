package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fkt.mvc.view.*;
import fkt.mvc.model.*;
import fkt.util.text.*;

public final class messageboardentry_005fcreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 MessageBoardEntry messageBoardEntry = (MessageBoardEntry) request.getAttribute("object"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\t<h3>");
      out.print( FktViewHelper.getText("messageboardentrycreate_title", request, "Nyt opslag til opslagstavle") );
      out.write("</h3>\t\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("\t");
      out.print( FktViewHelper.getText("messageboardentrycreate_title_info", request, "Dit opslag vil blive vist i 14 dage efter at du har oprettet det. Hvis opslaget stadig er relevant efter 14 dage må du oprette opslaget igen.") );
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/fkt/do/siteMemberArea/saveMessageBoardEntry\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildTextFieldWithLabel(messageBoardEntry, "title", 80, "Overskrift") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextAreaWithLabel(messageBoardEntry, "content", 10, 50, "Indhold") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSubmitButton("Opret opslag") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildButton(FktViewHelper.getLocalizedText(Texts.BTN_CANCEL, request), "location.href='/fkt/do/siteMemberArea/showMessageBoard'") );
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
