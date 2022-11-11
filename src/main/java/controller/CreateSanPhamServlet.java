package controller;

import model.SanPhamModel;
import service.SanPhamService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/createsanphamservlet")
public class CreateSanPhamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Idsanpham = Integer.parseInt(req.getParameter("Idsanpham"));
        if( SanPhamService.checkid(Idsanpham))
        {
            String namesanpham = req.getParameter("namesanpham");
            Double price = Double.valueOf(req.getParameter("price"));
            SanPhamService.add(new SanPhamModel(Idsanpham,namesanpham,price));
            resp.sendRedirect("/sanphamservlet");
//
        }
        else {
            req.setAttribute("thongbaoproductID","Ban bi trung id, xin moi nhap lai :");
            RequestDispatcher dispatcher = req.getRequestDispatcher("createsanpham.jsp");
            dispatcher.forward(req, resp);
        }

    }

}
