package com.sanclemente;

public class Main {
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance();
        singleton.consolePrint("Singleton funcionando");
    }
}