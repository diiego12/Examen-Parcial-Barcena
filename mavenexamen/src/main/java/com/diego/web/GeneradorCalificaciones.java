package com.diego.web;


import com.diego.model.Evaluacion;
import java.util.ArrayList;

public class GeneradorCalificaciones {

    public static ArrayList<Evaluacion> generarCalificaciones(){

        ArrayList<Evaluacion> lista= new ArrayList<Evaluacion>();
        
        Evaluacion ls;
        ls =new Evaluacion("Petra", (float) 5.8);
        lista.add(ls);
        
        ls =new Evaluacion("Jose", (float) 7.4);
        lista.add(ls);
        
        ls =new Evaluacion("Roberta", (float) 8.6);
        lista.add(ls);
        
          
        
    return lista;
        
    }
}
