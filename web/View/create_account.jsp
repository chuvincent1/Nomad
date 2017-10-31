<%-- 
    Document   : create_account
    Created on : Oct 10, 2017, 10:32:25 AM
    Author     : Vince
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Account</title>
    </head>
    <body>
        <h1>Account Creation</h1>
        <form action="NomadServlet" method="post">        
            <input type="hidden" name="action" value="create_account">
            <table border='1px solid black' cellpadding="5">
                <tr>
                    <th>
                        <label class="pad_top">Username: </label>
                        <input type="text" name="create_username" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">First Name: </label>
                        <input type="text" name="create_first" value="" required>
                    </th>
                </tr>           
                <tr>
                    <th>
                        <label class="pad_top">Last Name:  </label>
                        <input type="text" name="create_last" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Enter Email: </label>
                        <input type="text" name="create_email" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Password: </label>
                        <input type="password" name="create_password" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Retype Password: </label>
                        <input type="password" name="create_password2" value="" required>
                    </th>
                </tr>
                <tr>
                    <th><input type="submit" value="Create Account"></th>
                </tr>
            </table>
        </form>        
    </body>
</html>
