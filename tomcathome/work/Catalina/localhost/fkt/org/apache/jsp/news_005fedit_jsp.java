package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fw.mvc.model.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class news_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 News news = (News) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 List pictureList = (List) request.getAttribute("picture_list"); 
      out.write('\r');
      out.write('\n');
 List documentList = (List) request.getAttribute("document_list"); 
      out.write('\r');
      out.write('\n');
 List linkList = (List) request.getAttribute("link_list"); 
      out.write("\r\n");
      out.write("<h3>Redigering af nyhed</h3>\r\n");
      out.write(" \r\n");
 if (news.getPicture() == null || news.getDocument() == null) { 
      out.write("\r\n");
      out.write("\t\t<form action=\"/fkt/do/news/save\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
 } else { 
      out.write("\r\n");
      out.write("\t\t<form action=\"/fkt/do/news/save\" method=\"post\">\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildI18nTextFields(news.getHeadLine(), "Overskrift", "headLine", 100) );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildI18nTextAreaFields(news.getBody(), "Indhold", "body", 10, 100) );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCheckBoxWithLabel(news, "generateRss", "Generer RSS feed") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSelectWithLabel(news, linkList, Link.class, "Vælg et link", "Link") );
      out.write("\r\n");
      out.write("\t\r\n");
 if (news.getPicture() == null) { 
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.buildI18nTextFields(null, "Billedtekst", "picture_description", 100) );
      out.write("\r\n");
      out.write("\t\t<p><label for=\"picture_file\">Billedfil til upload</label><br/>\r\n");
      out.write("\t\t<input type=\"file\" name=\"picture_file\" size=\"100\"/></p>\r\n");
 } else { 
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.buildSelectWithLabel(news, pictureList, Picture.class, "Intet", "Billede") );
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write("\r\n");
 if (news.getDocument() == null) { 
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.buildI18nTextFields(null, "Dokumentbeskrivelse", "document_description", 100) );
      out.write("\r\n");
      out.write("\t\t<p><label for=\"document_file\">Dokumentfil til upload</label><br/>\r\n");
      out.write("\t\t<input type=\"file\" name=\"document_file\" size=\"100\"/></p>\r\n");
 } else { 
      out.write("\r\n");
      out.write("\t\t");
      out.print( FktViewHelper.buildSelectWithLabel(news, documentList, Document.class, "Intet", "Dokument") );
      out.write('\r');
      out.write('\n');
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(news) );
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton(News.class) );
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form> \r\n");
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
