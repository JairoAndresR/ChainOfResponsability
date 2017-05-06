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
public class ManejadorDefault extends Manejador{

    @Override
    public void manejadorRequest(String cargo, String nombre) {
        System.out.println("No existe departamento para el cargo "+cargo);
    }
    
    
}
