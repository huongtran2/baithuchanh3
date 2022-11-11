package controller;

import dao.SanPhamDAO;
import model.SanPhamModel;
import service.SanPhamService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/editsanphamservlet")
public class EditSanPhamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Idsanpham = Integer.parseInt(req.getParameter("Idsanpham"));
        for (SanPhamModel p: SanPhamService.sanPhamModels) {
            if (p.getIdsanpham() == Idsanpham){
                req.setAttribute("sp", p);
            }
        }
        req.setAttribute("sanphams", SanPhamDAO.getById(Idsanpham));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/editsanpham.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Idsanpham = Integer.parseInt(req.getParameter("Idsanpham"));
        String namesanpham = req.getParameter("namesanpham");
        Double price = Double.valueOf(req.getParameter("price"));
        SanPhamService.edit(Idsanpham, new SanPhamModel(Idsanpham,namesanpham,price));
        resp.sendRedirect("/sanphamservlet");
    }

}
