package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.view.*;
import fkt.mvc.model.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write(" \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \t\r\n");
      out.write("\t<title>FKT administration</title>\r\n");
      out.write("\t\t<link href=\"/fkt/etc/admin.css\" media=\"all\" rel=\"Stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table id=\"layout\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td id=\"left\">\r\n");
      out.write("\t\t\t\t\t<div id=\"top_logo\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_USERS, "user", "list", "Brugere") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_ROLES, "role", "list", "Rettigheder") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_MEMBERS, "member", "list", "Medlemmer") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_MEMBERS, "address", "list", "Adresser") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_MEMBERS, "trainer", "list", "Trænere") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_TRAINING, "training", "list", "Træningstider") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_NEWS, "news", "list", "Nyheder") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_NEWSLETTERS, "newsletter", "list", "Nyhedsbreve") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_DOCUMENTS, "document", "list", "Dokumenter") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_TOURNAMENTS, "country", "list", "Lande") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_TOURNAMENTS, "club", "list", "Klubber") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_TOURNAMENTS, "tournament", "list", "Stævner") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_TOURNAMENTS, "tournamentEvent", "list", "Stævneafholdelser") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_EVENTS, "event", "list", "Arrangementer") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_TEXTS, "namedI18nFrase", "list", "Tekster") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_LINKS, "link", "list", "Links") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_PICTURES, "pictureCategory", "list", "Billedkategorier") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_TEXTS, "messageBoardEntry", "list", "Opslag") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildRestrictedLink(request, RoleNames.EDIT_BROADCAST, "broadcast", "edit", "Servermeddelelse") );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t");
 if (FktViewHelper.getPerson(request) != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\"> <a href=\"/fkt/do/admin/logoff\">Log af</a></div> \r\n");
      out.write("\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\"> <a href=\"/fkt/do/admin/index\">Log på</a></div> \r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t<td id=\"right\">\r\n");
      out.write("\t\t\t\t\t");
      out.print( FktViewHelper.buildMessageList((List) session.getAttribute("messageList")) );
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  (String) request.getAttribute("content") , out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
