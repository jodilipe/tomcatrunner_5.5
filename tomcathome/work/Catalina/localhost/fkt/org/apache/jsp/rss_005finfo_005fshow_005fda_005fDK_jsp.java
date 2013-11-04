package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fw.*;

public final class rss_005finfo_005fshow_005fda_005fDK_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 String rssHost = WebApplication.instance.getProperty("rss_host"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>RSS feeds fra Fægteklubben Trekanten</h3>\r\n");
      out.write("<h5>Kopier det ønskede link til din RSS reader:</h5>\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"http://");
      out.print( rssHost );
      out.write("/fkt/do/rss/showNews\">Nyheder</a>: http://");
      out.print( rssHost );
      out.write("/fkt/do/rss/showNews</li>\r\n");
      out.write("\t<li><a href=\"http://");
      out.print( rssHost );
      out.write("/fkt/do/rss/showTraining\">Træningstider</a>: http://");
      out.print( rssHost );
      out.write("/fkt/do/rss/showTraining</li>\r\n");
      out.write("</ul>\r\n");
      out.write("<p>For at læse RSS-feeds skal du enten installere en RSS-reader (eller RSS-Aggregator som de også kaldes) på din computer eller tilmelde dig en online reader. Der findes mange gratis og udmærkede programmer til formålet, som kan downloades på nettet.</p>\r\n");
      out.write("<p>Her finder du nogle udbredte readers som installeres på egen computer: </p>\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"http://www.sharpreader.net/\" target=\"_blank\">SharpReader</a></li>\r\n");
      out.write("\t<li><a href=\"http://www.rssreader.com/download.htm\" target=\"_blank\">RssReader</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<p>Her finder du en glimrende online reader, som er praktisk hvis man benytter forskellige computere i dagligdagen: </p>\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li><a href=\"http://www.bloglines.com/\" target=\"_blank\">Bloglines</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<p>Du kan læse mere om RSS på <a href=\"http://da.wikipedia.org/wiki/RSS\" target=\"_blank\">Wikipedia</a>.</p>\r\n");
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
