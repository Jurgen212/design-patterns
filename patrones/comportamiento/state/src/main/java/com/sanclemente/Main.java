package com.sanclemente;

import com.sanclemente.models.user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        
        System.out.println(user.onActive());
        System.out.println(user.onDisable());
        System.out.println(user.onLock());
        System.out.println(user.onBuy());

    }
}