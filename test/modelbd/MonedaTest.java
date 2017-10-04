/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RICARDO
 */
public class MonedaTest {
    
    public MonedaTest() {
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
     * Test of getSimbolo method, of class Moneda.
     */
    @Test
    public void testGetSimbolo() {
        System.out.println("getSimbolo");
        Moneda instance = new Moneda();
        String expResult = "";
        String result = instance.getSimbolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setSimbolo method, of class Moneda.
     */
    @Test
    public void testSetSimbolo() {
        System.out.println("setSimbolo");
        String simbolo = "";
        Moneda instance = new Moneda();
        instance.setSimbolo(simbolo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Moneda.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Moneda instance = new Moneda();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getPredeterminado method, of class Moneda.
     */
    @Test
    public void testGetPredeterminado() {
        System.out.println("getPredeterminado");
        Moneda instance = new Moneda();
        int expResult = 0;
        int result = instance.getPredeterminado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setPredeterminado method, of class Moneda.
     */
    @Test
    public void testSetPredeterminado() {
        System.out.println("setPredeterminado");
        int predeterminado = 0;
        Moneda instance = new Moneda();
        instance.setPredeterminado(predeterminado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPredeterminadoBool method, of class Moneda.
     */
    @Test
    public void testGetPredeterminadoBool() {
        System.out.println("getPredeterminadoBool");
        Moneda instance = new Moneda();
        boolean expResult = false;
        boolean result = instance.getPredeterminadoBool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Moneda.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Moneda instance = new Moneda();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of hashCode method, of class Moneda.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Moneda instance = new Moneda();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
