package models;

import java.sql.Timestamp;

public class User {
    private int user_id;
    private String full_name;
    private String email;
    private String password;
    private Timestamp creates_at;
    private Timestamp last_login;

    public User() {
    }

    public User(String fullname, String email, String password) {
        this.full_name = fullname;
        this.email = email;
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreates_at() {
        return creates_at;
    }

    public void setCreates_at(Timestamp creates_at) {
        this.creates_at = creates_at;
    }

    public Timestamp getLast_login() {
        return last_login;
    }

    public void setLast_login(Timestamp last_login) {
        this.last_login = last_login;
    }
}
