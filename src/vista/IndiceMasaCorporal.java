/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import logica.Mundo;

/**
 *
 * @author 57310
 */
public class IndiceMasaCorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mundo m = new Mundo();
        Scanner kbd = new Scanner(System.in);

//        m.crear_Persona("Sebastian Valencia", 1.60, 61);
//        m.crear_Persona("Carol Hernandez", 1.50, 50);
    
        System.out.println("PROGRAMA EN EJECUCION");
        System.out.println("Para ingresar una persona oprima la tecla (1), de lo contrario oprima (2)");
        while (true) {
            String entrada = kbd.nextLine();
            if ("1".equals(entrada)) {
                System.out.print(">ingrese el nombre: ");
                String nombre = kbd.nextLine();
                System.out.print(">>ingrese la estatura en metros: ");
                double estatura = kbd.nextDouble();
                System.out.print(">>>ingrese el peso en kilos: ");
                double peso = kbd.nextDouble();
                m.crear_Persona(nombre, estatura, peso);
                System.out.println("Para ingresar una persona oprima la tecla (1), de lo contrario oprima (2)");
            }
            if ("2".equals(entrada)) {
                m.mostrarPersonas();
                break;
            }
            
        }

    }

}
