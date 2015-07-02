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
public abstract class Transporte {
    
    protected EnumEstado estado;

    public void setEstado(EnumEstado estado) {
        this.estado = estado;
    }

    public EnumEstado getEstado() {
        return estado;
    }
    
    protected double distanciaRecorrida = 0;

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
    
    public void Avanzar ()
    {
        distanciaRecorrida += 1.0;
    }
    
    protected int velocidadMaxima;

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima > 0)
        {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }
    
    protected int cantidadRuedas;

    public void setCantidadRuedas(int cantidadRuedas) {
        if (cantidadRuedas > 0)
        {
            this.cantidadRuedas = cantidadRuedas;
        }
    }
    
    protected int pasajeros;
    
    protected int alturaMaxima;

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }
    
    protected int alturaMinima;

    public int getPasajeros() {
        return pasajeros;
    }
    
            
}
