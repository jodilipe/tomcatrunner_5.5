package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class tournament_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Tournament tournament = (Tournament) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 List countries = (List) request.getAttribute("country_list"); 
      out.write('\r');
      out.write('\n');
 List clubs = (List) request.getAttribute("club_list"); 
      out.write('\r');
      out.write('\n');
 List ratings = (List) request.getAttribute("rating_list"); 
      out.write('\r');
      out.write('\n');
 List weapons = (List) request.getAttribute("weapon_list"); 
      out.write('\r');
      out.write('\n');
 List participants = (List) request.getAttribute("participant_list"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Redigering af stævne</h3>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/fkt/do/tournament/save\" method=\"post\">\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildTextFieldWithLabel(tournament, "name", 90, "Navn") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildSelectWithLabel(tournament, countries, Country.class, "[Intet]", "Land") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildSelectWithLabel(tournament, clubs, Club.class, "[Ingen]", "Klub") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildSelectWithLabel(tournament, ratings, Rating.class, "Sværhedsgrad") );
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<p>Våben<br/>\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildManyToManyTable(weapons, tournament.getWeapons(), 5) );
      out.write("</p>\r\n");
      out.write("\t\r\n");
      out.write("\t<p>Kategorier<br/>\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildManyToManyTable(participants, tournament.getParticipants(), 5) );
      out.write("</p>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildI18nTextAreaFields(tournament.getDescription(), "Beskrivelse", "description", 7, 70) );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(tournament) );
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton(Tournament.class) );
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
