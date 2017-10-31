<%-- 
    Document   : edit_profile
    Created on : Oct 9, 2017, 9:50:48 PM
    Author     : vchu2_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
    </head>
    <body>
        <h1>Edit Profile</h1>
        <form action="NomadServlet" method="post">
            <input type="hidden" name="action" value="update_profile">
            <table border='1px solid black' cellpadding="5">
                <tr>
                    <th>
                        <label class="pad_top">Enter Current Username: </label>
                        <input type="text" name="user_id" class="container-fluid" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Enter Current Password: </label>
                        <input type="password" name="pass" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>Update ALL Info Below: </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">First Name: </label>
                        <input type="text" name="first_name" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Last Name: </label>
                        <input type="text" name="last_name" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Email: </label>
                        <input type="text" name="email" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Gender: </label>
                        <select id="gender" name="gender">
                            <option>select one</option>
                            <option value="He">He</option>
                            <option value="She">She</option>
                            <option value="They">They</option>
                        </select>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Age: </label>
                        <input type="text" name="age" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Travel Location: </label>
                        <input type="text" name="travel_location" value="" required>
                    </th>
                </tr>
                <tr>
                    <th><input type="submit" value="Update"></th>
                </tr>
            </table>
        </form>
    </body>
</html>
