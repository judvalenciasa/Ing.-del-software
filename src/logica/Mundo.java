/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Collections;
import java.util.LinkedList;

/**
 * La clase mundo conoce todas las personas.
 * @author 57310
 */
public class Mundo {
    /**
     * Atributo de tipo lista donde se guardan las personas.
     */
    private LinkedList<Persona> personas= new LinkedList<>();
    
    /**
     * Constructor por defecto
     */
    public Mundo(){
    }
    
    /**
     * Estos atributos se reciben de la clase persona
     * @param nombre
     * @param estatura
     * @param peso 
     */
    public void crearPersona(String nombre, double estatura, double peso){
        Persona p = new Persona(nombre, estatura, peso);
        this.getPersonas().add(p);
        this.ordenarPorNombre();
    }
    
    /**
     * Metodo para ordenar el LinkedList personas, cada vez que ingresan una persona
     */
    private void ordenarPorNombre(){
        Collections.sort(getPersonas(), (x, y) -> x.getNombre().compareToIgnoreCase(y.getNombre()));
    }
    
    /**
     * muestra las personas que hay actualmente en la LinkedList:Personas
     */
    public void mostrarPersonas(){
        for(Persona p: getPersonas()){
            System.out.println(p);
        }
    }

    /**
     * @return the personas
     */
    public LinkedList<Persona> getPersonas() {
        return personas;
    }
    
}
