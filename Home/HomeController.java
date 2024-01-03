package com.ChatApplication.Home;
import java.util.List;

import com.ChatApplication.Dto.Message;
import com.ChatApplication.Dto.User;
import com.ChatApplication.Login.LoginView;

public class HomeController {
    private HomeView homeView;
    private HomeModel homeModel;



    public HomeController(HomeView homeView) {
        this.homeView=homeView;
        homeModel=new HomeModel(this);
    }



    public void processOption(int option, User user) {
        switch (option) {
            case 1: {
                List<Message> receivedMessages = homeModel.getReceivedMessage(user);
                homeView.printMessage(receivedMessages);
                homeView.index();
                break;
            }
            case 2: {
                List<Message> sentMessages = homeModel.getSentMessage(user);
                homeView.printMessage(sentMessages);
                homeView.index();
                break;
            }
            case 3:{
                Message newMessage = homeView.getNewMessage();
                boolean isValidReceiver =homeModel.validateSender(newMessage.getReceiverUserName());
                if(isValidReceiver) {
                    homeModel.updateNewMessage(newMessage);
                    homeView.notify("message sent successfully");
                }else {
                    homeView.notify("There is some error.try again");
                }
                homeView.index();
                break;
            }
            case 4:{
                LoginView loginView = new LoginView();
                loginView.create();
            }
        }

    }

}


