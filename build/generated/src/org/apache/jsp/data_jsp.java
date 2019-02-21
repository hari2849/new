package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class data_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("        ");
 
            String title=request.getParameter("title");
            String fname=request.getParameter("id");
            String lname=request.getParameter("aname");
            String mobile=request.getParameter("caname");
            String mail=request.getParameter("quali");
            String pass=request.getParameter("desg");
            String address=request.getParameter("dept");
            String city=request.getParameter("inst");
            String state=request.getParameter("address");
            String zip=request.getParameter("mail");
            String country=request.getParameter("mob");
            String pamt=request.getParameter("paidamt");
            String pdate=request.getParameter("pdate");
            String tid=request.getParameter("tid");
            String rdate=request.getParameter("rdate");
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sitams","root","pass");
                Statement stmt=conn.createStatement();
                
                int i=stmt.executeUpdate("insert into sitams(PaperTitle,PaperID,AuthorName,CoAuthor,Qualification,Designation,Department,Institute,Address,Mail,Mobile,PaidAmount,PaymentDate,TransactionId,RegDate) values('"+title+"','"+fname+"','"+lname+"','"+mobile+"','"+mail+"','"+pass+"','"+address+"','"+city+"','"+state+"','"+zip+"','"+country+"','"+pamt+"','"+pdate+"','"+tid+"','"+rdate+"')");
               if(i>0)
               {
      out.write("\n");
      out.write("               <script laguage=\"javascript\">\n");
      out.write("                       alert(\"Registered\");\n");
      out.write("                </script>\n");
      out.write("               ");

               }
               else
               {
                   out.print("Not Inserted");
               }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
                    
         
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
