package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;

public final class picture_005fcategory_005fshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 List pictureList = (List) request.getAttribute("picture_list"); 
      out.write('\r');
      out.write('\n');
 String galleryName = (String) request.getAttribute("gallery_name"); 
      out.write('\r');
      out.write('\n');
 Picture picture = (Picture) request.getAttribute("picture"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("  ");
 if (picture == null && pictureList.size() > 0) {
  		 picture = (Picture) pictureList.get(0);
		 } 
      out.write("\r\n");
      out.write("\t\t \r\n");
      out.write("\t<h3>");
      out.print( FktViewHelper.getText(picture.getPictureCategory().getDescription(), request) );
      out.write("</h3>\t\r\n");
      out.write("  \r\n");
      out.write("\t<table>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t    <td>");
      out.print( FktViewHelper.buildImage("gallery/" + picture.getPictureCategory().getCode(), picture.getFileName()) );
      out.write("</td>\r\n");
      out.write("\t    <td>");
      out.print( FktViewHelper.getTextOrBlank(picture.getDescription(), request) );
      out.write("</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildPaginationTable(Picture.class, "site", "showPictureCategory", request) );
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t");
 for (Iterator i = pictureList.iterator(); i.hasNext();) {
			 Picture currentPicture = (Picture) i.next(); 
      out.write("\r\n");
      out.write("\t\t\t ");
      out.print( FktViewHelper.buildImageLink("gallery/" + galleryName, currentPicture.getThumbnailFileName(), "/fkt/do/site/showPictureCategory?pictureId=" + currentPicture.getId() + "&" + Picture.class.getName() + "_direction=unchanged", null, false) );
      out.write('\r');
      out.write('\n');
      out.write('	');
 } 
      out.write("\r\n");
      out.write("</center>\r\n");
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
