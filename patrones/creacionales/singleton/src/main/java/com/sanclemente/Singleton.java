package com.sanclemente;

public class Singleton {

    private static final Singleton INSTANCE_SINGLETON = new Singleton();

    public Singleton(){

    }

    public static Singleton getInstance(){
        return INSTANCE_SINGLETON;
    }

    public void consolePrint( String texto ){
        System.out.println( texto );
    }
}
