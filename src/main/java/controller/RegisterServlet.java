package controller;

import dao.RegisterDAO;
import model.AccountModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registerservlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        int id_role = Integer.parseInt(req.getParameter("id_role"));
        AccountModel account = new AccountModel(id,username,password,id_role);

        if(RegisterDAO.register(account) == true) {
            resp.sendRedirect("/login.jsp");
        }else {resp.sendRedirect("/register.jsp");

        }
    }
    }

