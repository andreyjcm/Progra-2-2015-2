/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerexample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorio
 */
public class EscrituraBinaria {
    public void GrabarDatosBinarios (String nombreArchivo)
    {
        PrintWriter outfile1 = null;
        try {
            // Append to an existing file
            
            outfile1 = new PrintWriter(new FileWriter
                    (nombreArchivo, false), true);
            for (int i = 0; i < 20; i++)
            {
                RegistroVario datosParaGrabar = new RegistroVario();
                datosParaGrabar.campo1 = "Hello world";
                datosParaGrabar.campo2 = Math.random();
                datosParaGrabar.campo3 = new Date(2005, 10, 4);
                datosParaGrabar.campo4 = 50;
                outfile1.print(datosParaGrabar);
            }
        } catch (IOException ex) {
            Logger.getLogger(EscrituraBinaria.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            outfile1.close();
        }

    }
    
}
