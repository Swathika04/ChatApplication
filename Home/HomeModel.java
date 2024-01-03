package com.ChatApplication.Home;
import java.util.List;

import com.ChatApplication.Dto.Message;
import com.ChatApplication.Dto.User;
import com.ChatApplication.Repository.ChatRepo;

public class HomeModel {
    private HomeController HomeController ;



    public HomeModel(com.ChatApplication.Home.HomeController homeController) {
        this.HomeController= homeController;
    }

    public List<Message> getReceivedMessage(User user) {
        List<Message> receivedMessages =ChatRepo.getInstance().getReceivedMessage(user);
        return receivedMessages;
    }

    public List<Message> getSentMessage(User user) {
        List<Message> sentMessages =ChatRepo.getInstance().getSentMessage(user);
        return sentMessages;
    }

    public boolean updateNewMessage(Message newMessage) {
        return ChatRepo.getInstance().updateNewMessage(newMessage);

    }

    public boolean validateSender(String receiverUserName) {
        return ChatRepo.getInstance().checkValidReceiver(receiverUserName);

    }
}


