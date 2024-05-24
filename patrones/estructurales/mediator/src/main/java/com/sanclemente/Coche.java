package com.sanclemente;

public class Coche {
    
    private MediatorImpl mediator;
    

    public void enciende(){
        mediator.enciendeRadio();
        mediator.apagaMusica();
    }

    public void apaga(){
        mediator.apagaRadio();
    }

    public void setMediator(MediatorImpl mediator){
        this.mediator = mediator;
    }
}
