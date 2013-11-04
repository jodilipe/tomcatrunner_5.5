package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import dk.japps.pics.*;
import dk.japps.pics.file.*;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Jon Lind Pictures</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"etc/pics.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"menu\">\n");
      out.write("\t");
 List<Folder> folders = new PicsLogic().getFolders(); 
      out.write('\n');
      out.write('	');
 for (Folder folder : folders) { 
      out.write('\n');
      out.write('	');
   if (folder.getName().equals(request.getParameter("category"))) { 
      out.write("\n");
      out.write("\t<div class=\"selected_menu_item\">");
      out.print( folder.getName() );
      out.write("</div>\n");
      out.write("\t");
   } else { 
      out.write("\n");
      out.write("\t<div class=\"menu_item\"><a href=\"index.jsp?category=");
      out.print( folder.getName() );
      out.write('"');
      out.write('>');
      out.print( folder.getName() );
      out.write("</a></div>\n");
      out.write("\t");
   } 
      out.write('\n');
      out.write('	');
 } 
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"thumbnails\">\n");
      out.write("\t");
 List<String> thumbs = new PicsLogic().getThumbnails(request.getParameter("category")); 
      out.write('\n');
      out.write('	');
 for (String thumb : thumbs) { 
      out.write("\n");
      out.write("\t<div class=\"thumbnail\"><a href=\"preview.jsp?filename=");
      out.print( thumb );
      out.write("\"><img border=\"0\" src=\"/pics/thumb/");
      out.print( thumb );
      out.write("\"></a></div>\n");
      out.write("\t");
 } 
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
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
