
package clases;

import java.io.Serializable;


public class UsuarioAdministrativo implements Serializable{
    
    private String identidad;
    private String user;
    private String password;
    
    
    //por defecto
    public UsuarioAdministrativo(){
        
    }
    
    //constructor para enviar datos rapido
     public UsuarioAdministrativo(String identidad,String user,String password){
         
        this.identidad=identidad;
        this.user=user;
        this.password=password;
        
    }
     
    //encapsulación 
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getIdentidad() {
        return identidad;
    }
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }
    
}
