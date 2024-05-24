package com.sanclemente;

import java.util.ArrayList;
import java.util.List;



public class Logger {
    private List<String> log = new ArrayList<>();

    public void add( String message ){
        this.log.add(message);
    }

    public List<String> obtener(){
        return this.log;
    }
}
