package controller;

import service.SanPhamService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/sanphamservlet")
public class SanPhamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("sanphams", SanPhamService.sanPhamModels);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showsanphamadmin.jsp");
        dispatcher.forward(req, resp);
    }
}
