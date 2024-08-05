
package clases;

import java.io.Serializable;


public class Estudiante extends Persona implements Serializable {

    private double[] notaIngles=new double[3];private double definitivaIngles;
    private double[] notaEspañol=new double[3];private double definitivaEspañol;
    private double[] notaSociales=new double[3];private double definitivaSociales;
    private double[] notaMatematicas=new double[3];private double definitivaMatematicas;
    private double[] notaEducacionFisica=new double[3];private double definitivaFisica;
    private double[] notaReligion=new double[3];private double definitivaReligion;
    



    public Estudiante(){
    
    }
    
    public Estudiante(String codigo,String nombre, String apellido,String telefono, String edad){
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTelefono(telefono);
        this.setEdad(edad);
    }


    public double[] getNotaIngles() {
        return notaIngles;
    }


    public void setNotaIngles(double[] notaIngles) {
        this.notaIngles = notaIngles;
    }

 
    public double getDefinitivaIngles() {
        return definitivaIngles;
    }


    public void setDefinitivaIngles(double definitivaIngles) {
        this.definitivaIngles = definitivaIngles;
    }

    public double[] getNotaEspañol() {
        return notaEspañol;
    }

    public void setNotaEspañol(double[] notaEspañol) {
        this.notaEspañol = notaEspañol;
    }

    public double getDefinitivaEspañol() {
        return definitivaEspañol;
    }


    public void setDefinitivaEspañol(double definitivaEspañol) {
        this.definitivaEspañol = definitivaEspañol;
    }


    public double[] getNotaSociales() {
        return notaSociales;
    }


    public void setNotaSociales(double[] notaSociales) {
        this.notaSociales = notaSociales;
    }

    public double getDefinitivaSociales() {
        return definitivaSociales;
    }

    public void setDefinitivaSociales(double definitivaSociales) {
        this.definitivaSociales = definitivaSociales;
    }


    public double[] getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double[] notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }


    public double getDefinitivaMatematicas() {
        return definitivaMatematicas;
    }

 
    public void setDefinitivaMatematicas(double definitivaMatematicas) {
        this.definitivaMatematicas = definitivaMatematicas;
    }


    public double[] getNotaEducacionFisica() {
        return notaEducacionFisica;
    }

 
    public void setNotaEducacionFisica(double[] notaEducacionFisica) {
        this.notaEducacionFisica = notaEducacionFisica;
    }


    public double getDefinitivaFisica() {
        return definitivaFisica;
    }

    public void setDefinitivaFisica(double definitivaFisica) {
        this.definitivaFisica = definitivaFisica;
    }

 
    public double[] getNotaReligion() {
        return notaReligion;
    }

 
    public void setNotaReligion(double[] notaReligion) {
        this.notaReligion = notaReligion;
    }


    public double getDefinitivaReligion() {
        return definitivaReligion;
    }


    public void setDefinitivaReligion(double definitivaReligion) {
        this.definitivaReligion = definitivaReligion;
    }

  
}
