package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fw.mvc.model.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;
import fkt.util.*;

public final class picture_005fcategory_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 PictureCategory pictureCategory = (PictureCategory) request.getAttribute("object"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Redigering af billedkategori</h3>\r\n");
      out.write(" \r\n");
      out.write("<form action=\"/fkt/do/pictureCategory/save\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildTextFieldWithLabel(pictureCategory, "code", 70, "Navn") );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildI18nTextFields(pictureCategory.getDescription(), "Beskrivelse", "description", 75) );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( FktViewHelper.buildCheckBoxWithLabel(pictureCategory, "membersOnly", "Kun for medlemmer") );
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table> \r\n");
      out.write("  <tr>\r\n");
      out.write("   \t<th>Thumbnail</th>\r\n");
      out.write("   \t<th>Beskrivelse</th>\r\n");
      out.write("   \t<th>Opdateret</th>\r\n");
      out.write("\t  <th colspan=\"2\"></th>\r\n");
      out.write("  </tr>\r\n");
 for (Iterator i = pictureCategory.getPictures().iterator(); i.hasNext();) {
	   Picture picture = (Picture) i.next(); 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildImage("gallery/" + picture.getPictureCategory().getCode(), picture.getThumbnailFileName()) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.getText(picture.getDescription(), request) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.getFormattedTimestamp(picture) );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.buildEditButton(picture, "pictureCategory", "editPicture") );
      out.write("</td>\r\n");
      out.write(" \t\t<td>");
      out.print( FktViewHelper.buildDeleteButton(picture, "pictureCategory", "deletePicture", "billede fra kategori") );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(pictureCategory) );
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<p>\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton(PictureCategory.class) );
      out.write("\r\n");
      out.write("\t</p>\r\n");
      out.write("\t\r\n");
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
