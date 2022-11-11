package controller;

import service.GioHangService;
import service.SanPhamService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/giohangservlet")
public class GioHangServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("giohang1", GioHangService.gioHangModels);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/showgiohang.jsp");
        dispatcher.forward(req, resp);
    }
}
