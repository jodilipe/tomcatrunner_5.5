package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import fkt.mvc.model.*;
import fkt.mvc.view.*;
import fw.mvc.model.*;
import fw.util.*;

public final class member_005finfo_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Member member = (Member) request.getAttribute("object"); 
      out.write('\r');
      out.write('\n');
 List weapons = (List) request.getAttribute("weapon_list"); 
      out.write('\r');
      out.write('\n');
 Address address = member.getAddress(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<h3>");
      out.print( FktViewHelper.getText("member_info_title", request, "Dine data") );
      out.write("</h3>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/fkt/do/siteMemberArea/saveMemberInfo\" method=\"post\">\r\n");
      out.write("<table width=\"100%\" cellpadding=\"10px\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "forename", 30, FktViewHelper.getText("forename_label", request, "Fornavn")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "middlename", 30, FktViewHelper.getText("middlename_label", request, "Mellemnavn(e)")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "surname", 30, FktViewHelper.getText("surname_label", request, "Efternavn")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildDateTextFieldWithLabel(member.getBirthDate(), "birthDate", 30, FktViewHelper.getText("birthDate_label", request, "Fødselsdato (dd-mm-åååå)"), Formatters.DD_MM_YYYY) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(address, "street", 30,  FktViewHelper.getText("street_label", request, "Gade/vej")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(address, "streetNo", 30,  FktViewHelper.getText("streetNo_label", request, "Nummer")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(address, "floor", 30,  FktViewHelper.getText("floor_label", request, "Etage")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(address, "floor2", 30,  FktViewHelper.getText("floor2_label", request, "Side")) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(address, "address2", 30,  FktViewHelper.getText("address2_label", request, "Co")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(address, "postcode", 30,  FktViewHelper.getText("postcode_label", request, "Postnummer")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(address, "city", 30,  FktViewHelper.getText("city_label", request, "By")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "email", 30, FktViewHelper.getText("email_label", request, "Email")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "emailWork", 30, FktViewHelper.getText("email_label", request, "Email arbejde")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "phone", 30, FktViewHelper.getText("phone_label", request, "Telefon")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "phoneWork", 30, FktViewHelper.getText("phoneWork_label", request, "Telefon arbejde")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "phoneMobile", 30, FktViewHelper.getText("phoneMobile_label", request, "Mobil")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "fax", 30, FktViewHelper.getText("fax_label", request, "Fax")) );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "guardian", 30, FktViewHelper.getText("guardian_label", request, "Værge")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "guardianContact", 30, FktViewHelper.getText("guardianContact_label", request, "Værge kontakt")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "note", 30, FktViewHelper.getText("note_label", request, "Note")) );
      out.write("</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildDateTextFieldWithLabel(member.getMemberFrom(), "memberFrom", 30, FktViewHelper.getText("memberFrom_label", request, "Indmeldelsesdato (dd-mm-åååå)"), Formatters.DD_MM_YYYY, true) );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildDateTextFieldWithLabel(member.getMemberTo(), "memberTo", 30, FktViewHelper.getText("memberTo_label", request, "Udmeldelsesdato (dd-mm-åååå)"), Formatters.DD_MM_YYYY, true) );
      out.write("</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print( FktViewHelper.buildTextFieldWithLabel(member, "login", 30, FktViewHelper.getText("username_label", request, "Brugernavn")) );
      out.write("</td>\r\n");
      out.write("\t\t<td><p><label for=\"password\">");
      out.print( FktViewHelper.getText("password_label", request, "Adgangskode") );
      out.write("</label><br/><input name=\"password\" size=\"30\" type=\"text\" value=\"");
      out.print( member.getDecryptedPassword() != null ? member.getDecryptedPassword() : "" );
      out.write("\"/></p></td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td><p><label for=\"recieveNewsLetter\">");
      out.print( FktViewHelper.getText("recieveNewsLetter_label", request, "Jeg ønsker at modtage nyhedsbreve") );
      out.write("</label><br/>");
      out.print( FktViewHelper.buildCheckBox(member, "recieveNewsLetter") );
      out.write("</p></td>\r\n");
      out.write("\t\t<td><p>");
      out.print( FktViewHelper.getText("weapon_label", request, "Våben") );
      out.write("<br/>");
      out.print( FktViewHelper.buildManyToManyTable(weapons, member.getWeapons(), 5) );
      out.write("</p></td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"4\">\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildHiddenId(member) );
      out.write("\t\r\n");
      out.write("\t");
      out.print( FktViewHelper.buildSaveButton() );
      out.write("\r\n");
      out.write("  ");
      out.print( FktViewHelper.buildCancelButton("site", "index") );
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
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
