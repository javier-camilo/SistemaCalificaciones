
package clases;

import java.io.Serializable;

public class Docente extends Persona implements Serializable{
    
    private String asignatura;
    
    public Docente(){
        
    }
    
    public Docente(String codigo,String nombre,String apellido, String Telefono, String edad, String asignatura){
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTelefono(Telefono);
        this.setEdad(edad);
        this.asignatura=asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
