package com.example.mrides.Domain;

import java.util.HashMap;

public class Notification {

    private User sender;
    private String type;
    private HashMap <User, String> notificationHash;

    public Notification() {
        notificationHash = new HashMap<>();
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
