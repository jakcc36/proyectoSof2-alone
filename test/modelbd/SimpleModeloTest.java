/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbd;

import core.JAbstractModelBD;
import java.sql.ResultSet;
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
public class SimpleModeloTest {
    
    public SimpleModeloTest() {
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
     * Test of getNombre method, of class SimpleModelo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        SimpleModelo instance = new SimpleModelo();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class SimpleModelo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        SimpleModelo instance = new SimpleModelo();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class SimpleModelo.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        SimpleModelo instance = new SimpleModelo();
        Integer expResult = null;
        Integer result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class SimpleModelo.
     */
    @Test
    public void testSetActivo_Integer() {
        System.out.println("setActivo");
        Integer activo = null;
        SimpleModelo instance = new SimpleModelo();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivoString method, of class SimpleModelo.
     */
    @Test
    public void testGetActivoString() {
        System.out.println("getActivoString");
        SimpleModelo instance = new SimpleModelo();
        String expResult = "";
        String result = instance.getActivoString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getActivoBool method, of class SimpleModelo.
     */
    @Test
    public void testGetActivoBool() {
        System.out.println("getActivoBool");
        SimpleModelo instance = new SimpleModelo();
        boolean expResult = false;
        boolean result = instance.getActivoBool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class SimpleModelo.
     */
    @Test
    public void testSetActivo_boolean() {
        System.out.println("setActivo");
        boolean activo = false;
        SimpleModelo instance = new SimpleModelo();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SimpleModelo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SimpleModelo instance = new SimpleModelo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class SimpleModelo.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        SimpleModelo instance = new SimpleModelo();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class SimpleModelo.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        SimpleModelo instance = new SimpleModelo();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
