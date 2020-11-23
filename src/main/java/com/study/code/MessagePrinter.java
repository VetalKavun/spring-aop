package com.study.code;

public class MessagePrinter {
    private final Message message;

    public MessagePrinter(Message message){
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message.getMessage());
    }
}
