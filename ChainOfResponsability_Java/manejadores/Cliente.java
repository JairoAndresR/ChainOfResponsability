/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class Cliente {
            
    public static void main(String[] args) {
        
        String nombre, cargo;
        
        Scanner sc = new Scanner(System.in);
        
        Manejador manejadores[]=new Manejador[5];
        manejadores[4]=new ManejadorDefault();
        manejadores[3]=new Manejador4_Gerentes();
        manejadores[2]=new Manejador3_Supervisores();
        manejadores[1]=new Manejador2_Asesores();
        manejadores[0]=new Manejador1_Cajeros();
        
        for(int i=0; i<manejadores.length-1;i++){
            manejadores[i].setSuccessor(manejadores[i+1]); ;
        }
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre =  sc.nextLine();
        System.out.println("Ingrese el cargo del empleado: ");
        cargo =  sc.nextLine();
        
        manejadores[0].manejadorRequest(cargo,nombre);
    }
}
