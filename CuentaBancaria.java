
package com.tallerjava.taller1java;
/**
 *representa lainformacion y estado de una cuenta bancaria
 * @author Omar Rodriguez Chamorro
 */

public class CuentaBancaria {
    
    /**
     * creacion de atributos de la clase
     */
    private int accountNumber;
    protected boolean activated; 
    
    /**
     * creacion del constructor 
     */
    
    CuentaBancaria(int accountNumber, boolean activated){
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    
    /**
     * creacion de metodos 
     * @param activated
     * @return 
     */
    
    public boolean setActivated(boolean activated){
        return this.activated = activated;
    }
    
    public boolean getActivated(){
        return this.activated;
    }
    
}
