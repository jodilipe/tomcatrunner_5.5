package org.apache.jsp.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fw.WebApplication;
import java.util.List;
import fw.model.NamedI18nFrase;
import fw.module.news.News;
import commons.StringUtil;
import commons.Formatters;

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
 List<News> links = (List<News>) request.getAttribute("list"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"0\">\r\n");
      out.write("\t<tr><td class=\"note_top_left\"></td><td class=\"note_top\">");
      out.print( NamedI18nFrase.getText("news_list_title", "Nyheder", request) );
      out.write("</td><td class=\"note_top_right\"></td></tr>\r\n");
      out.write("\t<tr><td class=\"note_body\" colspan=\"3\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"news_list_item\">\r\n");
      out.write("\t");
 for(News news : links) { 
      out.write("\r\n");
      out.write("\t\t<div class=\"news_list_item_title\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/news/detail/");
      out.print( news.getId() );
      out.write('"');
      out.write('>');
      out.print( news.getTitle().getContent(WebApplication.getLocale(request)) );
      out.write("</a></div>\r\n");
      out.write("\t\t<div class=\"news_list_item_time\">");
      out.print( Formatters.DD_MM_YYYY_HH_MM.format(news.getUpdated()) + " - " + news.getUpdatedBy().getName() 	 );
      out.write("</div>\r\n");
      out.write("\t\t<div class=\"news_list_item_summary\">");
      out.print( StringUtil.shrink(news.getContent().getContent(WebApplication.getLocale(request)), 95) + "..." );
      out.write("</div>\r\n");
      out.write("\t\t<div class=\"list_item_divider\"><hr></hr></div>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t<tr><td class=\"note_bottom_left\"></td><td class=\"note_bottom\"></td><td class=\"note_bottom_right\"></td></tr>\r\n");
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
