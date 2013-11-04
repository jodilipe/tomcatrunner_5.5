package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class news_005fshow_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h3>");
      out.print( FktViewHelper.getText("news_title", request) );
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\"> \r\n");
 for (Iterator i = ((List) request.getAttribute("all_news_list")).iterator(); i.hasNext();) {
	   News news_item = (News) i.next(); 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td id=\"news_list_item_headline\">");
      out.print( FktViewHelper.buildLinkWithMarker("site", "showNews", news_item.getId(), FktViewHelper.getText(news_item.getHeadLine(), request), false) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"news_list_item_timestamp\" align=\"right\">");
      out.print( (news_item.getUpdatedBy() != null ? news_item.getUpdatedBy().getName() + " " : "") );
      out.print( FktViewHelper.getFormattedTimestamp(news_item) );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td id=\"news_delimiter_thin\" colspan=\"2\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<table width=\"100%\"> \r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"news_list_item_summary\">");
      out.print( FktViewHelper.shrink(FktViewHelper.getText(news_item.getBody(), request), 120) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"news_list_item_thumbnail\">");
      out.print( FktViewHelper.buildThumbnailImage("pictures", news_item.getPicture()) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("  \t<td id=\"news_list_spacing\" colspan=\"2\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
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
