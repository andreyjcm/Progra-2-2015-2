/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;

/**
 *
 * @author laboratorio
 */
public interface IPoligono extends IFiguraGeometrica{
    // Cantidad de lados del polígono
    public int cantidadLados ();
    // obtener las medidas del polígono
    public double[] ObtenerMedidas ();
}
