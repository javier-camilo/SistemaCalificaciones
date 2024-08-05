
package clases;

import java.io.Serializable;

public class UsuarioDocente extends UsuarioAdministrativo implements Serializable{
    
   public UsuarioDocente(String identidad,String user,String password){
        this.setIdentidad(identidad);
        this.setUser(user);
        this.setPassword(password);
    }
   
   public UsuarioDocente(){
       
   }
   
}
