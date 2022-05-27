
package com.tallerjava.taller1java;

import java.util.ArrayList;
/**
 * Representa de un objeto de tipo fruta
 * @author Omar Rodriguez Chamorro
 */

public class Fruta {
    
    /**
     * Definicion de atributos
     */
    public String name;
    private float averageWeigth;
    public ArrayList<String> colors;
    
    /**
     * Creacion del constructor de la clase 
     * @param name
     * @param averageWeigth
     */
    
    public Fruta(String name, float averageWeigth){
        this.name = name;
        this.averageWeigth = averageWeigth;
    }

    Fruta(String name, float averageWeigth, ArrayList<String> colors) {
        this.name = name;
        this.averageWeigth = averageWeigth;
        this.colors = new ArrayList();
    }
    
    /**
     * Creacion de metodos set y get 
     * @param name
     * @return 
     */
    
    public boolean setColor(String name){
        
        return this.colors.add(name); 
    }
    
    public ArrayList<String> getColors(){
        return this.colors;
    }
    
}
