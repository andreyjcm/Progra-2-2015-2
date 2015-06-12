/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;


public class Triangulo implements ITriangulo {
    
    private int cantidadLadosTriangulo = 3;
    private double[] MedidasLados;
    
    public Triangulo (double lado1, double lado2, double lado3)
    {
        MedidasLados [0] = lado1;
        MedidasLados [1] = lado2;
        MedidasLados [2] = lado3;
    }
    
    @Override
    public double[] ObtenerMedidas ()
    {
        return MedidasLados;
    }

    @Override
    public double altura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantidadLados() {
        return (cantidadLadosTriangulo);
    }

    @Override
    public double Area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Volumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
