package org.example;

public class Message {
    /**
     * class for list of messages
     */
    String message;
    String phoneNumber;
    public Message (String phoneNumber, String message){
        int maxLength = 500;
        if(message.length() > maxLength){
            message = message.substring(0,maxLength);
        }
        this.message = message;
        this.phoneNumber = phoneNumber;
    }
}
