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
public class Manejador2_Asesores extends Manejador{

    @Override
    public void manejadorRequest(String cargo, String nombre) {
        
        if(cargo.equals("asesor")){
            System.out.println("Generando el cheque por $2.750.000 para el asesor"+" "+nombre);
        }
        else{
            successor.manejadorRequest(cargo, nombre);
        }
    }
    
}
