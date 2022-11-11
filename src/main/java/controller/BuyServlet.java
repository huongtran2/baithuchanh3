package controller;

import model.GioHangModel;
import model.SanPhamModel;
import service.GioHangService;
import service.SanPhamService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/buyservlet")
public class BuyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idgiohang = Integer.parseInt(req.getParameter("idgiohang"));
        if( SanPhamService.checkid(idgiohang))
        {
            int idsanpham = Integer.parseInt(req.getParameter("idsanpham"));
            int soluong = Integer.parseInt(req.getParameter("soluong"));
            Double price = Double.valueOf(req.getParameter("price"));
            Double tongtien = Double.valueOf(req.getParameter("tongtien"));
            GioHangService.add(new GioHangModel(idgiohang,idsanpham,soluong,price,tongtien));
            resp.sendRedirect("/giohangservlet");
//
        }
        else {
            req.setAttribute("thongbaoproductID","Ban bi trung id, xin moi nhap lai :");
            RequestDispatcher dispatcher = req.getRequestDispatcher("showsanphamuser.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
