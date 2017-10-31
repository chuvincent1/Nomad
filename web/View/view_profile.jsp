<%-- 
    Document   : view_profile
    Created on : Oct 10, 2017, 3:08:55 AM
    Author     : Vince
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <h1>Your Information</h1>
            <table border='1px solid black' cellpadding="5">
                <tr>
                    <th>Username</th>
                    <th>Password</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Age</th>
                    <th>Gender</th>
                    <th>Travel Location</th>
                </tr>
            <%
                try
                {
                    String u = request.getParameter("u");
                    %>
                    <!--<td><%=u %></td>-->
                    <%
                    Class.forName("com.mysql.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/nomadDB?zeroDateTimeBehavior=convertToNull";
                    String username = "root";
                    String password = "";
                    String query = "SELECT * FROM USER";
                    Connection conn = DriverManager.getConnection(url,username,password);
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    while(rs.next())
                    {
            %>
                <tr>
                    <td><%=rs.getString("username") %></td>
                    <td><%=rs.getString("password") %></td>
                    <td><%=rs.getString("first_name") %></td>
                    <td><%=rs.getString("last_name") %></td>
                    <td><%=rs.getString("email") %></td>
                    <td><%=rs.getInt("age") %></td>
                    <td><%=rs.getString("gender") %></td>    
                    <td><%=rs.getString("travel_location") %></td>
                </tr>
            <%
            }
                rs.close();
                stmt.close();
                conn.close();
            }
            catch (Exception e)
            { 
                e.printStackTrace();
            }

            %>    
            </table>
    </body>
</html>
