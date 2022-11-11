package dao;

import model.GioHangModel;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GioHangDAO {
    static Connection connection = ConnectMySql.getConnection();
    //  hàm lấy tất cả của list san pham model;
    public static List<GioHangModel> getAll() {
        String sql = "Select * from GioHang";
        List<GioHangModel> gioHangModels = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int idgiohang = resultSet.getInt("idgiohang");
                int idsanpham = resultSet.getInt("idsanpham");
                int soluong = resultSet.getInt("soluong");
                Double price = resultSet.getDouble("price");
                Double tongtien = resultSet.getDouble("tongtien");
                gioHangModels.add(new GioHangModel(idgiohang,idsanpham,soluong,price,tongtien));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return gioHangModels;
    }

    // hàm luu san phẩm vào database (create)
    public static void save(GioHangModel gioHangModel) {
        try {
            String sql = "INSERT INTO `thuchanh_md3`.`GioHang` (idgiohang,idsanpham,soluong,price,tongtien) VALUES (?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,gioHangModel.getIdgiohang());
            preparedStatement.setInt(2,gioHangModel.getIdsanpham());
            preparedStatement.setInt(3,gioHangModel.getSoluong());
            preparedStatement.setDouble(4,gioHangModel.getPrice());
            preparedStatement.setDouble(5,gioHangModel.getTongtien());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    // hàm xóa sanpham ở database;(xóa)
    public static void delete(int idgiohang) {
        String sql = "delete from GioHang where idgiohang = '" + idgiohang + "'";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // tìm kiếm sản phẩm theo ID (sửa)
    public static GioHangModel getById(int idgiohang) {
        String sql = "select * from GioHang where idgiohang?";
        GioHangModel gioHangModel = null;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idgiohang);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int idsanpham1 = resultSet.getInt("idsanpham");
                int soluong1 = resultSet.getInt("soluong");
                Double price = resultSet.getDouble("price");
                Double tongtien = resultSet.getDouble("tongtien");

                gioHangModel = new GioHangModel(idgiohang,idsanpham1,soluong1,price,tongtien);
            }
            return gioHangModel;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
