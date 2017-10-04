/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import core.JAbstractModelBD;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelbd.Producto;
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
public class CProductoTest {
    
    public CProductoTest() {
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
     * Test of getRegistros method, of class CProducto.
     */
    @Test
    public void testGetRegistros_0args() {
        System.out.println("getRegistros");
        CProducto instance = new CProducto();
        ArrayList expResult = null;
        ArrayList result = instance.getRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CProducto.
     */
    @Test
    public void testGetRegistros_ObjectArr() {
        System.out.println("getRegistros");
        Object[] cvl = null;
        CProducto instance = new CProducto();
        ArrayList expResult = null;
        ArrayList result = instance.getRegistros(cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CProducto.
     */
    @Test
    public void testGetRegistro_0args() {
        System.out.println("getRegistro");
        CProducto instance = new CProducto();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.getRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CProducto.
     */
    @Test
    public void testGetRegistro_JAbstractModelBD_boolean() {
        System.out.println("getRegistro");
        JAbstractModelBD mdl = null;
        boolean opcion = false;
        CProducto instance = new CProducto();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.getRegistro(mdl, opcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of buscarRegistro method, of class CProducto.
     */
    @Test
    public void testBuscarRegistro() {
        System.out.println("buscarRegistro");
        Object cvl = null;
        CProducto instance = new CProducto();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.buscarRegistro(cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CProducto.
     */
    @Test
    public void testGetRegistro_int() {
        System.out.println("getRegistro");
        int id = 0;
        CProducto instance = new CProducto();
        Producto expResult = null;
        Producto result = instance.getRegistro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistroPorCodigo method, of class CProducto.
     */
    @Test
    public void testGetRegistroPorCodigo() {
        System.out.println("getRegistroPorCodigo");
        String id = "";
        CProducto instance = new CProducto();
        Producto expResult = null;
        Producto result = instance.getRegistroPorCodigo(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CProducto.
     */
    @Test
    public void testGetRegistros_StringArr_ObjectArr() {
        System.out.println("getRegistros");
        String[] columnas = null;
        Object[] cvl = null;
        CProducto instance = new CProducto();
        ArrayList<Producto> expResult = null;
        ArrayList<Producto> result = instance.getRegistros(columnas, cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of guardarRegistro method, of class CProducto.
     */
    @Test
    public void testGuardarRegistro() {
        System.out.println("guardarRegistro");
        JAbstractModelBD mdl = null;
        CProducto instance = new CProducto();
        boolean expResult = false;
        boolean result = instance.guardarRegistro(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizarRegistro method, of class CProducto.
     */
    @Test
    public void testActualizarRegistro() {
        System.out.println("actualizarRegistro");
        JAbstractModelBD mdl = null;
        CProducto instance = new CProducto();
        int expResult = 0;
        int result = instance.actualizarRegistro(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CProducto.
     */
    @Test
    public void testGetRegistros_3args() {
        System.out.println("getRegistros");
        String[] campos = null;
        String[] columnaId = null;
        Object[] id = null;
        CProducto instance = new CProducto();
        ArrayList expResult = null;
        ArrayList result = instance.getRegistros(campos, columnaId, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getFoto method, of class CProducto.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        Integer id = null;
        CProducto instance = new CProducto();
        ImageIcon expResult = null;
        ImageIcon result = instance.getFoto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of existeCodigo method, of class CProducto.
     */
    @Test
    public void testExisteCodigo_String() {
        System.out.println("existeCodigo");
        String codigo = "";
        CProducto instance = new CProducto();
        boolean expResult = false;
        boolean result = instance.existeCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of existeCodigoBarras method, of class CProducto.
     */
    @Test
    public void testExisteCodigoBarras_String() {
        System.out.println("existeCodigoBarras");
        String codigoDeBarras = "";
        CProducto instance = new CProducto();
        boolean expResult = false;
        boolean result = instance.existeCodigoBarras(codigoDeBarras);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of existeCodigo method, of class CProducto.
     */
    @Test
    public void testExisteCodigo_String_Integer() {
        System.out.println("existeCodigo");
        String codigo = "";
        Integer pk = null;
        CProducto instance = new CProducto();
        boolean expResult = false;
        boolean result = instance.existeCodigo(codigo, pk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of existeCodigoBarras method, of class CProducto.
     */
    @Test
    public void testExisteCodigoBarras_String_Integer() {
        System.out.println("existeCodigoBarras");
        String codigoDeBarras = "";
        Integer pk = null;
        CProducto instance = new CProducto();
        boolean expResult = false;
        boolean result = instance.existeCodigoBarras(codigoDeBarras, pk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getTotalRegistros method, of class CProducto.
     */
    @Test
    public void testGetTotalRegistros() {
        System.out.println("getTotalRegistros");
        CProducto instance = new CProducto();
        int expResult = 0;
        int result = instance.getTotalRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
