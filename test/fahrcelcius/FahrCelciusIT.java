/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrcelcius;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elaih
 */
public class FahrCelciusIT {
    
    public FahrCelciusIT() {
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
    
    

    /**
     * Test of FahrToCelc method, of class FahrCelcius. with Fahrenheit = 32
     */
    @Test
    public void testFahrToCelc() {
        System.out.println("FahrToCelc");
        float temp = 32;
        FahrCelcius instance = new FahrCelcius();
        float expResult = 0;
        float result = instance.FahrToCelc(temp);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of CelcToFahr method, of class FahrCelcius. with Celcius = 0
     */
    @Test
    public void testCelcToFahr() {
        System.out.println("CelcToFahr");
        float temp = 0.0F;
        FahrCelcius instance = new FahrCelcius();
        float expResult = 32.0F;
        float result = instance.CelcToFahr(temp);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of FahrToCelc method and use results to get same value using CelcToFahr
     */
    @Test
    public void testFahrToCelcToFahr() {
        System.out.println("FahrToCelc");
        float temp = 0;
        FahrCelcius instance = new FahrCelcius();
        float expResult = 0;
        float result = instance.FahrToCelc(instance.CelcToFahr(temp));
        assertEquals(expResult, result, 0.001);
    }
    
    /**
     * Test of CelcToFahr method, to fahr and to back to celc = same value
     */
    @Test
    public void testCelcToFahToCelc() {
        System.out.println("CelcToFahr");
        float temp = 20.0F;
        FahrCelcius instance = new FahrCelcius();
        float expResult = 20.0F;
        float result = instance.CelcToFahr(instance.FahrToCelc(temp));
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class FahrCelcius.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FahrCelcius.main(args);
    }
    
}
