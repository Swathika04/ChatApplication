package com.ChatApplication.Home;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.ChatApplication.Dto.User;
import com.ChatApplication.Dto.Message;


public class HomeView {
    private HomeController homecontroller;
    Scanner scanner = new Scanner(System.in);
    private User user;

    public HomeView() {
        homecontroller=new HomeController(this);
    }



    public void create(User user) {
        this.user = user;
        index();

    }

    void index() {
        int maxAttempts = 3;
        int attempts = 0;
        boolean success = false;

        while (attempts < maxAttempts && !success) {
            try {
                System.out.println("Welcome to home page");
                System.out.println("------------------------");
                System.out.println("1)Inbox");
                System.out.println("2)Outbox");
                System.out.println("3)New Message");
                System.out.println("4)Login page");
                System.out.println("Enter the option");
                int option = scanner.nextInt();
                scanner.nextLine();
                homecontroller.processOption(option,user);
                success = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter correct option");
                scanner.nextLine();
                attempts++;
            }
        }

        if (!success) {
            System.out.println("Too many attempts. Exiting...");
        }
    }


    public void printMessage(List<Message> messages) {
        for(Message message : messages) {
            System.out.println(message);
        }

    }

    public Message getNewMessage() {
        System.out.println("New message page------------------------");
        System.out.println("Enter receiver UserName: ");
        String receiverUserName = scanner.nextLine();
        System.out.println("Enter the message");
        String message = scanner.nextLine();
        return new Message(message,receiverUserName,user.getUserName());

    }

    public void notify(String notificationMessage) {

        System.out.println(notificationMessage);
    }

}

