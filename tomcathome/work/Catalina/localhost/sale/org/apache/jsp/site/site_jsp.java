package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import commons.StringUtil;
import fw.model.NamedI18nFrase;
import sale.module.inventory.ItemCategory;
import fw.WebSession;
import fw.WebApplication;

public final class site_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
 List<ItemCategory> itemCategories = (List) request.getAttribute("itemCategories"); 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write(" \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \t\r\n");
      out.write("\t<title>sale.lindmadsen.dk</title>\r\n");
      out.write("\t\t<link href=\"");
      out.print( request.getContextPath() );
      out.write("/etc/sale.css\" media=\"all\" rel=\"Stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<table class=\"layout\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/site\">");
      out.print( NamedI18nFrase.getText("menu_item_home", "Hjem", request) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t");
 for(ItemCategory itemCategory : itemCategories) {
							   String itemCategoryName = itemCategory.getName().getContent(WebApplication.getLocale(request)); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t   <div class=\"menu_item\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/inventory/showItemCategory/");
      out.print( itemCategory.getId() );
      out.write('"');
      out.write('>');
      out.print( NamedI18nFrase.getText("menu_item_inventory_" + itemCategoryName.toLowerCase().replace(" ", "_"), itemCategoryName, request) );
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t<td class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t ");
 for (String message : (List<String>) session.getAttribute("messageList")) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t      <div class=\"message\">");
      out.print( message );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t ");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  (String) session.getAttribute("content") , out, false);
      out.write("</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"right\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t  <tr><td colspan=\"3\" class=\"bottom\"></td></tr>\r\n");
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
