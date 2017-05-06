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
public class Manejador4_Gerentes extends Manejador{

    @Override
    public void manejadorRequest(String cargo, String nombre) {
        if(cargo.equals("gerente")){
            System.out.println("Generando el cheque por $4.200.000 para el gerente"+" "+nombre);
        }
        else{
            successor.manejadorRequest(cargo, nombre);
        }
    }
    
}
