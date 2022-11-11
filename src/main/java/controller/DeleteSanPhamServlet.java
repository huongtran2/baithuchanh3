package controller;

import service.SanPhamService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deletesanphamservlet")
public class DeleteSanPhamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Idsanpham = Integer.parseInt(req.getParameter("Idsanpham"));
        SanPhamService.delete(Idsanpham);
        resp.sendRedirect("/sanphamservlet");
    }
}
