/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbd;

import core.JAbstractModelBD;
import java.sql.ResultSet;
import java.util.Date;
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
public class AlmacenProductoTest {
    
    public AlmacenProductoTest() {
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
     * Test of getIdpa method, of class AlmacenProducto.
     */
    @Test
    public void testGetIdpa() {
        System.out.println("getIdpa");
        AlmacenProducto instance = new AlmacenProducto();
        Integer expResult = null;
        Integer result = instance.getIdpa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdpa method, of class AlmacenProducto.
     */
    @Test
    public void testSetIdpa() {
        System.out.println("setIdpa");
        Integer idpa = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.setIdpa(idpa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlmacen method, of class AlmacenProducto.
     */
    @Test
    public void testGetAlmacen() {
        System.out.println("getAlmacen");
        AlmacenProducto instance = new AlmacenProducto();
        Almacen expResult = null;
        Almacen result = instance.getAlmacen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setAlmacen method, of class AlmacenProducto.
     */
    @Test
    public void testSetAlmacen() {
        System.out.println("setAlmacen");
        Almacen almacen = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.setAlmacen(almacen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducto method, of class AlmacenProducto.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        AlmacenProducto instance = new AlmacenProducto();
        Producto expResult = null;
        Producto result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setProducto method, of class AlmacenProducto.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto producto = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.setProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadActual method, of class AlmacenProducto.
     */
    @Test
    public void testGetCantidadActual() {
        System.out.println("getCantidadActual");
        AlmacenProducto instance = new AlmacenProducto();
        Integer expResult = null;
        Integer result = instance.getCantidadActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCantidadActual method, of class AlmacenProducto.
     */
    @Test
    public void testSetCantidadActual() {
        System.out.println("setCantidadActual");
        Integer cantidadActual = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.setCantidadActual(cantidadActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadInicial method, of class AlmacenProducto.
     */
    @Test
    public void testGetCantidadInicial() {
        System.out.println("getCantidadInicial");
        AlmacenProducto instance = new AlmacenProducto();
        Integer expResult = null;
        Integer result = instance.getCantidadInicial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCantidadInicial method, of class AlmacenProducto.
     */
    @Test
    public void testSetCantidadInicial() {
        System.out.println("setCantidadInicial");
        Integer cantidadInicial = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.setCantidadInicial(cantidadInicial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoManipulacion method, of class AlmacenProducto.
     */
    @Test
    public void testGetTipoManipulacion() {
        System.out.println("getTipoManipulacion");
        AlmacenProducto instance = new AlmacenProducto();
        String expResult = "";
        String result = instance.getTipoManipulacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTipoManipulacion method, of class AlmacenProducto.
     */
    @Test
    public void testSetTipoManipulacion() {
        System.out.println("setTipoManipulacion");
        String tipoManipulacion = "";
        AlmacenProducto instance = new AlmacenProducto();
        instance.setTipoManipulacion(tipoManipulacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class AlmacenProducto.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        AlmacenProducto instance = new AlmacenProducto();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFecha method, of class AlmacenProducto.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class AlmacenProducto.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        AlmacenProducto instance = new AlmacenProducto();
        Integer expResult = null;
        Integer result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class AlmacenProducto.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        Integer activo = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarCantidad method, of class AlmacenProducto.
     */
    @Test
    public void testSumarCantidad() {
        System.out.println("sumarCantidad");
        Integer cantidad = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.sumarCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restarCantidad method, of class AlmacenProducto.
     */
    @Test
    public void testRestarCantidad() {
        System.out.println("restarCantidad");
        Integer cantidad = null;
        AlmacenProducto instance = new AlmacenProducto();
        instance.restarCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class AlmacenProducto.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        AlmacenProducto instance = new AlmacenProducto();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class AlmacenProducto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        AlmacenProducto instance = new AlmacenProducto();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class AlmacenProducto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AlmacenProducto instance = new AlmacenProducto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class AlmacenProducto.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        AlmacenProducto instance = new AlmacenProducto();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class AlmacenProducto.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        AlmacenProducto instance = new AlmacenProducto();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
