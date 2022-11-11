package model;

public class AccountModel {
    private int id;
    private String username;
    private String password;
    private int id_role;

    public AccountModel() {
    }

    public AccountModel(int id, String username, String password, int id_role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.id_role = id_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
}
