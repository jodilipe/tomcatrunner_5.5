package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import loppemani.logic.SessionLogic;
import loppemani.model.ArticleSpecification;
import loppemani.wrapper.*;

public final class _005fbasket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<table width=\"100%\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" style=\"border-bottom: 1px solid #000000;\"><a href=\"/loppemani/kurv.htm\">kurv</a></td>\r\n");
      out.write("\t</tr>\r\n");

		for (Iterator i = SessionLogic.getBasket(request).getArticleSpecifications().iterator(); i.hasNext();) {
			ArticleWrapper artWrp = new ArticleWrapper(request, ((ArticleSpecification) i.next()).getArticle());

      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><a href=\"/loppemani/do/site/removeFromBasket/");
      out.print( artWrp.getId() );
      out.write("\" title=\"fjern fra kurv\">");
      out.print( artWrp.getArticleDescription() );
      out.write("</a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"padding-bottom: 5\">pris</td>\r\n");
      out.write("\t\t<td align=\"right\" style=\"padding-bottom: 5\">");
      out.print( artWrp.getPrice() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
	} 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"border-top: 1px solid #000000;\">i alt</td>\r\n");
      out.write("\t\t<td align=\"right\" nowrap=\"nowrap\" style=\"border-top: 1px solid #000000;\">");
      out.print( new BasketWrapper(request, SessionLogic.getBasket(request)).getSum() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
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
