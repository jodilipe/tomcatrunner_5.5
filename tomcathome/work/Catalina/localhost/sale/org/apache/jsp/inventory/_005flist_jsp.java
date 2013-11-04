package org.apache.jsp.inventory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dk.lindmadsen.pb.model.PbObject;
import sale.module.inventory.ItemCategory;
import sale.module.inventory.Item;
import java.util.List;
import fw.WebApplication;
import fw.model.NamedI18nFrase;

public final class _005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
  ItemCategory itemCategory = (ItemCategory) request.getAttribute("itemCategory"); 
  List<PbObject> items = (List<PbObject>) request.getAttribute("items"); 

      out.write("\r\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <th align=\"left\" colspan=\"2\">");
      out.print( NamedI18nFrase.getText("item_header_description", "Beskrivelse", request) );
      out.write("</th>\n");
      out.write("    <th align=\"right\" colspan=\"2\">");
      out.print( NamedI18nFrase.getText("item_header_price", "Pris", request) );
      out.write("</th>\r\n");
      out.write("  </tr>\r\n");
 for (PbObject pbObject : items) {
	   Item item = (Item) pbObject; 
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <td><a href=\"/");
      out.print( request.getContextPath() );
      out.write("/inventory/showPicture\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/archive/");
      out.print( item.getPicture().getFileName() );
      out.write("\"></img></a></td>\n");
      out.write("    <td>");
      out.print( item.getDescription().getContent(WebApplication.getLocale(request)) );
      out.write("</td>\r\n");
      out.write("    <td align=\"right\">");
      out.print( "DKK " + item.getPrice() );
      out.write("</td>\r\n");
      out.write("    <td></td>\r\n");
      out.write("  </tr>\n");
 } 
      out.write("\r\n");
      out.write("</table>");
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
