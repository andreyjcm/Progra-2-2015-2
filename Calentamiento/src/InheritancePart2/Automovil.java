/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InheritancePart2;

/**
 *
 * @author laboratorio
 */
public class Automovil extends Transporte{

    // Constructor con los parámetros básicos del Automóvil
    public Automovil(int velocidadMaxima, int cantidadRuedas) {
        super.setEstado(EnumEstado.DETENIDO);
        super.setVelocidadMaxima(velocidadMaxima);
        super.setCantidadRuedas(cantidadRuedas);
        
    }
    
    
    
}
