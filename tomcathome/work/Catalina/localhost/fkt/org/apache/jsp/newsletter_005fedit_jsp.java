package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class newsletter_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Newsletter newsletter = (Newsletter) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 List documentList = (List) request.getAttribute("list"); 
      out.write('\r');
      out.write('\n');
 List weaponList = (List) request.getAttribute("weapon_list"); 
      out.write('\r');
      out.write('\n');
 List participantList = (List) request.getAttribute("participant_list"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Redigering af nyhedsbrev</h3>\r\n");
      out.write(" \r\n");
 if (!newsletter.isSent() && newsletter.getDocument() == null) { 
      out.write("\r\n");
      out.write("\t\t<form action=\"/fkt/do/newsletter/save\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
 } else { 
      out.write("\r\n");
      out.write("\t\t<form action=\"/fkt/do/newsletter/save\" method=\"post\">\r\n");
 } 
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  ");
      out.print( FktViewHelper.buildTextFieldWithLabel(newsletter, "subject", 50, "Emne") );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildTextAreaWithLabel(newsletter, "body", 20, 50, "Indhold") );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildManyToManyTable(weaponList, newsletter.getWeapons(), 5) );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildManyToManyTable(participantList, newsletter.getParticipants(), 5) );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCheckBoxWithLabel(newsletter, "sent", "Sendt", true) );
      out.write("\r\n");
      out.write("\r\n");
 if (newsletter.getDocument() == null) { 
      out.write("\r\n");
      out.write("\t\t<p><label for=\"document_file\">Dokument til upload</label><br/>\r\n");
      out.write("\t\t<input type=\"file\" name=\"document_file\" size=\"100\"/></p>\r\n");
 } else { 
      out.write(" \r\n");
      out.write("\t\t<p>");
      out.print( FktViewHelper.buildSelectWithLabel(newsletter, documentList, Document.class, "Vælg et dokument", "Dokument") );
      out.write("</p>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(newsletter) );
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton(Newsletter.class) );
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
