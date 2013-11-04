package org.apache.jsp.cms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dk.lindmadsen.pb.model.PbObject;
import java.lang.reflect.Field;
import dk.lindmadsen.pb.Pb;
import java.util.Locale;
import fw.WebApplication;
import fw.model.I18nFrase;
import dk.lindmadsen.pb.model.PbList;
import java.util.List;
import commons.StringUtil;
import commons.ReflectUtil;
import fw.module.archive.Archive;

public final class _005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 PbObject pbObject = (PbObject) request.getAttribute("object"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h3>Edit ");
      out.print( StringUtil.getShortClassName(pbObject.getClass()) );
      out.write("</h3>\r\n");
      out.write(" \r\n");
      out.write("<form action=\"");
      out.print( request.getContextPath() );
      out.write("/do/cms/save\" enctype=\"multipart/form-data\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t");
 for (Field field : ReflectUtil.getFields(pbObject.getClass())) {
		   Object value = ReflectUtil.getFieldValue(field, pbObject);
	     if (I18nFrase.class.isAssignableFrom(field.getType())) { 
	       for (Locale locale : WebApplication.instance.getLocales()) { 
	       	 String localizedValue = value != null ? ((I18nFrase) value).getContent(locale) : null; 
      out.write("\r\n");
      out.write("\t         <div class=\"label\">");
      out.print( field.getName() + " (" + locale.toString() + ")" );
      out.write("</div>\r\n");
      out.write("\t   \t     <div class=\"attribute\"><textarea name=\"");
      out.print( field.getName() );
      out.write('_');
      out.print( locale.toString() );
      out.write("\" rows=\"3\"  class=\"medium\">");
      out.print( localizedValue != null ? localizedValue : "" );
      out.write("</textarea></div>\r\n");
      out.write("\t");
 	 	 }
	     } else if (PbList.class.isAssignableFrom(field.getType())) { 
	    	 PbList<PbObject> associations = (PbList<PbObject>) ReflectUtil.invoke(pbObject, "get" + StringUtil.firstToUpperCase(field.getName())); 
      out.write("\r\n");
      out.write("\t\t  \t <div class=\"label\">");
      out.print( field.getName() );
      out.write("</div>\r\n");
      out.write("\t");
   	 for (PbObject candidate : Pb.findAll(associations.getType())) {
	    		 String checked = (associations != null ? associations.contains(candidate) : false) ? " checked" : ""; 
      out.write("\r\n");
      out.write("\t\t    \t <div class=\"attribute\">\r\n");
      out.write("\t\t    \t\t <span class=\"checkbox\"><input type=\"checkbox\" name=\"");
      out.print( StringUtil.getShortClassName(candidate.getClass()) );
      out.write('_');
      out.print( candidate.getId() );
      out.write('"');
      out.write(' ');
      out.print( checked );
      out.write("/>\r\n");
      out.write("\t\t    \t\t \t <a href=\"");
      out.print( request.getContextPath() );
      out.write("/do/cms/edit/");
      out.print( candidate.getId() );
      out.write("?model=");
      out.print( candidate.getClass().getName() );
      out.write('"');
      out.write('>');
      out.print( candidate.toString() );
      out.write("</a>\r\n");
      out.write("\t\t    \t\t </span>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t");
   	 }  
      out.write('\r');
      out.write('\n');
      out.write('	');
   } else if (PbObject.class.isAssignableFrom(field.getType())) { 
      out.write("\r\n");
      out.write("\t\t  \t <div class=\"label\">");
      out.print( field.getName() );
      out.write("</div>\r\n");
      out.write("\t\t  \t <div class=\"attribute\"><select name=\"");
      out.print( field.getName() );
      out.write("\" class=\"medium\">\r\n");
      out.write("\t\t  \t <option value=\"\"></option>\r\n");
      out.write("\t\t  \t ");
 for (PbObject assoc : Pb.findAll((Class<? extends PbObject>) field.getType())) { 
      out.write("\r\n");
      out.write("\t\t  \t   <option value=\"");
      out.print( assoc.getId() );
      out.write('"');
      out.print( value != null && value.equals(assoc) ? " selected" : "" );
      out.write('>');
      out.print( assoc.toString() );
      out.write("</option>\r\n");
      out.write("\t\t  \t ");
 } 
      out.write("\r\n");
      out.write("\t\t  \t </select>\r\n");
      out.write("\t\t  \t </div>\r\n");
      out.write("\t");
   } else {
		   	 Object fieldValue = ReflectUtil.getFieldValue(field, pbObject); 
      out.write("\r\n");
      out.write("\t\t   \t <div class=\"label\">");
      out.print( field.getName() );
      out.write("</div>\r\n");
      out.write("\t\t   \t <div class=\"attribute\">\r\n");
      out.write("\t\t\t\t   <input type=\"text\" name=\"");
      out.print( field.getName() );
      out.write("\" class=\"medium\" value=\"");
      out.print( fieldValue != null ? fieldValue : "" );
      out.write("\"/>\r\n");
      out.write("\t\t   \t </div>\r\n");
      out.write("\t");
   }
		 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
 if (Archive.class.isAssignableFrom(pbObject.getClass())) { 
      out.write("\r\n");
      out.write("\t  \t <div class=\"label\">Upload file</div>\r\n");
      out.write("\t  \t <div class=\"attribute\"><input type=\"file\" name=\"file\" class=\"long\"/></div>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<input name=\"id\" type=\"hidden\" value=\"");
      out.print( pbObject.getId() );
      out.write("\"/>\r\n");
      out.write("\t<input name=\"model\" type=\"hidden\" value=\"");
      out.print( pbObject.getClass().getName() );
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"buttons\">\r\n");
      out.write("\t\t<input type=\"submit\" name=\"commit\" value=\"Save\"/>\r\n");
      out.write("\t\t<input type=\"button\" name=\"cancel\" value=\"Cancel\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/do/cms/list?model=");
      out.print( pbObject.getClass().getName() );
      out.write("'\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write(" ");
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
