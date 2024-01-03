package com.ChatApplication.Login;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.ChatApplication.Dto.User;
import com.ChatApplication.Home.HomeView;

public class LoginView {
    private LoginController loginController;
    private Scanner scanner = new Scanner(System.in);

    public LoginView() {
        loginController = new LoginController(this);
    }

    static public void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.create();
    }

    public void create() {
        checkForLogin();
    }

    private void checkForLogin() {
        System.out.println("Welcome to chat application\n ------------------------");
        try {
            System.out.println("Enter User Name");
            String userName = scanner.next();
            System.out.println("Enter password");
            String password = scanner.next();
            loginController.checkCredentials(userName, password);
        }catch(InputMismatchException e)
        {
            checkForLogin();
        }


    }

    public void loginSuccess(User user) {
        System.out.println("\n-->Hello " + user.getUserName() + "<--\n");
        HomeView homeView = new HomeView();
        homeView.create(user);
    }

    public void loginFailed(String errorMessage) {
        System.out.println(errorMessage);
        checkForLogin();
    }

}


