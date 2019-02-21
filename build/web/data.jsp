<%@page import="java.sql.*"%>
        <% 
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
                Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://https://github.com/hari2849/new/sitams","root","pass");
                Statement stmt=conn.createStatement();
                
                int i=stmt.executeUpdate("insert into sitams(PaperTitle,PaperID,AuthorName,CoAuthor,Qualification,Designation,Department,Institute,Address,Mail,Mobile,PaidAmount,PaymentDate,TransactionId,RegDate) values('"+title+"','"+fname+"','"+lname+"','"+mobile+"','"+mail+"','"+pass+"','"+address+"','"+city+"','"+state+"','"+zip+"','"+country+"','"+pamt+"','"+pdate+"','"+tid+"','"+rdate+"')");
               if(i>0)
               {%>
               <%
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
                    
         %>