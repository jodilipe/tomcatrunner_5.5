package org.apache.jsp.survey;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import fw.module.survey.Survey;
import fw.model.NamedI18nFrase;
import fw.module.survey.Answer;
import fw.WebApplication;

public final class _005fquestionnaire_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Survey survey = (Survey) request.getAttribute("survey");

	 if (survey != null) { 
      out.write("\r\n");
      out.write("   <form action=\"");
      out.print( request.getContextPath() );
      out.write("/do/survey/vote?survey=");
      out.print( survey.getId() );
      out.write("\" method=\"post\">\r\n");
      out.write("     <table cellspacing=\"0\"> \r\n");
      out.write("\t\t   <tr><td class=\"message_top_left\"></td><td class=\"message_spot_top\">");
      out.print( NamedI18nFrase.getText("survey_title", "Survey", request) );
      out.write("</td><td class=\"message_top_right\"></td></tr>\r\n");
      out.write("\t\t\t <tr><td class=\"message_spot_body\" colspan=\"3\">\r\n");
      out.write("\t\t\t <div class=\"survey_question\">");
      out.print( survey.getQuestion().getContent(WebApplication.getLocale(request)) + "?" );
      out.write("</div>\r\n");
   if (!WebApplication.getSession(request).surveyAnswered(survey)) {
	     for(Answer answer : survey.getAnswers()) { 
      out.write("\r\n");
      out.write("\t\t     <div class=\"survey_answer\"><input type=\"radio\" name=\"answer\" value=\"");
      out.print( answer.getId() );
      out.write('"');
      out.write('>');
      out.print( answer.getDescription().getContent(WebApplication.getLocale(request)) );
      out.write("</input></div>\r\n");
     } 
      out.write("\r\n");
      out.write("\t\t   <div class=\"survey_button\"><input type=\"submit\" name=\"commit\" value=\"");
      out.print( NamedI18nFrase.getText("survey_vote_button", "Stem", request) );
      out.write("\"/></input></div>\r\n");
	 } else { 
      out.write("\r\n");
      out.write("\t\t   <table cellspacing=\"0\" width=\"90%\">\r\n");
     for(Answer answer : survey.getAnswers()) { 
      out.write("\r\n");
      out.write("\t\t\t   <tr>\r\n");
      out.write("\t\t       <td>");
      out.print( answer.getDescription().getContent(WebApplication.getLocale(request)) );
      out.write("</td><td align=\"right\">");
      out.print( survey.getPercentageOfTotalAnswers(answer) + "%" );
      out.write("</td>\r\n");
      out.write("\t\t     </tr>\r\n");
     } 
      out.write("\r\n");
      out.write("       </table>\r\n");
   } 
      out.write("\r\n");
      out.write("\t\t\t </td></tr>\r\n");
      out.write("\t\t\t <tr><td class=\"message_bottom_left\"></td><td class=\"message_spot_bottom\"></td><td class=\"message_bottom_right\"></td></tr>\r\n");
      out.write("\t\t </table>\r\n");
 } 
      out.write('\r');
      out.write('\n');
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
