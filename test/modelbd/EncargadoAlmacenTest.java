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
public class EncargadoAlmacenTest {
    
    public EncargadoAlmacenTest() {
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
     * Test of getUsuario method, of class EncargadoAlmacen.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        EncargadoAlmacen instance = new EncargadoAlmacen();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setUsuario method, of class EncargadoAlmacen.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        EncargadoAlmacen instance = new EncargadoAlmacen();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlmacen method, of class EncargadoAlmacen.
     */
    @Test
    public void testGetAlmacen() {
        System.out.println("getAlmacen");
        EncargadoAlmacen instance = new EncargadoAlmacen();
        Almacen expResult = null;
        Almacen result = instance.getAlmacen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setAlmacen method, of class EncargadoAlmacen.
     */
    @Test
    public void testSetAlmacen() {
        System.out.println("setAlmacen");
        Almacen almacen = null;
        EncargadoAlmacen instance = new EncargadoAlmacen();
        instance.setAlmacen(almacen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoCargo method, of class EncargadoAlmacen.
     */
    @Test
    public void testGetTipoCargo() {
        System.out.println("getTipoCargo");
        EncargadoAlmacen instance = new EncargadoAlmacen();
        String expResult = "";
        String result = instance.getTipoCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTipoCargo method, of class EncargadoAlmacen.
     */
    @Test
    public void testSetTipoCargo() {
        System.out.println("setTipoCargo");
        String tipoCargo = "";
        EncargadoAlmacen instance = new EncargadoAlmacen();
        instance.setTipoCargo(tipoCargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class EncargadoAlmacen.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        EncargadoAlmacen instance = new EncargadoAlmacen();
        Integer expResult = null;
        Integer result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class EncargadoAlmacen.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        Integer activo = null;
        EncargadoAlmacen instance = new EncargadoAlmacen();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class EncargadoAlmacen.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        EncargadoAlmacen instance = new EncargadoAlmacen();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class EncargadoAlmacen.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        EncargadoAlmacen instance = new EncargadoAlmacen();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class EncargadoAlmacen.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        EncargadoAlmacen instance = new EncargadoAlmacen();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class EncargadoAlmacen.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        EncargadoAlmacen instance = new EncargadoAlmacen();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
