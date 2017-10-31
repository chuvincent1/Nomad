<%-- 
    Document   : successful_creation
    Created on : Oct 10, 2017, 10:47:51 AM
    Author     : Vince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Successful Account Creation</title>
    </head>
    <body>
        <h1>Successful Account Creation!</h1>
        <form action="NomadServlet" method="post">        
            <input type="hidden" name="action" value="login_page">
            <table border='1px solid black' cellpadding="5">
                <tr>
                    <th><input type="submit" value="Login Page"></th>
                </tr>
            </table>
        </form>        
    </body>
</html>
