package org.apache.jsp.cms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dk.lindmadsen.pb.model.PbObject;
import java.util.List;
import commons.StringUtil;
import fw.model.NamedI18nFrase;

public final class _005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 List<PbObject> list = (List<PbObject>) request.getAttribute("list");
   Class model = (Class) request.getAttribute("model"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3 class=\"title\">List ");
      out.print( StringUtil.getShortClassName(model) );
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("    <th class=\"description\">");
      out.print( NamedI18nFrase.getText("cms_header_description", "Description", request) );
      out.write("</th>\n");
      out.write("    <th class=\"action\">");
      out.print( NamedI18nFrase.getText("cms_header_action", "Action", request) );
      out.write("</th>\n");
      out.write("  </tr>\n");
      out.write("\r\n");
 for (PbObject pbObject : list) { 
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td class=\"description\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/cms/edit/");
      out.print( pbObject.getId() );
      out.write("?model=");
      out.print( pbObject.getClass().getName() );
      out.write('"');
      out.write('>');
      out.print( pbObject.toString() );
      out.write("</a></td>\r\n");
      out.write("    <td class=\"action\"><input type=\"button\" name=\"delete\" value=\"Delete\" onclick=\"if(confirm('Delete ");
      out.print( StringUtil.getShortClassName(model) );
      out.write("?')){location.href='");
      out.print( request.getContextPath() );
      out.write("/do/cms/delete?id=");
      out.print( pbObject.getId() );
      out.write("&model=");
      out.print( model.getName() );
      out.write("'};\"/></td>\r\n");
      out.write("  </tr>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div class=\"buttons\">\r\n");
      out.write("\t<input type=\"button\" name=\"new\" value=\"New\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/do/cms/create?model=");
      out.print( model.getName() );
      out.write("'\"/>\r\n");
      out.write("</div>\r\n");
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
