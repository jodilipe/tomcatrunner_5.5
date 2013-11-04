package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.view.*;
import fkt.mvc.model.*;

public final class fkt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>FKT</title>\r\n");
      out.write("\t<link href=\"/fkt/etc/fkt.css\" media=\"all\" rel=\"Stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
 List spotNews = (List) request.getAttribute("spot_news"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"layout\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"3\" id=\"top\">\r\n");
      out.write("\t\t\t<div id=\"top_logo\"></div>\r\n");
      out.write("\t\t\t<div id=\"top_name\"></div>\r\n");
      out.write("\t\t\t<div id=\"top_image\"></div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td id=\"left\">\r\n");
      out.write("\t\t\t<table id=\"left_layout\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"left_layout_top\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"left_layout_center\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "index", "menu_item_frontpage", request) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showNewsList", "menu_item_news", request) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showEventList", "menu_item_events", request) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showTraining", "menu_item_training", request) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showAboutFkt", "menu_item_fkt", request) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showAboutFencing", "menu_item_fencing", request) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showTournamentEventList", "menu_item_tournaments", request) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showPentathlon", FktViewHelper.getText("menu_item_pentathlon", request, "Femkamp")) );
      out.write("</div> \t\r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showPictureGallery", "menu_item_gallery", request) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showPolterabend", FktViewHelper.getText("menu_item_polterabend", request, "Arrangementer")) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("site", "showLinkList", FktViewHelper.getText("menu_item_linklist", request, "Links")) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t\t");
 if (new Locale("da", "DK").equals(FktViewHelper.getLocale(request))) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"menu_item\"><a href=\"http://old.trekanten.org/signup/new_index.php?SITELANG=dk\" target=\"_blank\">Tilmelding</a></div> \r\n");
      out.write("\t\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"menu_item\"><a href=\"http://old.trekanten.org/signup/new_index.php?SITELANG=en\" target=\"_blank\">Signup</a></div> \r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 if (FktViewHelper.getMember(request) != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("siteMemberArea", "showForumSubjectList", FktViewHelper.getText("menu_item_forumlist", request, "Debatforum")) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("siteMemberArea", "showMessageBoard", FktViewHelper.getText("menu_item_messageboard", request, "Opslagstavle")) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("siteMemberArea", "editMemberInfo", FktViewHelper.getText("menu_item_editmemberinfo", request, "Dine data")) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("siteMemberArea", "showTrainerList", FktViewHelper.getText("menu_item_trainerlist", request, "Trænerliste")) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("memberAccess", "logoff", FktViewHelper.getText("menu_item_member_logoff", request, "Log af")) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"menu_item\">");
      out.print( FktViewHelper.buildLink("memberAccess", "index", FktViewHelper.getText("menu_item_member_login", request, "Log på")) );
      out.write("</div> \r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"left_layout_bottom\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"language_links\">\r\n");
      out.write("\t\t\t\t\t\t\t");
 if (new Locale("da", "DK").equals(FktViewHelper.getLocale(request))) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/fkt/do/site/changeLocale?language=en&country=GB\">English</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"/fkt/do/site/changeLocale?language=da&country=DK\">Dansk</a>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td id=\"center\">\r\n");
      out.write("\t\t\t<table id=\"center_layout\" cellspacing=\"0\"><tr>\r\n");
      out.write("\t\t\t<td id=\"center_content\">\r\n");
      out.write("\t\t\t\t\t<font color=\"RED\">");
      out.print( FktViewHelper.buildMessageList((List) session.getAttribute("messageList")) );
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response,  (String) request.getAttribute("content") , out, false);
      out.write("\r\n");
      out.write("\t\t\t</td></tr></table>\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td id=\"right\">\r\n");
      out.write("\t\t\t");
 for (Iterator i = spotNews.iterator(); i.hasNext();) { 
      out.write("\r\n");
      out.write("\t\t\t");
   News news = (News) i.next(); 
      out.write("\r\n");
      out.write("\t\t\t\t<table id=\"spot\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr><td id=\"spot_top\">");
      out.print( FktViewHelper.getFormattedTimestamp(news) );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td id=\"spot_main\">");
      out.print( news.getHeadLine().getContent(FktViewHelper.getLocale(request)) );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td id=\"spot_bottom\">");
      out.print( FktViewHelper.buildLinkWithMarker("/fkt/do/site/showNews/" + news.getId(), FktViewHelper.getText("read_more", request), false) );
      out.write("</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td id=\"spot_space\"></td></tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t<table width=\"100%\"><tr><td align=\"center\"><a href=\"/fkt/do/site/showRssInfo\"><img src=\"/fkt/files/xml.gif\" alt=\"Trekantens RSS feeds\"/></a></td></tr></table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"3\" id=\"bottom\">\r\n");
      out.write("\t\t\t");
 if (FktViewHelper.getMember(request) != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t<font color=\"FFFFFF\">\r\n");
      out.write("\t\t\t\t");
      out.print( "Medlem: " + FktViewHelper.getMember(request).getName() );
      out.write("\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
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
