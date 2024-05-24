package com.sanclemente;

public class MediatorImpl implements Mediator{

    private Coche coche;
    private Radio radio;
    private Telefono telefono;

    public MediatorImpl( Coche coche, Radio radio, Telefono telefono){
        this.coche = coche;
        this.radio = radio;
        this.telefono = telefono;

        this.coche.setMediator(this); 
        this.radio.setMediator(this);
        this.telefono.setMediator(this);   
    }



    @Override
    public void recibeLlamada() {
       telefono.recibeLlamada();
    }

    @Override
    public void enciendeMusica() {
        telefono.enciendeMusica();
    }

    @Override
    public void apagaMusica() {
        telefono.apagaMusica();
    }



    @Override
    public void enciendeRadio() {
        radio.enciende();
    }



    @Override
    public void apagaRadio() {
        radio.apaga();
    }




}
