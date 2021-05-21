package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"vn\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Register Form</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/icon_font/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/css/register.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/views/img/logo.png\" class=\"avatar\">\n");
      out.write("<br><br><br>\n");
      out.write("<br><br><br>\n");
      out.write("<br><br><br>\n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Register\" method=\"post\" style=\"max-width:500px;margin:auto\">\n");
      out.write("    <h2 align=\"center\">Đăng Kí Tài Khoản</h2>\n");
      out.write("    <div class=\"input-container\">\n");
      out.write("        <i class=\"fa fa-user icon\"></i>\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Ma nhan vien\" name=\"manv\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"input-container\">\n");
      out.write("        <i class=\"fa fa-user icon\"></i>\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Ten nhan vien\" name=\"tennv\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"input-container\">\n");
      out.write("        <i class=\"fa fa-user icon\"></i>\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"So dien thoai\" name=\"sdtnv\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"input-container\">\n");
      out.write("        <i class=\"fa fa-user icon\"></i>\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Ten tai khoan\" name=\"taikhoan\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"input-container\">\n");
      out.write("        <i class=\"fa fa-envelope icon\"></i>\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Email\" name=\"email\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"input-container\">\n");
      out.write("        <i class=\"fa fa-key icon\"></i>\n");
      out.write("        <input class=\"input-field\" type=\"password\" placeholder=\"Mat khau\" name=\"matkhau\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" class=\"btn\">Register</button>\n");
      out.write("    <div class=\"col\">\n");
      out.write("        <a href=\"https://www.facebook.com\" class=\"fb btn\">\n");
      out.write("            <i class=\"fa fa-facebook fa-fw\"></i> Login with Facebook\n");
      out.write("        </a>\n");
      out.write("        <a href=\"https://www.google.com\" class=\"google btn\">\n");
      out.write("            <i class=\"fa fa-google fa-fw\"></i> Login with Google+\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("<script>\n");
      out.write("    function myFunction() {\n");
      out.write("        var x = document.createElement(\"SCRIPT\");\n");
      out.write("        var t = document.createTextNode(\"alert('Đăng Ký Thành Công')\");\n");
      out.write("        x.appendChild(t);\n");
      out.write("        document.body.appendChild(x);\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
