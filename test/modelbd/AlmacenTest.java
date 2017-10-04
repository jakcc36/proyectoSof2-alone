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
public class AlmacenTest {
    
    public AlmacenTest() {
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
     * Test of getDireccion method, of class Almacen.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Almacen instance = new Almacen();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDireccion method, of class Almacen.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Almacen instance = new Almacen();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncargado method, of class Almacen.
     */
    @Test
    public void testGetEncargado() {
        System.out.println("getEncargado");
        Almacen instance = new Almacen();
        Integer expResult = null;
        Integer result = instance.getEncargado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setEncargado method, of class Almacen.
     */
    @Test
    public void testSetEncargado() {
        System.out.println("setEncargado");
        Integer encargado = null;
        Almacen instance = new Almacen();
        instance.setEncargado(encargado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Almacen.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Almacen instance = new Almacen();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Almacen.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Almacen instance = new Almacen();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of hashCode method, of class Almacen.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Almacen instance = new Almacen();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
