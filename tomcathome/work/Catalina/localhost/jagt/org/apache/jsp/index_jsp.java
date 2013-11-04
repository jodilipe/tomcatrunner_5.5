package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dk.lindmadsen.jagt.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write(" \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \t\r\n");
      out.write("\t<title>Jagtprøve</title>\r\n");
      out.write("\t\t<link href=\"etc/jagt.css\" media=\"all\" rel=\"Stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table class=\"layout\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"menu_item\"><a href=\"index.jsp?category=Vildtkendskab\">Vildtkendskab</a></div> \r\n");
      out.write("\t\t\t\t\t<div class=\"menu_item\"><a href=\"index.jsp?category=Vildtbiologi\">Vildtbiologi</a></div> \r\n");
      out.write("\t\t\t\t\t<div class=\"menu_item\"><a href=\"index.jsp?category=Våbenkendskab, jagtetik, haglbøsser\">Våbenkendskab, jagtetik, haglbøsser</a></div> \r\n");
      out.write("\t\t\t\t\t<div class=\"menu_item\"><a href=\"index.jsp?category=Våbenkendskab. Jagt- og salonrifler\">Våbenkendskab. Jagt- og salonrifler</a></div> \r\n");
      out.write("\t\t\t\t\t<div class=\"menu_item\"><a href=\"index.jsp?category=Jagtlovgivning\">Jagtlovgivning</a></div> \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"right\">\r\n");
      out.write("\t\t\t\t\t");

						JagtHelper.instance.handleRequest(request, response);
						Question question = JagtHelper.instance.getNextQuestion(request);
						if (question != null) {
							Category category = ((Category) session.getAttribute("category"));
							out.print("<div class=\"category\">");
							out.print(category.getName());
							out.print("</div>");
							out.print("<div class=\"question\">");
							out.print("Spørgsmål <i>" + question.getNumber() + "</i> (" + ((Integer) session.getAttribute("categoryIndex") + 1) + " af " + category.getQuestions().size() + ")");
							out.print("</div>");
							out.print("<div class=\"answer\">");
							out.print("Svar: ");
							if ("answer".equals(request.getParameter("action"))) {
								out.print("<i>" + question.getAnswer() + "</i>");
							}
							out.print("</div>");
						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"action_links\">\r\n");
      out.write("\t\t\t\t\t\t");
 if (JagtHelper.instance.hasPreviousQuestion(session)) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.jsp?action=previous\">Forrige spørgsmål</a>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 if (session.getAttribute("category") != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.jsp?action=answer\">Vis svar</a>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 if (JagtHelper.instance.hasNextQuestion(session)) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.jsp?action=next\">Næste spørgsmål</a>\r\n");
      out.write("\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
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
