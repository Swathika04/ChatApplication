package com.ChatApplication.Login;
import com.ChatApplication.Dto.User;
import com.ChatApplication.Repository.ChatRepo;

public class LoginModel {
    private LoginController loginController;

    public LoginModel(LoginController loginController) {
        this.loginController = loginController;
    }


    public User checkCredentials(String userName, String password) {

        User user = ChatRepo.getInstance().checkValidUser(userName,password);
        if (user !=null) {
            loginController.loginSuccess(user);
        } else {
            loginController.loginFailiure("\nInvalid Credentials. Please try again!\n");
        }
        return null;

    }
}


