package org.apache.jsp.cms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fw.module.news.News;
import fw.module.link.Link;
import fw.view.ViewHelper;
import java.util.List;
import commons.StringUtil;

public final class cms_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write(" \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \t\r\n");
      out.write("\t<title>CMS</title>\r\n");
      out.write("\t\t<link href=\"");
      out.print( request.getContextPath() );
      out.write("/etc/cms.css\" media=\"all\" rel=\"Stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table class=\"layout\" cellspacing=\"0\">\r\n");
      out.write("\t\t  <tr><td class=\"top\"></td></tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"left\"> \r\n");
      out.write("\t\t\t\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t\t\t<div class=\"cms_logo\"></div>\r\n");
      out.write("\t\t\t\t\t\t");
 for (Class modelClass : (List<Class>) request.getAttribute("menu_objects")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t <div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/cms/list?model=");
      out.print( modelClass.getName() );
      out.write('"');
      out.write('>');
      out.print( StringUtil.getShortClassName(modelClass) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t<td class=\"right\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t ");
 for (String message : (List<String>) session.getAttribute("messageList")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t      <div class=\"message\">");
      out.print( message );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  (String) request.getAttribute("content") , out, false);
      out.write("</div>\r\n");
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
