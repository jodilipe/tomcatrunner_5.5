package org.apache.jsp.huntingtest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dk.lindmadsen.module.huntingtest.JagtHelper;
import dk.lindmadsen.module.huntingtest.Question;
import dk.lindmadsen.module.huntingtest.Category;
import fw.model.NamedI18nFrase;

public final class _005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 	String action = (String) request.getAttribute("action");
		Category category = (Category) session.getAttribute("category"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"0\">\r\n");
      out.write("\t<tr><td class=\"note_top_left\"></td><td class=\"note_top\">");
      out.print( category != null ? category.getName() : NamedI18nFrase.getText("huntingtest_title", "Jagtprøve", request) );
      out.write("</td><td class=\"note_top_right\"></td></tr>\r\n");
      out.write("\t<tr><td class=\"note_body\" colspan=\"3\">\r\n");
      out.write("\t\t");

			JagtHelper.instance.handleRequest(request, response);
			Question question = JagtHelper.instance.getNextQuestion(request);
			if (question != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<div class=\"question\">Spørgsmål <i>");
      out.print( question.getNumber() );
      out.write(" </i>(");
      out.print( ((Integer) session.getAttribute("categoryIndex") + 1) );
      out.write(" af ");
      out.print(  category.getQuestions().size() );
      out.write(")</div>\r\n");
      out.write("\t\t\t\t  <div class=\"answer\">Svar: ");
      out.print( "answer".equals(action) ? "<i>" + question.getAnswer() + "</i>" : "" );
      out.write("</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t ");
 } else { 
      out.write("\r\n");
      out.write("\t \t\t  <p>");
      out.print( NamedI18nFrase.getText("huntingtest_introduction", "Dette er en hjælpefunktion til den teoretiske del af jagtprøven til almindeligt jagttegn. Hjælpefunktionen muliggør en nem kontrol af svarene til de relevante spørgsmål, som findes i opgavehæftet til pensum. Med de <i>relevante</i> spørgsmål menes de spørgsmål som, i følge instruktøren på et intensivt jagttegnskursus afholdt forår 2008, blev benyttet til selve jagtprøven på dette tidspunkt. Idéen er at aspiranten sidder med opgavehæftet og gennemgår spørgsmålene i de forskellige kategorier. Hjælpefunktionen holder styr på hvilke spørgsmål som er relevante samt de korrekte svar til disse spørgsmål.", request) );
      out.write("</p>\r\n");
      out.write("\t ");
 } 
      out.write("\t\r\n");
      out.write("\t\t<div class=\"action_links\">\r\n");
      out.write("\t\t\t");
 if (JagtHelper.instance.hasPreviousQuestion(session)) { 
      out.write("\r\n");
      out.write("\t\t\t\t<span class=\"action_link\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/?action=previous\">Forrige spørgsmål</a></span>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
 if (session.getAttribute("category") != null) { 
      out.write("\r\n");
      out.write("\t\t\t\t<span class=\"action_link\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/?action=answer\">Vis svar</a></span>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t");
 if (JagtHelper.instance.hasNextQuestion(session)) { 
      out.write("\r\n");
      out.write("\t\t\t\t<span class=\"action_link\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/?action=next\">Næste spørgsmål</a></span>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t<tr><td class=\"note_bottom_left\"></td><td class=\"note_bottom\"></td><td class=\"note_bottom_right\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div class=\"space\"></div>\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"0\">\r\n");
      out.write("\t<tr><td class=\"note_top_left\"></td><td class=\"note_top\">");
      out.print( NamedI18nFrase.getText("huntingtest_categories_title", "Kategorier", request) );
      out.write("</td><td class=\"note_top_right\"></td></tr>\r\n");
      out.write("\t<tr><td class=\"note_body\" colspan=\"3\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/?category=Vildtkendskab\">Vildtkendskab</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/?category=Vildtbiologi\">Vildtbiologi</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/?category=Våbenkendskab, jagtetik, haglbøsser\">Våbenkendskab, jagtetik, haglbøsser</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/?category=Våbenkendskab. Jagt- og salonrifler\">Våbenkendskab. Jagt- og salonrifler</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/huntingtest/?category=Jagtlovgivning\">Jagtlovgivning</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t<tr><td class=\"note_bottom_left\"></td><td class=\"note_bottom\"></td><td class=\"note_bottom_right\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div class=\"space\"></div>\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"0\">\r\n");
      out.write("\t<tr><td class=\"message_top_left\"></td><td class=\"message_top\">");
      out.print( NamedI18nFrase.getText("huntingtest_disclaimer_title", "Disclaimer", request) );
      out.write("</td><td class=\"message_top_right\"></td></tr>\r\n");
      out.write("\t<tr><td class=\"message_body\" colspan=\"3\">\r\n");
      out.write("\t  <p class=\"huntingtest_disclaimer\">");
      out.print( NamedI18nFrase.getText("huntingtest_disclaimer", "Dette websted, broadhead.dk og associerede personer, fralægger sig ethvert ansvar for eventuelle fejl og/eller mangler i hjælpefunktionen, herunder ændringer i sammensætningen af spørgsmål som anvendes til jagtprøven.", request) );
      out.write("</p>\r\n");
      out.write("\t</td></tr>\r\n");
      out.write("\t<tr><td class=\"message_bottom_left\"></td><td class=\"message_bottom\"></td><td class=\"message_bottom_right\"></td></tr>\r\n");
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
