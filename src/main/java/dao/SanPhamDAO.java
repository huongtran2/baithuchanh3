package dao;

import model.SanPhamModel;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class SanPhamDAO {
    static Connection connection = ConnectMySql.getConnection();
//  hàm lấy tất cả của list san pham model;
    public static List<SanPhamModel> getAll() {
        String sql = "Select * from SanPham";
        List<SanPhamModel> sanPhamModels = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int idsanpham = resultSet.getInt("idsanpham");
                String namesanpham = resultSet.getString("namesanpham");
                Double price = resultSet.getDouble("price");
                sanPhamModels.add(new SanPhamModel(idsanpham,namesanpham,price));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sanPhamModels;
    }

    // hàm luu san phẩm vào database (create)
    public static void save(SanPhamModel sanPhamModel) {
        try {
            String sql = "INSERT INTO `thuchanh_md3`.`SanPham` (idsanpham,namesanpham,price) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,sanPhamModel.getIdsanpham());
            preparedStatement.setString(2,sanPhamModel.getNamesanpham());
            preparedStatement.setDouble(3,sanPhamModel.getPrice());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
 // hàm xóa sanpham ở database;(xóa)
    public static void delete(int idsanpham) {
        String sql = "delete from SanPham where idsanpham = '" + idsanpham + "'";
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // tìm kiếm sản phẩm theo ID (sửa)
    public static SanPhamModel getById(int idsanpham) {
        String sql = "select * from SanPham where idsanpham = ?";
        SanPhamModel sanPhamModel = null;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idsanpham);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int idsanpham1 = resultSet.getInt("idsanpham");
                String namesanpham = resultSet.getString("namesanpham");
                Double price = resultSet.getDouble("price");

                sanPhamModel = new SanPhamModel(idsanpham1,namesanpham,price);
            }
            return sanPhamModel;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
