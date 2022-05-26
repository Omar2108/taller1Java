
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
     */
    
    Fruta(String name,float averageWeigth,ArrayList<String> colors){
        this.name = name;
        this.averageWeigth = averageWeigth;
        this.colors = colors;
    }
    
    /**
     * Creacion de metodos 
     * @param name
     * @return 
     */
    
    public String setColor(String name){
        return this.name = name; 
    }
    
    public ArrayList<String> getColors(){
        return this.colors;
    }
    
}
