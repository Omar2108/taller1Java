
package com.tallerjava.taller1java;
/**
 * Representa la infromacion relacionada con una motocicleta
 * @author Omar Rodriguez Chamorro
 */

public class Motorcycle {
    
    /**
     * creacion de atributos 
     */
    public String colour;
    public String mark;
    private int cylinderCapacity;
    protected String fuelType;
    
    /**
     * creacion del constructor de la clase
     */
    Motorcycle(String colour,String mark,int cylinderCapacity,String fuelType){
        this.colour = colour;
        this.mark = mark;
        this.cylinderCapacity = cylinderCapacity;
        this.fuelType = fuelType;
    }
    
    /**
     * creacion de los metodos
     * @param colour
     * @return 
     */
    
    /**
     * metodo para dar el color de la moto
     */
    public String setColour( String colour){
        return this.colour = colour;
    }
    
    /**
     * metodo para obtener el color de la moto
     * @return 
     */
    public String getColour(){
        return this.colour;
    }
    
    /**
     * metodo para dar la marca de la moto
     * @param mark
     * @return 
     */
    public String setMark( String mark){
        return this.mark = mark;
    }
    
    /**
     * metodo para obtener la marca de la moto
     * @return 
     */
    public String getMark(){
        return this.mark;
    }
    
    /**
     * metodo para dar el cilindraje de la moto
     * @param cylinderCapacity
     * @return 
     */
    public int setCylinderCapacity( int cylinderCapacity){
        return this.cylinderCapacity = cylinderCapacity;
    }
    
    /**
     * metodo para obtener el cilindraje de la moto
     * @return 
     */
    public int getCylinderCapacity(){
        return this.cylinderCapacity;
    }
    
     /**
      * metodo para dar el tipo de combustible de la moto
      * @param fuelType
      * @return 
      */
    public String setFuelType( String fuelType){
        return this.fuelType = fuelType;
    }
    
    /**
     * metodo para obtener el tipo de combustible de la moto
     * @return 
     */
    public String getFuelType(){
        return this.fuelType;
    }
    
}
