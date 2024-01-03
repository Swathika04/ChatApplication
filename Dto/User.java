package com.ChatApplication.Dto;
public class User {
    private int userId;
    private String userName;
    private String password;
    private String firstname;
    private String email;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String userName, String password, String firstname, String email) {

        this.userName = userName;
        this.password = password;
        this.firstname = firstname;
        this.email = email;
    }

    public User(int userId, String userName, String password, String firstname, String email) {

        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.firstname = firstname;
        this.email = email;
    }

}
