package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class messageboard_005fshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t");
 List messageBoardEntryList = (List) request.getAttribute("messageboardentries"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\t<h3>");
      out.print( FktViewHelper.getText("messageboard_title", request, "Opslagstavle") );
      out.write("</h3>\t\r\n");
      out.write("\t<p>\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildLinkWithMarker("siteMemberArea", "createMessageBoardEntry", FktViewHelper.getText("messageboardentry_create", request, "Opret nyt opslag")) );
      out.write("\r\n");
      out.write("\t</p>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
 if (messageBoardEntryList.isEmpty()) { 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.getText("messageboard_info", request, "Her kan du lave et opslag hvis du ønsker at sælge dit brugte udstyr eller du har mistet en sok eller du har anden information som kunne være interessant for resten af klubben.") );
      out.write('\r');
      out.write('\n');
 } else { 
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildMessageBoardTable(messageBoardEntryList) );
      out.write('\r');
      out.write('\n');
 } 
      out.write('	');
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
