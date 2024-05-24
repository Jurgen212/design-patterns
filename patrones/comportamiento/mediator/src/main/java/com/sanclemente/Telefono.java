package com.sanclemente;

public class Telefono {
    
    private MediatorImpl mediator;
    private boolean musicaOn = false;

    public void setRadio( Radio radio ){
    }

    public void recibeLlamada(){
        mediator.apagaRadio();
    }

    public void enciendeMusica(){
        musicaOn = true;
    }

    public void apagaMusica(){
        musicaOn = false;
    }

    public boolean musicaEncendida(){
        return musicaOn;
    }

    public void setMediator(MediatorImpl mediator){
        this.mediator = mediator;
    }
}
