/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2015-10-16 19:53:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ComprarPassagem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Comprar Passagem</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layout.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"form-horizontal\" role=\"form\" method=\"post\" action=\"ComprarPassagem.do\">\r\n");
      out.write(" \t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"jumbotron\">\r\n");
      out.write("\t\t<h1></h1>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<h2><label>Comprar Passagem</label></h2>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Peso Bagagem<input type=\"text\" class=\"form-control\" id=\"pesoBagagem\" name=\"pesoBagagem\" /></label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Numero Bagagem<input type=\"text\" class=\"form-control\" id=\"numeroBagagem\" name=\"numeroBagagem\" /></label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Necessidade Especial</label>\r\n");
      out.write("\t\t\t<label for=\"sim\">Sim</label>\r\n");
      out.write("  \t\t\t<input type=\"radio\" name=\"ne\" id=\"ne\" value=\"sim\">\r\n");
      out.write("  \t\t\t<label for=\"nao\">Não</label>\r\n");
      out.write("  \t\t\t<input type=\"radio\" name=\"ne\" id=\"ne\" value=\"nao\">\t\t\t\r\n");
      out.write("  \t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Criança</label>\r\n");
      out.write("\t\t\t<label for=\"sim\">Sim</label>\r\n");
      out.write("  \t\t\t<input type=\"radio\" name=\"cr\" id=\"cr\" value=\"sim\">\r\n");
      out.write("  \t\t\t<label for=\"nao\">Não</label>\r\n");
      out.write("  \t\t\t<input type=\"radio\" name=\"cr\" id=\"cr\" value=\"nao\">\t\t\t\r\n");
      out.write("  \t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Ida e Volta</label>\r\n");
      out.write("\t\t\t<label for=\"sim\">Sim</label>\r\n");
      out.write("  \t\t\t<input type=\"radio\" name=\"iv\" id=\"iv\" value=\"sim\">\r\n");
      out.write("  \t\t\t<label for=\"nao\">Não</label>\r\n");
      out.write("  \t\t\t<input type=\"radio\" name=\"iv\" id=\"iv\" value=\"nao\">\t\t\t\r\n");
      out.write("  \t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Forma de Pagamento</label>\r\n");
      out.write("\t\t\t<label for=\"credito\">Credito</label>\r\n");
      out.write("  \t\t\t<input type=\"radio\" name=\"formapagamento\" id=\"formapagamento\" value=\"credito\">\r\n");
      out.write("  \t\t\t<label for=\"debito\">Debito</label>\r\n");
      out.write("  \t\t\t<input type=\"radio\" name=\"formapagamento\" id=\"formapagamento\" value=\"debito\">\t\t\t\r\n");
      out.write("  \t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Numero do Cartao<input type=\"text\" class=\"form-control\" id=\"numeroCartao\" name=\"numeroCartao\" /></label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Codigo de Segurança<input type=\"text\" class=\"form-control\" id=\"codigoSeguranca\" name=\"codigoSeguranca\" /></label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Data da ida<input type=\"text\" class=\"form-control\" id=\"dataIda\" name=\"dataIda\" /></label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<label>Data da Volta<input type=\"text\" class=\"form-control\" id=\"dataIda\" name=\"dataVolta\" /></label>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t<input id=\"submit\" name=\"submit\" type=\"submit\" value=\"Comprar Passagem\" class=\"btn btn-default\">\r\n");
      out.write("\t\t\t<a class=\"btn btn-default\" href=\"./EscolherVooPassagem.jsp\" role=\"button\">Voltar</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
