<!DOCTYPE html>

<html>
    <head>
        <title>Nomad Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Nomad Login Page</h1>
        <h2>Login Details</h2>
        <form action="NomadServlet" method="post">
            <input type="hidden" name="action" value="login_check">
            <table border='1px solid black' cellpadding="5">
                <tr>
                    <th>
                        <label class="pad_top">Username: </label>
                        <input type="text" name="username" value="" required>
                    </th>
                </tr>
                <tr>
                    <th>
                        <label class="pad_top">Password: </label>
                        <input type="password" name="password" value="" required>
                    </th>
                </tr>
                <tr>
                    <th><input type="submit" value="Login"></th>
                </tr>
            </table>
        </form>
        <form action="NomadServlet" method="post">
            <table border='1px solid black' cellpadding="5">
            <input type="hidden" name="action" value="create">
                <tr>
                    <th>
                        <input type="submit" value="Create Account">
                    </th>
                </tr> 
            </table>
        </form>
    </body>
</html>
