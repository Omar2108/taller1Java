
package com.tallerjava.taller1java;
/**
 * Representa la informacion de un cliente 
 * @author Omar Rodriguez Chamorro
 */

public class Customers {
    
    /**
     * creacion de los atributos de la clase
     */ 
    public String name;
    public String lastName;
    protected int identification;
    private int phone;
    private char direction;
    private char email;
    
    /**
     * creacion del constructor
     */
    Customers(String name, String lastName, int identification, int phone,char direction,char email ){
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.phone = phone;
        this.direction = direction;
        this.email = email;
    }
    
    /**
     * creacion de metodos
     * @param name
     * @return 
     */ 
    
    /**
     * metodo par dar el nombre de cliente
     * @param name
     * @return 
     */
    public String setName(String name){
        return this.name = name;
    }
    
    /**
     * metodo para obtener el nombre del cliente
     * @return 
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * metodo par dar los apellidos de cliente
     * @param lastName
     * @return 
     */
    public String setLastName(String lastName){
        return this.lastName = lastName;
    }
    
    /**
     * metodo para obtener los apellidos del cliente
     * @return 
     */
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     * metodo par dar el numero de cedula de cliente
     * @param identification
     * @return 
     */
    protected int setIdentification(int identification){
        return this.identification = identification;
    }
    
    /**
     * metodo para obtener el numero de cedula del cliente
     * @return 
     */
    private int getIdentification(){
        return this.identification;
    }
    
    /**
     * metodo par dar el telefono de cliente
     * @param phone
     * @return 
     */
    private int setPhone(int phone){
        return this.phone = phone;
    }
    
    /**
     * metodo para obtener el telefono del cliente
     * @return 
     */
    private int getPhone(){
        return this.phone;
    }
    
    /**
     * /metodo par dar la direccion de cliente
     * @param direction
     * @return 
     */
    private char setDirection(char direction){
        return this.direction = direction;
    }
    
    /**
     * metodo para obtener la direccion del cliente
     * @return 
     */
    private char getDirection(){
        return this.direction;
    }
    
    /**
     * metodo par dar el email de cliente
     * @param email
     * @return 
     */
    private char setEmail(char email){
        return this.email = email;
    }
    
    /**
     * metodo para obtener el email del cliente
     * @return 
     */
    private char getEmail(){
        return this.email;
    }

    
    
    
}
