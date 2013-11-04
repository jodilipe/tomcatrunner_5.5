package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;
import fw.mvc.model.*;
import fw.util.*;

public final class event_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Event event = (Event) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 String eventDisplayString =(String) request.getAttribute("event_display_string"); 
      out.write('\r');
      out.write('\n');
 String eventControllerPrefix =(String) request.getAttribute("event_controller_prefix"); 
      out.write('\r');
      out.write('\n');
 Class eventClass =(Class) request.getAttribute("event_class"); 
      out.write('\r');
      out.write('\n');
 List documents = (List)  request.getAttribute("document_list"); 
      out.write('\r');
      out.write('\n');
 List links = (List) request.getAttribute("link_list"); 
      out.write('\r');
      out.write('\n');
 List tournaments = (List) request.getAttribute("tournament_list"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Redigering af ");
      out.print( eventDisplayString );
      out.write("</h3>\r\n");
      out.write("\r\n");
 if (event.getDoc1() == null || event.getDoc2() == null || event.getDoc3() == null) { 
      out.write("\r\n");
      out.write("\t\t<form action=\"/fkt/do/");
      out.print( eventControllerPrefix );
      out.write("/save\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
 } else { 
      out.write("\r\n");
      out.write("\t\t<form action=\"/fkt/do/");
      out.print( eventControllerPrefix );
      out.write("/save\" method=\"post\">\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
 if (!(event instanceof TournamentEvent)) { 
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.buildI18nTextFields(event.getName(), "Navn", "name", 70) );
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.buildI18nTextAreaFields(event.getDescription(), "Beskrivelse", "description", 7, 70) );
      out.write('\r');
      out.write('\n');
      out.write('	');
 } else { 
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.buildTextFieldWithLabel(event, "additionalName", 70, "Undertitel") );
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.buildSelectWithLabel(event, tournaments, Tournament.class, "Stævne") );
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print( FktViewHelper.buildDateTextFieldWithLabel(event.getStartDate(), "startDate", 12, "Start (dd-mm-åå tt.mm)", Formatters.DD_MM_YY_HH_MM) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( FktViewHelper.buildDateTextFieldWithLabel(event.getEndDate(), "endDate", 12, "Slut (dd-mm-åå tt.mm)", Formatters.DD_MM_YY_HH_MM) );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<p/>\r\n");
      out.write("\t");
 if (event.getDoc1() == null) { 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print( FktViewHelper.buildI18nTextFields(null, "Dokument 1 beskrivelse", "doc1_description", 100) );
      out.write("\r\n");
      out.write("\t\t\t<p><label for=\"document_file1\">Dokumentfil 1 til upload</label><br/>\r\n");
      out.write("\t\t\t<input type=\"file\" name=\"document_file1\" size=\"100\"/></p>\r\n");
      out.write("\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print( FktViewHelper.buildSelectWithLabel(event, documents, "doc1", "Intet", "Dokument 1") );
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write('\r');
      out.write('\n');
      out.write('	');
 if (event.getDoc2() == null) { 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print( FktViewHelper.buildI18nTextFields(null, "Dokument 2 beskrivelse", "doc2_description", 100) );
      out.write("\r\n");
      out.write("\t\t\t<p><label for=\"document_file2\">Dokumentfil 2 til upload</label><br/>\r\n");
      out.write("\t\t\t<input type=\"file\" name=\"document_file2\" size=\"100\"/></p>\r\n");
      out.write("\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print( FktViewHelper.buildSelectWithLabel(event, documents, "doc2", "Intet", "Dokument 2") );
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write('\r');
      out.write('\n');
      out.write('	');
 if (event.getDoc3() == null) { 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print( FktViewHelper.buildI18nTextFields(null, "Dokument 3 beskrivelse", "doc3_description", 100) );
      out.write("\r\n");
      out.write("\t\t\t<p><label for=\"document_file1\">Dokumentfil 3 til upload</label><br/>\r\n");
      out.write("\t\t\t<input type=\"file\" name=\"document_file3\" size=\"100\"/></p>\r\n");
      out.write("\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print( FktViewHelper.buildSelectWithLabel(event, documents, "doc3", "Intet", "Dokument 3") );
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\r\n");
      out.write("\t<p/>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print( FktViewHelper.buildSelectWithLabel(event, links, "link1", "Intet", "Link 1") );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( FktViewHelper.buildSelectWithLabel(event, links, "link2", "Intet", "Link 2") );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( FktViewHelper.buildSelectWithLabel(event, links, "link3", "Intet", "Link 3") );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<p/>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(event) );
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton(eventClass) );
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
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
