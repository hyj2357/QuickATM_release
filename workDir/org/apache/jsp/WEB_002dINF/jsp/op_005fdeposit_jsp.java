/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-12-14 17:52:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class op_005fdeposit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("  <title>操作</title>\r\n");
      out.write("  <!-- <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> -->\r\n");
      out.write("  <link href=\"pages/css/top_style.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"pages/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"pages/css/login_style.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"pages/css/op_style.css\" rel=\"stylesheet\">\r\n");
      out.write("  <script src=\"pages/js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("  <script src=\"pages/js/op_js.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("     function changeButtonStatusMouseOver(){\r\n");
      out.write("         $(\".topButton\").css(\"color\",\"#FFFFFF\");\r\n");
      out.write("         $(\".topButton\").css(\"background-color\",\"#FF9900\");\r\n");
      out.write("\t }\r\n");
      out.write("     function changeButtonStatusMouseOut(){\r\n");
      out.write("\t\t $(\".topButton\").css(\"color\",\"#FF9900\");\r\n");
      out.write("         $(\".topButton\").css(\"background-color\",\"\");\r\n");
      out.write("\t }\r\n");
      out.write("  </script>\r\n");
      out.write("  <div class=\"top\">\r\n");
      out.write("   <div class=\"blackPurdah\" style=\"height:15%;position:fixed;\">\r\n");
      out.write("   </div>\r\n");
      out.write("   ");

       String e = (String)session.getAttribute("errMsg");
       if(e!=null){
    	   out.print(   
    	    "<div class=\"blackPurdah\" style=\"height:10%;position:fixed;top:16%;\">"
    	   +"<span style=\"font-family:微软雅黑;font-size:36px;color:#FF9900;padding-left:40%\">"
    	   +"<strong>"+e+"</strong>"
    	   +"<span>"
           +"</div>");
    	   session.removeAttribute("errMsg");
       }
    
      out.write("\r\n");
      out.write("   <div style=\"z-index:4;position:fixed;top:3.5%;width:100%;\">\r\n");
      out.write("      <a href=\"http://139.129.24.81:8082/QuickATM/LoginOut\">\r\n");
      out.write("         <img style=\"cursor:pointer;position:relative;top:5%;\" src=\"pages/image/prev.png\"/>\r\n");
      out.write("\t  </a>\r\n");
      out.write("\t  <a href=\"http://139.129.24.81:8082/QuickATM/LoginOut\">\r\n");
      out.write("\t     <label style=\"cursor:pointer;color:rgba(255,255,255,0.6);font-family:微软雅黑;font-size:28px;margin-top:5px\">取卡退出</label>\r\n");
      out.write("\t  </a>\r\n");
      out.write("\t  <div style=\"top: 5px;position: fixed;right: 10%;\">\r\n");
      out.write("\t     <label style=\"color: #FF9900;font-family: 微软雅黑;font-size: 48px;margin-left: 1000px;margin-top: 15px;\">\r\n");
      out.write("\t        <strong>Q&A</strong>\r\n");
      out.write("\t     </label>\r\n");
      out.write("\t  </div>\r\n");
      out.write("   </div>  \r\n");
      out.write("   <div class=\"content\">\r\n");
      out.write("      <div style=\"left: 20%;position: absolute;top:30%;\">\r\n");
      out.write("          <form action=\"http://139.129.24.81:8082/QuickATM/DepositToAccount\" method=\"post\">\r\n");
      out.write("\t          <div class=\"inputGroup\" style=\"right:0%;\">\r\n");
      out.write("\t            <label>\t  \r\n");
      out.write("\t               <span class=\"inputLabel\" style=\"font-size:36px;\">\r\n");
      out.write("\t                  <strong>存款数额</strong>\t  \r\n");
      out.write("\t               </span>\r\n");
      out.write("\t            </label>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                <input name=\"amount\" class=\"inputTxt\"  type=\"text\" placeholder=\"请输入存款数额\"/><br/><br/><br/>\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t\t\t  <div style=\"margin-left: -10%;\">\r\n");
      out.write("\t            <input class=\"submitButton\" type=\"submit\" value=\"确定\" onmouseout=\"submit_changeButtonStatusMouseOut()\" onmousemove=\"submit_changeButtonStatusMouseOver()\">\r\n");
      out.write("\t          </div>\r\n");
      out.write("\t      </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <br/><br/>\r\n");
      out.write("     </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"op_border\">\r\n");
      out.write("      <div class=\"op_border_div\" style=\"border-color:#FF9900 #FF9900 #FFFFFF #FF9900;margin-top:0px;background-color:#FF9900;color:#000000;\">\r\n");
      out.write("\t     <strong>操作</strong>\r\n");
      out.write("\t  </div>\r\n");
      out.write("      <div class=\"op_border_div\"   onclick=\"window.location.href='http://139.129.24.81:8082/QuickATM/pfs_s?p=op.jsp'\" onmouseout=\"cgOpBorderDivMouseOut($(this))\" onmousemove=\"cgOpBorderDivMouseOver($(this))\">\r\n");
      out.write("\t    <span>\r\n");
      out.write("\t     首页\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t  </div>\r\n");
      out.write("      <div class=\"op_border_div\"  onclick=\"window.location.href='http://139.129.24.81:8082/QuickATM/pfs_s?p=op_deposit.jsp'\"   style=\"background-color:#FFFFFF;border-color:#FFFFFF #FF9900 #FFFFFF #FFFFFF;\">\r\n");
      out.write("\t    <span>\r\n");
      out.write("\t    存款\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t  </div>\r\n");
      out.write("      <div class=\"op_border_div\"  onclick=\"window.location.href='http://139.129.24.81:8082/QuickATM/pfs_s?p=op_draw.jsp'\"  onmouseout=\"cgOpBorderDivMouseOut($(this))\" onmousemove=\"cgOpBorderDivMouseOver($(this))\">\r\n");
      out.write("\t    <span>\r\n");
      out.write("\t     取款\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t  </div>\r\n");
      out.write("      <div class=\"op_border_div\"  onclick=\"window.location.href='http://139.129.24.81:8082/QuickATM/CheckAccountBalance'\"  onmouseout=\"cgOpBorderDivMouseOut($(this))\" onmousemove=\"cgOpBorderDivMouseOver($(this))\">\r\n");
      out.write("\t    <span>\r\n");
      out.write("\t    查询账户余额\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t  </div>\r\n");
      out.write("      <div class=\"op_border_div\"  onclick=\"window.location.href='http://139.129.24.81:8082/QuickATM/pfs_s?p=op_transfer.jsp'\"  onmouseout=\"cgOpBorderDivMouseOut($(this))\" onmousemove=\"cgOpBorderDivMouseOver($(this))\">\r\n");
      out.write("\t    <span>\r\n");
      out.write("\t      转账\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t  </div>\r\n");
      out.write("      <div class=\"op_border_div\"  onclick=\"window.location.href='http://139.129.24.81:8082/QuickATM/pfs_s?p=op_modifyPassword.jsp'\"  onmouseout=\"cgOpBorderDivMouseOut($(this))\" onmousemove=\"cgOpBorderDivMouseOver($(this))\">\r\n");
      out.write("\t    <span>\r\n");
      out.write("\t     修改密码\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t  </div>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!--\r\n");
      out.write("  <div class=\"intro3\">\r\n");
      out.write("     <label class=\"introText\">\r\n");
      out.write("\t   <strong>���֧������</strong>\r\n");
      out.write("\t </label>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"intro1\">\r\n");
      out.write("     <label class=\"introText\" style=\"left:10%;\">\r\n");
      out.write("\t    <strong>��ȫ֧������</strong>\r\n");
      out.write("\t </label>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"intro2\">\r\n");
      out.write("     <label class=\"introText\">\r\n");
      out.write("\t    <strong>����֧������</strong>\r\n");
      out.write("\t </label>\r\n");
      out.write("  </div>\r\n");
      out.write("  -->\r\n");
      out.write("    <div class=\"pageInfo\">\r\n");
      out.write("     <div class=\"introText\" style=\"position:relative;left:50%;top:30%\">\r\n");
      out.write("\t  \t<a href=\"http://www.baidu.com\">\r\n");
      out.write("\t\t    <strong>联系我们</strong>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t </div>\r\n");
      out.write("     <div class=\"introText\" style=\"position: relative;\r\n");
      out.write("left:42%;\">\r\n");
      out.write("\t  \t<strong>备案信息:XXXXXXXXXXXXX</strong>  \r\n");
      out.write("\t </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
