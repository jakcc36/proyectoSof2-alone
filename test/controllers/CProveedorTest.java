/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import core.JAbstractModelBD;
import java.util.ArrayList;
import modelbd.Proveedor;
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
public class CProveedorTest {

    public CProveedorTest() {
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
     * Test of getRegistros method, of class CProveedor.
     */
    @Test
    public void testGetRegistros_ObjectArr() {
        System.out.println("getRegistros");
        Object[] op = null;
        CProveedor instance = new CProveedor();
        ArrayList<Proveedor> expResult = null;
        ArrayList<Proveedor> result = instance.getRegistros(op);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CProveedor.
     */
    @Test
    public void testGetRegistros_StringArr_ObjectArr() {
        System.out.println("getRegistros");
        String[] columna = null;
        Object[] valor = null;
        CProveedor instance = new CProveedor();
        ArrayList<Proveedor> expResult = null;
        ArrayList<Proveedor> result = instance.getRegistros(columna, valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistroPorPk method, of class CProveedor.
     */
    @Test
    public void testGetRegistroPorPk() {
        System.out.println("getRegistroPorPk");
        Integer id = null;
        CProveedor instance = new CProveedor();
        Proveedor expResult = null;
        Proveedor result = instance.getRegistroPorPk(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CProveedor.
     */
    @Test
    public void testGetRegistros_3args() {
        System.out.println("getRegistros");
        String[] campos = null;
        String[] columnaId = null;
        Object[] id = null;
        CProveedor instance = new CProveedor();
        ArrayList<Proveedor> expResult = null;
        ArrayList<Proveedor> result = instance.getRegistros(campos, columnaId, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CProveedor.
     */
    @Test
    public void testGetRegistros_0args() {
        System.out.println("getRegistros");
        CProveedor instance = new CProveedor();
        ArrayList<JAbstractModelBD> expResult = null;
        ArrayList<JAbstractModelBD> result = instance.getRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CProveedor.
     */
    @Test
    public void testGetRegistro_0args() {
        System.out.println("getRegistro");
        CProveedor instance = new CProveedor();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.getRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CProveedor.
     */
    @Test
    public void testGetRegistro_JAbstractModelBD_boolean() {
        System.out.println("getRegistro");
        JAbstractModelBD mdl = null;
        boolean opcion = false;
        CProveedor instance = new CProveedor();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.getRegistro(mdl, opcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of buscarRegistro method, of class CProveedor.
     */
    @Test
    public void testBuscarRegistro() {
        System.out.println("buscarRegistro");
        Object cvl = null;
        CProveedor instance = new CProveedor();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.buscarRegistro(cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of guardarRegistro method, of class CProveedor.
     */
    @Test
    public void testGuardarRegistro() {
        System.out.println("guardarRegistro");
        JAbstractModelBD mdl = null;
        CProveedor instance = new CProveedor();
        boolean expResult = false;
        boolean result = instance.guardarRegistro(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizarRegistro method, of class CProveedor.
     */
    @Test
    public void testActualizarRegistro() {
        System.out.println("actualizarRegistro");
        JAbstractModelBD mdl = null;
        CProveedor instance = new CProveedor();
        int expResult = 0;
        int result = instance.actualizarRegistro(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getProveedor method, of class CProveedor.
     */
    @Test
    public void testGetProveedor() {
        System.out.println("getProveedor");
        CProveedor instance = new CProveedor();
        Proveedor expResult = null;
        Proveedor result = instance.getProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setProveedor method, of class CProveedor.
     */
    @Test
    public void testSetProveedor() {
        System.out.println("setProveedor");
        JAbstractModelBD prv = null;
        CProveedor instance = new CProveedor();
        instance.setProveedor(prv);
        // TODO review the generated test code and remove the default call to fail.
    }

}
