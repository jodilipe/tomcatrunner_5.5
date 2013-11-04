package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class news_005fshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 News detail_news = (News) request.getAttribute("object"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t");
 if (detail_news.getPicture() != null) { 
      out.write("\r\n");
      out.write("\t\t  <table width=\"100%\">\r\n");
      out.write("\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"news_image\">");
      out.print( FktViewHelper.buildImage("pictures", detail_news.getPicture()) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"news_image_descr\">");
      out.print( detail_news.getPicture() != null ? FktViewHelper.getText(detail_news.getPicture().getDescription(), request) : "" );
      out.write("</td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" id=\"news_delimiter\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t  </table>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td id=\"news_headline\">");
      out.print( FktViewHelper.getText(detail_news.getHeadLine(), request) );
      out.write("</td>\r\n");
      out.write("\t\t<td id=\"news_time_author\">");
      out.print( (detail_news.getUpdatedBy() != null ? detail_news.getUpdatedBy().getName() + " " : "") + (FktViewHelper.getFormattedTimestamp(detail_news, fw.util.Formatters.D_MMMMM_YYYY_HH_MM)) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" id=\"news_body\">");
      out.print( FktViewHelper.getText(detail_news.getBody(), request) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t<table><tr>\r\n");
      out.write("\t\t\t\t<td id=\"news_links\">");
      out.print( FktViewHelper.buildLink(detail_news.getLink(), request) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td id=\"news_document\">");
      out.print( FktViewHelper.buildDocumentHtml(detail_news.getDocument(), request) );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr></table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
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
