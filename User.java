
package com.tallerjava.taller1java;
/**
 * Representa la informacion de un usuario 
 * @author Omar Rodriguez Chamorro
 */

public class User {
    
    /**
     * creacion de los atributos de la clase 
     */
    public String name;
    public int phone;
    public char email;
    public char direction;
    private char user;
    protected char password;
    
    /**
     * creacion del constructor de la clase
     */
    User(String name,int phone,char email,char direction,char user,char password){
        this.name = name;
        this.phone = phone;
        this.direction = direction;
        this.email = email;
        this.user = user;
        this.password = password;
    }
    
    /**
     * creacion de metodo 
     * @param name
     * @return 
     */
    
    /**
     * metodo para dar el nombre del usuario
     * @param name
     * @return 
     */
    public String setName(String name){
        return this.name = name;
    }
    
    /**
     * metodo para obtener el nombre del usuario
     * @return 
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * metodo para dar el telefono del usuario
     * @param phone
     * @return 
     */
    public int setPhone(int phone){
        return this.phone= phone;
    }
    
    /**
     * metodo para obtener el telefono del usuario
     * @return 
     */
    public int getPhone(){
        return this.phone;
    }
    
    /**
     * metodo para dar la direccion del usuario
     * @param direction
     * @return 
     */
    public char setDirection(char direction){
        return this.direction = direction;
    }
    
    /**
     * metodo para obtener la direccion del usuario
     * @return 
     */
    public char getDirection(){
        return this.direction;
    }
    
    /**
     * metodo para dar el email del usuario
     * @param email
     * @return 
     */
    public char setEmail(char email){
        return this.email = email;
    }
    
    /**
     * metodo para obtener el email del usuario
     * @return 
     */
    public char getEmail(){
        return this.email;
    }
    
    /**
     * metodo para dar el usuario del usuario
     * @param user
     * @return 
     */
    private char setUser(char user){
        return this.user = user;
    }
    
    /**
     * metodo para obtener el usuario del usuario
     * @return 
     */
    private char getUser(){
        return this.user;
    }
    
    /**
     * metodo para dar la contraseña del usuario
     * @param password
     * @return 
     */
    protected char setPassword(char password){
        return this.password = password;
    }
    
    /**
     * metodo para obtener la contraseña del usuario
     * @return 
     */
    protected char getPassword(){
        return this.password;
    }
}
