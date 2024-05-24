package com.sanclemente;

import java.util.List;

public class LoggerDecorator implements BaseDatos {
    private Logger log;
    private BaseDatos baseDatos;

    public LoggerDecorator(Logger log, BaseDatos baseDatos) {
        this.log = log;
        this.baseDatos = baseDatos;
    }
    
    @Override
    public void inserta(String registro) {
        this.log.add("inserta ".concat(registro));
        this.baseDatos.inserta(registro);
    }

    @Override
    public List<String> registros() {
        this.log.add("lectura");
        return this.baseDatos.registros();
    }
}