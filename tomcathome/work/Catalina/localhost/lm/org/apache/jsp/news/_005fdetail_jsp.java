package org.apache.jsp.news;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fw.module.news.News;
import fw.WebApplication;
import commons.StringUtil;
import commons.Formatters;
import fw.model.NamedI18nFrase;

public final class _005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 News news = (News) request.getAttribute("object"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"0\">\r\n");
      out.write("\t<tr><td class=\"note_top_left\"></td><td class=\"note_top\">");
      out.print( news.getTitle().getContent(WebApplication.getLocale(request)) + " - " + Formatters.DD_MM_YYYY_HH_MM.format(news.getUpdated()) );
      out.write("</td><td class=\"note_top_right\"></td></tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"note_body\" colspan=\"3\">\r\n");
      out.write("\t\t\t");
 if (news.getPicture() != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print( "<img src=\"" + request.getContextPath() + "/archive/" + news.getPicture().getFileName() + "\"></img>" );
      out.write("\r\n");
      out.write("\t\t\t\t");
 String description = news.getPicture().getDescription().getContent(WebApplication.getLocale(request)); 
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print( description != null ? "<div class=\"picture_description\">" + description + "</div>" : "" );
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"news_list_item_divider\"><hr></hr></div>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t<div class=\"news_content\">");
      out.print( news.getContent().getContent(WebApplication.getLocale(request)) );
      out.write("</div>\r\n");
      out.write("\t\t\t<div class=\"news_link\">");
      out.print( news.getLink() != null ? ("<a href=\"" + news.getLink().getLinkTo() + "\" target=\"_blank\">" + NamedI18nFrase.getText("read_more", "Læs mere", request) + " <span style=\"font-size: smaller\">&gt;&gt;</span> " + news.getLink().getTitle() + "</a>") : "" );
      out.write("</div>\r\n");
      out.write("\t\t\t<div class=\"news_list_item_divider\"><hr></hr></div>\r\n");
      out.write("\t\t\t<div class=\"news_author\">");
      out.print( news.getUpdatedBy() != null ? NamedI18nFrase.getText("created_by", "Oprettet af", request) + " " + news.getUpdatedBy().getName() : "" );
      out.write("</div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
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
