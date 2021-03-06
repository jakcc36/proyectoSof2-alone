/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import core.JAbstractModelBD;
import java.util.ArrayList;
import modelbd.Moneda;
import modelbd.SimpleModelo;
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
public class CMonedaTest {
    
    public CMonedaTest() {
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
     * Test of getRegistros method, of class CMoneda.
     */
    @Test
    public void testGetRegistros_0args() {
        System.out.println("getRegistros");
        CMoneda instance = new CMoneda();
        ArrayList expResult = null;
        ArrayList result = instance.getRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CMoneda.
     */
    @Test
    public void testGetRegistros_StringArr_ObjectArr() {
        System.out.println("getRegistros");
        String[] columna = null;
        Object[] valor = null;
        CMoneda instance = new CMoneda();
        ArrayList<SimpleModelo> expResult = null;
        ArrayList<SimpleModelo> result = instance.getRegistros(columna, valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CMoneda.
     */
    @Test
    public void testGetRegistros_ObjectArr() {
        System.out.println("getRegistros");
        Object[] cvl = null;
        CMoneda instance = new CMoneda();
        ArrayList expResult = null;
        ArrayList result = instance.getRegistros(cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CMoneda.
     */
    @Test
    public void testGetRegistro_0args() {
        System.out.println("getRegistro");
        CMoneda instance = new CMoneda();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.getRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CMoneda.
     */
    @Test
    public void testGetRegistro_JAbstractModelBD_boolean() {
        System.out.println("getRegistro");
        JAbstractModelBD mdl = null;
        boolean opcion = false;
        CMoneda instance = new CMoneda();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.getRegistro(mdl, opcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of buscarRegistro method, of class CMoneda.
     */
    @Test
    public void testBuscarRegistro() {
        System.out.println("buscarRegistro");
        Object cvl = null;
        CMoneda instance = new CMoneda();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.buscarRegistro(cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of guardarRegistro method, of class CMoneda.
     */
    @Test
    public void testGuardarRegistro() {
        System.out.println("guardarRegistro");
        JAbstractModelBD mdl = null;
        CMoneda instance = new CMoneda();
        boolean expResult = false;
        boolean result = instance.guardarRegistro(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizarRegistro method, of class CMoneda.
     */
    @Test
    public void testActualizarRegistro() {
        System.out.println("actualizarRegistro");
        JAbstractModelBD mdl = null;
        CMoneda instance = new CMoneda();
        int expResult = 0;
        int result = instance.actualizarRegistro(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistroPorPk method, of class CMoneda.
     */
    @Test
    public void testGetRegistroPorPk() {
        System.out.println("getRegistroPorPk");
        Integer id = null;
        CMoneda instance = new CMoneda();
        Moneda expResult = null;
        Moneda result = instance.getRegistroPorPk(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CMoneda.
     */
    @Test
    public void testGetRegistros_3args() {
        System.out.println("getRegistros");
        String[] campos = null;
        String[] columnaId = null;
        Object[] id = null;
        CMoneda instance = new CMoneda();
        ArrayList expResult = null;
        ArrayList result = instance.getRegistros(campos, columnaId, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getPredeterminado method, of class CMoneda.
     */
    @Test
    public void testGetPredeterminado() {
        System.out.println("getPredeterminado");
        CMoneda instance = new CMoneda();
        Moneda expResult = null;
        Moneda result = instance.getPredeterminado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
