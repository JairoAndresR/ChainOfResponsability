/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadores;

/**
 *
 * @author estudiantes
 */
public class Manejador3_Supervisores extends Manejador{

    @Override
    public void manejadorRequest(String cargo, String nombre) {
        if(cargo.equals("supervisor")){
            System.out.println("Generando el cheque por $3.000.000 para el supervisor"+" "+nombre);
        }
        else{
            successor.manejadorRequest(cargo, nombre);
        }
    }
    
}
