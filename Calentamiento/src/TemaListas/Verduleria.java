/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TemaListas;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author laboratorio
 */
public class Verduleria {
    public ArrayList<Frutas> manzanas = new ArrayList ();
    public ArrayList<Frutas> uvas = new ArrayList ();
    
    public void AgregarSandias (ArrayList<Frutas> listaSandias, int cantidad)
    {
        int contador = 1;
        // realice el siguiente ciclo
        while (contador <= cantidad)
        {
            // fecha de hoy
            Date fechaVencimiento = new Date();
            // cree un peso aleatorio
            double pesoFruta = 20 * Math.random();
            // cree una nueva fruta
            Frutas sandia = new Frutas("Verde", pesoFruta, "Dulce", 
                    "Sandía", fechaVencimiento);
            // agréguela a la lista
            listaSandias.add(sandia);
            // incremente el contador
            contador++;
        }
    }
    
    public Frutas VenderSandia (ArrayList<Frutas> listaSandias)
    {
        // variable con la sandía que voy a vender
        Frutas sandia = null;
        // si tengo sandías para vender
        if (listaSandias.size() > 0)
        {
            // quite la sandía del inventario y véndala
            sandia = listaSandias.remove(1);
        }
        // retorne la sandía vendida
        return sandia;
    }
    
}
