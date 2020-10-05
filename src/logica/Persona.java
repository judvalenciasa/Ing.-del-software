/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author 57310
 */
public class Persona {
     
    /**
     * nombre: nombre de la persona.
     */
    private String nombre;
    
    /**
     * estatura: Es la estatura de una persona esta dada en metros.
     */
    private double estatura;
    
    /**
     * peso: Es el peso de una persona dado en kilos.
     */
    private double peso;

    /**
     * Atributos provenientes de la clase Main o control
     * @param nombre
     * @param estatura
     * @param peso 
     */
    public Persona(String nombre, double estatura, double peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " IMC : " + this.obtenerIMC();
    }
    
    /**
     * Metodo que saca el indice de masa corporal de una persona.
     * @return un numero doble con el resultado del indice de masa corporal
     */
    private double obtenerIMC(){
        return (this.peso/(Math.pow(this.estatura, 2)));
    }

}
