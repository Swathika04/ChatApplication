package com.ChatApplication.Dto;
import java.time.LocalDateTime;

public class Message {
    private int messageId;
    private String message;
    private int receiverUserID;
    private int senderUserID;
    private String receiverUserName;
    private String senderUserName;
    private LocalDateTime time;

    public Message(String message, String receiverUserName, String senderUserName) {
        this.message = message;
        this.receiverUserName = receiverUserName;
        this.senderUserName = senderUserName;
    }

    public Message(int messageId, String message, int receiverUserID, int senderUserID, String receiverUserName,
                   String senderUserName, LocalDateTime time) {

        this.messageId = messageId;
        this.message = message;
        this.receiverUserID = receiverUserID;
        this.senderUserID = senderUserID;
        this.receiverUserName = receiverUserName;
        this.senderUserName = senderUserName;
        this.time=time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getReceiverUserName() {
        return receiverUserName;
    }

    public void setReceiverUserName(String receiverUserName) {
        this.receiverUserName = receiverUserName;
    }

    public String getSenderUserName() {
        return senderUserName;
    }

    public void setSenderUserName(String senderUserName) {
        this.senderUserName = senderUserName;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReceiverUserID() {
        return receiverUserID;
    }

    public void setReceiverUserID(int receiverUserID) {
        this.receiverUserID = receiverUserID;
    }

    public int getSenderUserID() {
        return senderUserID;
    }

    public void setSenderUserID(int senderUserID) {
        this.senderUserID = senderUserID;
    }

    public String toString() {
        return ("From : " + this.getSenderUserName() + "\n" + "To : " + this.getReceiverUserName() + "\n"
                + this.getMessage() + "\n" + this.getTime());
    }
}



