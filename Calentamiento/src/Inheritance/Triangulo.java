/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;


public class Triangulo extends Poligono {
    private final int cantidadLadosTriangulo = 3;
    
    private double semiperimeter = 0;
    
     private double getSemiperimeter ()
    {
        return this.semiperimeter;
    }
    
    private void setSemiperimeter ()
    {
        this.semiperimeter = super.getPerimetro() / 2.0;
    }
    
    private void CrearTriangulo (double [] Lados)
    {
        super.CrearPoligono(cantidadLadosTriangulo, Lados);
        setSemiperimeter();
        setArea();
   }
    
    public Triangulo (double lado)
    {
        AsignarValoresAlTriangulo (lado, lado, lado);
    }
    
     public Triangulo (double ladosIguales, double ladoDiferente)
    {
        AsignarValoresAlTriangulo(ladoDiferente, ladosIguales, ladosIguales);
        // ToDo:  caso de error cuando el triángulo no es válido
    }
     
     public Triangulo (double lado1, double lado2, double lado3)
    {
        AsignarValoresAlTriangulo (lado1, lado2, lado3);
    }
   
     @Override
    public void setArea() {
        super.areaPoligono = Math.sqrt(getSemiperimeter() * (getSemiperimeter() - super.getMedida(0)) *
                (getSemiperimeter() - super.getMedida(1)) * (getSemiperimeter() - super.getMedida(2)));
    }

     private void AsignarValoresAlTriangulo (double lado1, double lado2, 
                                double lado3)
    {
        if (lado1 + lado2 < lado3)
        {
            double[] MedidasLados = {lado1, lado2, lado3};
            CrearTriangulo(MedidasLados);
        }      
        // ToDo:  caso de error cuando el triángulo no es válido
    }
    
   
}