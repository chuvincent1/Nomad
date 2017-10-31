<%-- 
    Document   : test
    Created on : Oct 30, 2017, 7:38:38 PM
    Author     : vchu2_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>test</title>
    </head>
    <body>
        <h1>View Account</h1>
        <form action="NomadServlet" method="post">        
            <input type="hidden" name="action" value="view_profile">
            <table border='1px solid black' cellpadding="5">
                <tr>
                    <th>
                        <label class="pad_top">Username: </label>
                        <input type="text" name="u" value="" required>
                    </th>
                </tr>
                <tr>
                    <th><input type="submit" value="View Profile"></th>
                </tr>
            </table>
        </form> 
    </body>
</html>
