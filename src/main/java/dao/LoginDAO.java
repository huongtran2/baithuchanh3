package dao;

import model.AccountModel;

import java.sql.*;

public class LoginDAO {

    public static AccountModel login(String username, String password) {
        try {
            String sql = "select * from account where username = ? and password = ?";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            AccountModel accountModel = null;
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username1 = resultSet.getString("username");
                String password1 = resultSet.getString("password");
                int id_role = resultSet.getInt("id_role");
                accountModel = new AccountModel(id, username1, password1, id_role);
            }
            return accountModel;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }
}
