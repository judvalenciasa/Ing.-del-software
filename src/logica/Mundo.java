/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author 57310
 */
public class Mundo {
    private LinkedList<Persona> personas= new LinkedList<>();
    
    public Mundo(){
        
    }
    
    public void crear_Persona(String nombre, double estatura, double peso){
        Persona p = new Persona(nombre, estatura, peso);
        
        this.personas.add(p);
        this.ordenarPorNombre();
    }
    
    private void ordenarPorNombre(){
        Collections.sort(personas, (x, y) -> x.getNombre().compareToIgnoreCase(y.getNombre()));
    }
    
    public void mostrarPersonas(){
        for(Persona p: personas){
            System.out.println(p);
        }
    }
    
}
