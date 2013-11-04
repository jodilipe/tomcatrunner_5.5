package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import loppemani.model.Article;
import loppemani.wrapper.ArticleWrapper;

public final class _005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<table cellspacing=\"0\" cellpadding=\"10\" width=\"100%\">\r\n");

		for (Iterator i = ((List) request.getAttribute("latest_articles")).iterator(); i.hasNext();) {
			Article article = (Article) i.next();
			ArticleWrapper artWrp = new ArticleWrapper(request, article);

      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print( article.getNoInStock() );
      out.write(" stk. ");
      out.print( artWrp.getColor() );
      out.write(' ');
      out.print( artWrp.getBrand() );
      out.write(" <a href=\"/loppemani/do/site/addToBasket/");
      out.print( artWrp.getId() );
      out.write("\" title=\"put i kurv\">");
      out.print( artWrp.getArticleDescription() );
      out.write("</a>, ");
      out.print( artWrp.getUnitAndAmount() );
      out.write(',');
      out.write(' ');
      out.print( artWrp.getCondition() );
      out.write(',');
      out.write(' ');
      out.print( artWrp.getPrice() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td width=\"30%\" align=\"center\"><a href=\"/loppemani/article_image.jsp?article_image=");
      out.print( artWrp.getPictureName() );
      out.write("\" target=\"_blank\"><img src=\"/loppemani/files/images/");
      out.print( artWrp.getPictureThumbName() );
      out.write("\" alt=\"klik for større billede\"></a></td>\r\n");
      out.write("\t\t</tr>\r\n");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
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
