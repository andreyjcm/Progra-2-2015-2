/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Semana1y2.EcuacionCuadratica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecferme
 */
public class TestCuadratica {
    
    public TestCuadratica() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void pruebaHelloWorldCustomCasoBase ()
    {
        String userName = "Alejandra";
        String expectedMessage = "Hello World";
        EcuacionCuadratica ecu = new EcuacionCuadratica();
        // realice la ejecución de la prueba
        String realMessage = ecu.HelloWorldCustom(userName);
        assertEquals(String.format("Error en la prueba"), expectedMessage, realMessage);        
    }
}
