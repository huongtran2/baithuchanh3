package dao;

import model.AccountModel;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
    public static boolean register(AccountModel accountModel){
        try {
            String sql = "insert into account value (?,?,?,?)";
            Connection connection = ConnectMySql.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, accountModel.getId());
            preparedStatement.setString(2, accountModel.getUsername());
            preparedStatement.setString(3, accountModel.getPassword());
            preparedStatement.setInt(4, accountModel.getId_role());
            preparedStatement.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }

}
