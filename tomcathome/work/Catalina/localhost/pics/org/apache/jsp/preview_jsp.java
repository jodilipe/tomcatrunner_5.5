package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dk.japps.pics.*;
import dk.japps.pics.file.*;

public final class preview_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Preview</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"etc/pics.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"picture_preview\">\n");
      out.write("<a href=\"original.jsp?filename=");
      out.print( request.getParameter("filename") );
      out.write("\"><img border=\"0\" src=\"/pics/preview/");
      out.print( request.getParameter("filename") );
      out.write("\"></a>\n");
      out.write("\n");
      out.write("<div class=\"exif_info\">\n");
 Map<String, String> result = new PictureFileUtil().getExifInfo(new PicsLogic().getOriginalPath(request.getParameter("filename"))); 
      out.write('	');
      out.write('\n');
 List<String> keys = new ArrayList<String>(); 
      out.write('	');
      out.write('\n');
 keys.addAll(result.keySet()); 
      out.write('	');
      out.write('\n');
 Collections.sort(keys);
      out.write('\n');
 for (String key : keys) { 
      out.write("\t\t \n");
      out.write("<div class=\"exif_item\">");
      out.print( key + ": " + result.get(key) );
      out.write("</div>\t\t\t\n");
 } 
      out.write("\t\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
