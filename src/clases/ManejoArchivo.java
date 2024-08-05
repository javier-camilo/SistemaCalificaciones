
package clases;

import java.io.*;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class ManejoArchivo {
    
    //manejo de datos del estudiante en archivo 
    
    public void agregarEstudianteListado(ArrayList<Estudiante> listaEstudiante,String nombre){
        
        ObjectOutputStream escritor=null;
        
            try {
                  File archivo= new File(nombre);
                  //crear un archivo si no existe
                      if(!(archivo.exists())){
                          try {
                              archivo.createNewFile();
                              JOptionPane.showMessageDialog(null,"el archivo no existe, se creara uno");
                          } catch (IOException e) {
                          }
                      }
                      
                  //escritura del archivo
                  
                  FileOutputStream file=new FileOutputStream(archivo);
                  escritor= new ObjectOutputStream(file);
                  escritor.writeObject(listaEstudiante);
                  
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "error al guardar el registro");
        }finally{
                try {
                    if(escritor!=null){
                        escritor.close();
                    }
                } catch (IOException error) {
                    JOptionPane.showMessageDialog(null, "el archivo no se ccerro correctamente");
                }
            }  

        
}
    
    public ArrayList<Estudiante> verListaEstudiantes(String nombre){
        //lectura 
        
        ObjectInputStream lector=null;
        ArrayList<Estudiante> listadoEstudiante=new ArrayList<>();
        File archivo;
        
        try {
            //lectura del archivo binario 
            
            archivo=new File(nombre);
            FileInputStream file=new FileInputStream(archivo);
            lector=new ObjectInputStream(file);
            
            //obtencion del listado 
            
            listadoEstudiante=(ArrayList<Estudiante>) lector.readObject();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error al cargar datos");
        }finally{
            if(lector!=null){
                    try{
                        lector.close();
                    }catch(IOException error){
                        JOptionPane.showMessageDialog(null, "error al cerrar el archivo");
                    }
            }
        }
        
        return listadoEstudiante;
    }
    
    //**********************************************************************************//
    
    //manejo de datos Docente
    
    public void agregarDocentesListado(ArrayList<Docente> listaDocente, String nombre){
        ObjectOutputStream escritor=null;
        try {
            
            File archivo=new File(nombre);
            
            //comprobar si existe
            if (!(archivo.exists())) {
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "El archivo no existe, se crara uno nuevo");
            }
                escritor=new ObjectOutputStream(new FileOutputStream(archivo));
                escritor.writeObject(listaDocente);
        } catch (IOException e) {  
            JOptionPane.showMessageDialog(null, "Error al guardar registro");
        }finally{
            if(escritor!=null){
                try {
                    escritor.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"Error al cerrar el archivo");
                }
            }
        }
    }
    public ArrayList<Docente> verListadoDocente(String nombre){
        ObjectInputStream lector=null;
        ArrayList<Docente> listaDocente=new ArrayList<>();
        File archivo;
        
        try {     
            archivo=new File(nombre);
            lector=new ObjectInputStream(new FileInputStream(archivo)); 
            listaDocente=(ArrayList<Docente>) lector.readObject();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");
        }finally{
            if(lector!=null){
                try {
                    lector.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar el archivo");
                }
            }
        }
        
        return listaDocente;
    }
    
    
    //**********************************************************************************//
    
    //manejo de ususarios Administrativos
    
    public void agregarUsuario(ArrayList<UsuarioAdministrativo> listaAdministrativo, String nombreArchivo){
        
        ObjectOutputStream escritor=null;
        
        try {
            
            File archivo=new File(nombreArchivo);
            //si no existe se crea
            if(!(archivo.exists())){
               JOptionPane.showMessageDialog(null,"el archivo no existe se creara uno");
               archivo.createNewFile();
            }
            
            //objetos para crear el archivo
            
            FileOutputStream file=new FileOutputStream(archivo);
            escritor= new ObjectOutputStream(file);
            escritor.writeObject(listaAdministrativo);
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"error al guardar usuario");
        }
        
        //cierre del archivo
        
        if(escritor!=null){
            try {
                escritor.close();
            } catch (IOException error) {
                JOptionPane.showMessageDialog(null, "error al cerrar el archivo");
            } 
        }
        
    }
    
    //************************************************************************************//
    
    //manejo de usuario docentes 
    
        public void agregarUsuarioDocente(ArrayList<UsuarioDocente> listaAdministrativo, String nombreArchivo){
        
        ObjectOutputStream escritor=null;
        
        try {
            
            File archivo=new File(nombreArchivo);
            //si no existe se crea
            if(!(archivo.exists())){
               JOptionPane.showMessageDialog(null,"el archivo no existe se creara uno");
               archivo.createNewFile();
            }
            
            //objetos para crear el archivo
            
            FileOutputStream file=new FileOutputStream(archivo);
            escritor= new ObjectOutputStream(file);
            escritor.writeObject(listaAdministrativo);
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"error al guardar usuario");
        }
        
        //cierre del archivo
        
        if(escritor!=null){
            try {
                escritor.close();
            } catch (IOException error) {
                JOptionPane.showMessageDialog(null, "error al cerrar el archivo");
            } 
        }
        
    }
    
     
    //consultas de usuarios//
    
    //ver ususarios administradores
    public ArrayList<UsuarioAdministrativo> verUsuariosAdministrativos(String nombreArchivo){
       ObjectInputStream lector=null;
       ArrayList<UsuarioAdministrativo> listadoUsuarios= new ArrayList<>();
       File archivo;
       
        try {
            
            archivo=new File(nombreArchivo);
            FileInputStream file=new FileInputStream(archivo);
            lector=new ObjectInputStream(file);
            listadoUsuarios=(ArrayList<UsuarioAdministrativo>) lector.readObject();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al cargar datos");
        }finally{
            try {
                if(!(lector!=null)){
                    lector.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error al cerrar el archivo");
            }
        }
        return listadoUsuarios;
    }
    
    //ver ususario Docente
    
    public ArrayList<UsuarioDocente> verUsuariosDocentes(String nombre){
        
        ObjectInputStream lector=null;
        ArrayList<UsuarioDocente> verListadoUsuarios= new ArrayList<>();
        File archivo;
        try {
            archivo=new File(nombre);
            lector=new ObjectInputStream(new FileInputStream(archivo));
            verListadoUsuarios=(ArrayList<UsuarioDocente>)lector.readObject();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");
        }finally{
            if(lector!=null){
                try {
                    lector.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar el archivo");
                }
            }
        }
        return verListadoUsuarios;
    }
    
    
    /************************************************/
    
    //guardar ususario temporal
    
    public void usuarioTemporal(String codigo,String nombreArchivo){
        ObjectOutputStream escritor=null;
        
         try {
            File archivo=new File(nombreArchivo);
            if(!(archivo.exists())){
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null, "el archivo no existe se creara uno nuevo");
            }
            escritor=new ObjectOutputStream(new FileOutputStream(archivo));
            escritor.writeBytes(codigo);
           
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "error al guardar usuario");
        }finally{
             if(escritor!=null){
                 try {
                     escritor.close();
                 } catch (IOException e) {
                     JOptionPane.showMessageDialog(null, "Error al cerrar el archivo");
                 }
 
             }
         }
        
    }
    
    //consultar usuario temporal
    public String consultarUsuarioTemporal(String nombreArchivo){
       
        ObjectInputStream lector=null;
        String codigo="";
        try {
            File archivo=new File(nombreArchivo);
            lector=new ObjectInputStream(new FileInputStream(archivo));
            codigo=(String) lector.readLine();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");
        }finally{
          if (lector!=null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar el archivo");
                }
            }
        }
        
        return codigo;
    }
    
    }

   




       
        
       
 


