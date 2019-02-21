<%@page import="java.sql.*"%>
        <% 
            String uname=request.getParameter("username");
            String pass=request.getParameter("pass");
         
            
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://https://github.com/hari2849/new/sitams","root","pass");
                Statement stmt=conn.createStatement();
                
                ResultSet rs=stmt.executeQuery("select * from admin where(UserName='"+(uname)+"' and Password='"+(pass)+"')");
               if(rs.next())
               {
                   %>
                   <script laguage="javascript">
                       alert("Registered");
                       window.location.href="index.html";
                       </script>
                       <%
               }
               else
               {
               %>
               <script language="javascript">
                   alert("UserName & Password Not Matched");
                   window.location.href="admin.html";
                   </script>
                   <%
               }
}
catch(Exception e)
{
    System.out.println(e);
}
%>