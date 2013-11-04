package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;
import fw.util.*;

public final class training_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Training training = (Training) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 List weekdays = (List) request.getAttribute("weekday_list"); 
      out.write('\r');
      out.write('\n');
 List places = (List) request.getAttribute("place_list"); 
      out.write('\r');
      out.write('\n');
 List weapons = (List) request.getAttribute("weapon_list"); 
      out.write('\r');
      out.write('\n');
 List trainers = (List) request.getAttribute("trainer_list"); 
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<h3>Redigering af træningstid</h3>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/fkt/do/training/save\" method=\"post\">\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCheckBoxWithLabel(training, "generateRss", "Generer RSS feed") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildSelectWithLabel(training, weekdays, Weekday.class, "Ugedag") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildSelectWithLabel(training, places, Place.class, "Sted") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextFieldWithLabel(training, "start", 10, "Fra (tt.mm)") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildTextFieldWithLabel(training, "end", 10, "Til (tt.mm)") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildSelectWithLabel(training, weapons, Weapon.class, "Våben") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildI18nTextAreaFields(training.getDescription(), "Beskrivelse", "description", 2, 70) );
      out.write("\r\n");
      out.write("\t<p>Trænere<br/>\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildManyToManyTable(trainers, training.getTrainers(), 5) );
      out.write("</p>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(training) );
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton(Training.class) );
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
