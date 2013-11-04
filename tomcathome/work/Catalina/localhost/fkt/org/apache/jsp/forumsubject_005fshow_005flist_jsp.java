package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;
import fkt.util.text.*;
import fw.util.*;

public final class forumsubject_005fshow_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<center>\r\n");
      out.write("\t<h3>");
      out.print( FktViewHelper.getLocalizedText(Texts.TIT_DEBATE_FORUM, request) );
      out.write("</h3>\r\n");
      out.write("\t<p>\r\n");
      out.write("\t");
 if (((List) request.getAttribute("list")).isEmpty()) { 
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.getLocalizedText(Texts.TIT_DEBATE_FORUM_TEASER, request) );
      out.write("\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildLinkWithMarker("siteMemberArea", "createForumSubject", FktViewHelper.getLocalizedText(Texts.TIT_FORUMSUBJECT_CREATE, request)) );
      out.write("\r\n");
      out.write("\t</p>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<table id=\"forum_layout\" cellspacing=\"0\" cellpadding=\"10\" width=\"100%\"> \r\n");
 for (Iterator i = ((List) request.getAttribute("list")).iterator(); i.hasNext();) {
	   ForumSubject forumSubject = (ForumSubject) i.next(); 
      out.write("\r\n");
      out.write("\t<tr><td>\t   \r\n");
      out.write("\t  <table id=\"forum_subject_layout\" cellspacing=\"0\" width=\"100%\"> \r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t \t\t<td id=\"forumsubject_title\" colspan=\"2\">");
      out.print( FktViewHelper.buildLinkWithMarker("siteMemberArea", "createForumComment?forumsubject_id=" + forumSubject.getId(), forumSubject.getSubject()) );
      out.write("<span id=\"forumsubject_author\">");
      out.print( " - " + forumSubject.getUpdatedBy().getName() );
      out.write("</span></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t");
 for (Iterator j = forumSubject.getComments().iterator(); j.hasNext();) {
			   ForumComment forumComment = (ForumComment) j.next(); 
      out.write("\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t \t\t<td id=\"forumcomment_author\" valign=\"top\">");
      out.print( forumComment.getUpdatedBy().getName() );
      out.write(' ');
      out.print( FktViewHelper.getLocalizedText(Texts.TXT_SAYS, request) );
      out.write(":</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t \t\t<td id=\"forumcomment_time\" valign=\"top\">");
      out.print( FktViewHelper.getFormattedDate(forumComment.getUpdated(), Formatters.D_MMMMM_YYYY_HH_MM) );
      out.write("</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t \t\t<td id=\"forumcomment_text\">\"");
      out.print( forumComment.getComment() );
      out.write("\"</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</td></tr>\r\n");
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
