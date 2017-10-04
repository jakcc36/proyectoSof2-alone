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
public class DetalleCompraTest {
    
    public DetalleCompraTest() {
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
     * Test of getId method, of class DetalleCompra.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        DetalleCompra instance = new DetalleCompra();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setId method, of class DetalleCompra.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        DetalleCompra instance = new DetalleCompra();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdcompra method, of class DetalleCompra.
     */
    @Test
    public void testGetIdcompra() {
        System.out.println("getIdcompra");
        DetalleCompra instance = new DetalleCompra();
        Compra expResult = null;
        Compra result = instance.getIdcompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdcompra method, of class DetalleCompra.
     */
    @Test
    public void testSetIdcompra() {
        System.out.println("setIdcompra");
        Compra idcompra = null;
        DetalleCompra instance = new DetalleCompra();
        instance.setIdcompra(idcompra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProducto method, of class DetalleCompra.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        DetalleCompra instance = new DetalleCompra();
        Producto expResult = null;
        Producto result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdProducto method, of class DetalleCompra.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        Producto idProducto = null;
        DetalleCompra instance = new DetalleCompra();
        instance.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class DetalleCompra.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        DetalleCompra instance = new DetalleCompra();
        Integer expResult = null;
        Integer result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCantidad method, of class DetalleCompra.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        Integer cantidad = null;
        DetalleCompra instance = new DetalleCompra();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImporte method, of class DetalleCompra.
     */
    @Test
    public void testGetImporte() {
        System.out.println("getImporte");
        DetalleCompra instance = new DetalleCompra();
        Double expResult = null;
        Double result = instance.getImporte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setImporte method, of class DetalleCompra.
     */
    @Test
    public void testSetImporte() {
        System.out.println("setImporte");
        Double importe = null;
        DetalleCompra instance = new DetalleCompra();
        instance.setImporte(importe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescuento method, of class DetalleCompra.
     */
    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        DetalleCompra instance = new DetalleCompra();
        Double expResult = null;
        Double result = instance.getDescuento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDescuento method, of class DetalleCompra.
     */
    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        Double descuento = null;
        DetalleCompra instance = new DetalleCompra();
        instance.setDescuento(descuento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class DetalleCompra.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        DetalleCompra instance = new DetalleCompra();
        Integer expResult = null;
        Integer result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class DetalleCompra.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        Integer activo = null;
        DetalleCompra instance = new DetalleCompra();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class DetalleCompra.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        DetalleCompra instance = new DetalleCompra();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class DetalleCompra.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        DetalleCompra instance = new DetalleCompra();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class DetalleCompra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DetalleCompra instance = new DetalleCompra();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of clone method, of class DetalleCompra.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        DetalleCompra instance = new DetalleCompra();
        Object expResult = null;
        Object result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class DetalleCompra.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        DetalleCompra instance = new DetalleCompra();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class DetalleCompra.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        DetalleCompra instance = new DetalleCompra();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
