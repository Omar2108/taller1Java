
package com.tallerjava.taller1java;

import java.util.Date;
/**
 * Representa la infromacion de una persona
 * @author Omar Rodriguez Chamorro
 */

public class Persona {
    
    /**
     * Definicion de los atributos de la clase persona
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    
    /**
     * Creacion del constructor de la clase persona
     */
    Persona(String name,String lastName1,String lastName2,Date dateBirth,float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }
    
    /**
     * metodo para dar el nombre de la persona 
     * @param name
     * @return 
     */
    
    public String setName(String name){   
        return this.name = name;
    }
    
    /**
     * metodo para obtener el nombre de la persona 
     * @return 
     */
    
    public String getName(){   
        return this.name;
    }
    
    /**
     * metodo para dar el primer apellido de la persona
     * @param lastName1
     * @return 
     */
    
    public String setLastName1(String lastName1){   
        return this.lastName1 = lastName1;
    }
    
    /**
     * metodo para obtener el primer apellido de la persona
     * @return 
     */
    
    public String getLastName1(){   
        return this.lastName1;
    }
    
     /**
      * metodo para dar el segundo apellido de la persona
      * @param lastName2
      * @return 
      */
    
    public String setLastName2(String lastName2){   
        return this.lastName1 = lastName2;
    }
    
    /**
     * metodo para obtener el segundo apellido de la persona
     * @return 
     */
    
    public String getLastName2(){   
        return this.lastName2;
    }
    
    /**
     * metodo para dar la fecha de nacimiento de la persona
     * @param dataBirth
     * @return 
     */ 
    
    public Date setDatebirth(Date dataBirth){   
        return this.dateBirth = dataBirth;
    }
    
    /**
     * metodo para obtener la fecha de nacimiento de la persona
     * @return 
     */
    
    public Date getDatebirth(){   
        return this.dateBirth;
    }
    
   /**
    * metodo para dar la altura de la persona
    * @param height
    * @return 
    */ 
    
    public float setHeight(float height){   
        return this.height = height;
    }
    
    /**
     * metodo para obtener la altura de la persona
     * @return 
     */
    
    public float getHeight(){   
        return this.height;
    }
    
    
}
