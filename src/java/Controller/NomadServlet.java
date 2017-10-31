/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import Model.UserDB;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class NomadServlet extends HttpServlet {
    private String u = "";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String url = "";
        ServletContext sc = getServletContext();
        HttpSession session = request.getSession();
        
        if (action.equals("test"))
        {
            url = "/View/test.jsp";
        }
        else if (action.equals("view_profile"))
        {
            String u = request.getParameter("u");
            session.setAttribute("u", u);
            url = "/View/view_profile.jsp";
        }
        else if (action.equals("login_check"))
        {
            String username = "";
            String password = "";
            try
            {
                username = request.getParameter("username");
                password = request.getParameter("password");
                if (UserDB.userExists(username, password))
                {
                    u = username;
                    url = "/View/home.jsp";
                    
                }
                else
                {
                    url = "/View/login_error.jsp";
                }
            }
            catch (Exception e)
            {
                url = "/View/login_error.jsp";
            }
        }
        else if (action.equals("edit_profile"))
        {
            url = "/View/edit_profile.jsp";
        }
        else if (action.equals("update_profile"))
        {
            String user_id = "";
            String pass = "";
            String first_name = "";
            String last_name = "";
            String email = "";
            int age = 0;
            String age_temp = "";
            String gender = "";
            String travel_location = "";
            try
            {
                user_id = request.getParameter("user_id");
                pass = request.getParameter("pass");
                if (UserDB.userExists(user_id, pass))
                {
                    first_name = request.getParameter("first_name");
                    last_name = request.getParameter("last_name");
                    email = request.getParameter("email");
                    age_temp = request.getParameter("age");
                    age = Integer.parseInt(age_temp);
                    gender = request.getParameter("gender");
                    travel_location = request.getParameter("travel_location");
                    
                    User user = new User(user_id, pass, first_name, last_name, email, age, gender, travel_location);
                   

                    UserDB.update(user);

                    url = "/View/home.jsp";
                }
                else
                {
                    url = "/View/update_fail.jsp";
                }
            }
            catch (Exception e)
            {
                url = "/View/update_fail.jsp";
            }
        }
        else if (action.equals("create"))
        {
            url = "/View/create_account.jsp";
        }
        else if (action.equals("create_account"))
        {
            String create_username = "";
            String create_first = "";
            String create_last = "";
            String create_email = "";
            String create_password = "";
            String create_password2 = "";
            create_password = request.getParameter("create_password");
            create_password2 = request.getParameter("create_password2");
            System.out.println(create_password);
            System.out.println(create_password2);
            if (create_password.equals(create_password2))
            {
                try
                {
                    create_username = request.getParameter("create_username");
                    create_first = request.getParameter("create_first");
                    create_last = request.getParameter("create_last");
                    create_email = request.getParameter("create_email");
                    User user = new User(create_username, create_password, create_first, create_last, create_email,  0, "", "");
                    UserDB.insert(user);
                   
                    url = "/View/successful_creation.jsp";
                }
                catch (Exception e)
                {
                    url = "/View/unsuccessful_creation.jsp";
                }
            }
        }
        else if (action.equals("login_page"))
        {
            url = "/View/login.jsp";
        }
        
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
        
        sc.getRequestDispatcher(url)
                .forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
