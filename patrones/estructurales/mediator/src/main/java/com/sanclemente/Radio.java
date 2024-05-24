package com.sanclemente;

public class Radio {
    
    private MediatorImpl mediator;
    private boolean encendida = false;


    public void enciende(){
        encendida = true;
       mediator.apagaMusica();
    }

    public void apaga(){
        encendida = false;
    }

    public boolean encendida(){
        return encendida;
    }

    public void setMediator(MediatorImpl mediator){
        this.mediator = mediator;
    }
}
