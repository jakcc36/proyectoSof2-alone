/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbd;

import core.JAbstractModelBD;
import java.sql.ResultSet;
import java.util.ArrayList;
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
public class CompraTest {
    
    public CompraTest() {
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
     * Test of getDetalleCompra method, of class Compra.
     */
    @Test
    public void testGetDetalleCompra() {
        System.out.println("getDetalleCompra");
        Compra instance = new Compra();
        ArrayList<DetalleCompra> expResult = null;
        ArrayList<DetalleCompra> result = instance.getDetalleCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDetalleCompra method, of class Compra.
     */
    @Test
    public void testSetDetalleCompra() {
        System.out.println("setDetalleCompra");
        ArrayList<DetalleCompra> dc = null;
        Compra instance = new Compra();
        instance.setDetalleCompra(dc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Compra.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Compra instance = new Compra();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setId method, of class Compra.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Compra instance = new Compra();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDocumento method, of class Compra.
     */
    @Test
    public void testGetTipoDocumento() {
        System.out.println("getTipoDocumento");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.getTipoDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTipoDocumento method, of class Compra.
     */
    @Test
    public void testSetTipoDocumento() {
        System.out.println("setTipoDocumento");
        String tipoDocumento = "";
        Compra instance = new Compra();
        instance.setTipoDocumento(tipoDocumento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroDocumento method, of class Compra.
     */
    @Test
    public void testGetNumeroDocumento() {
        System.out.println("getNumeroDocumento");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.getNumeroDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNumeroDocumento method, of class Compra.
     */
    @Test
    public void testSetNumeroDocumento() {
        System.out.println("setNumeroDocumento");
        String numeroDocumento = "";
        Compra instance = new Compra();
        instance.setNumeroDocumento(numeroDocumento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProveedor method, of class Compra.
     */
    @Test
    public void testGetIdProveedor() {
        System.out.println("getIdProveedor");
        Compra instance = new Compra();
        Proveedor expResult = null;
        Proveedor result = instance.getIdProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdProveedor method, of class Compra.
     */
    @Test
    public void testSetIdProveedor() {
        System.out.println("setIdProveedor");
        Proveedor idProveedor = null;
        Compra instance = new Compra();
        instance.setIdProveedor(idProveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUsuario method, of class Compra.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Compra instance = new Compra();
        Usuario expResult = null;
        Usuario result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdUsuario method, of class Compra.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        Usuario idUsuario = null;
        Compra instance = new Compra();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdMoneda method, of class Compra.
     */
    @Test
    public void testGetIdMoneda() {
        System.out.println("getIdMoneda");
        Compra instance = new Compra();
        Moneda expResult = null;
        Moneda result = instance.getIdMoneda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdMoneda method, of class Compra.
     */
    @Test
    public void testSetIdMoneda() {
        System.out.println("setIdMoneda");
        Moneda idMoneda = null;
        Compra instance = new Compra();
        instance.setIdMoneda(idMoneda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Compra.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setEstado method, of class Compra.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Compra instance = new Compra();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroItems method, of class Compra.
     */
    @Test
    public void testGetNumeroItems() {
        System.out.println("getNumeroItems");
        Compra instance = new Compra();
        Integer expResult = null;
        Integer result = instance.getNumeroItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNumeroItems method, of class Compra.
     */
    @Test
    public void testSetNumeroItems() {
        System.out.println("setNumeroItems");
        Integer numeroItems = null;
        Compra instance = new Compra();
        instance.setNumeroItems(numeroItems);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservaciones method, of class Compra.
     */
    @Test
    public void testGetObservaciones() {
        System.out.println("getObservaciones");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.getObservaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setObservaciones method, of class Compra.
     */
    @Test
    public void testSetObservaciones() {
        System.out.println("setObservaciones");
        String observaciones = "";
        Compra instance = new Compra();
        instance.setObservaciones(observaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtotla method, of class Compra.
     */
    @Test
    public void testGetSubtotla() {
        System.out.println("getSubtotla");
        Compra instance = new Compra();
        Double expResult = null;
        Double result = instance.getSubtotla();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setSubtotla method, of class Compra.
     */
    @Test
    public void testSetSubtotla() {
        System.out.println("setSubtotla");
        Double subtotla = null;
        Compra instance = new Compra();
        instance.setSubtotla(subtotla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIgv method, of class Compra.
     */
    @Test
    public void testGetIgv() {
        System.out.println("getIgv");
        Compra instance = new Compra();
        Integer expResult = null;
        Integer result = instance.getIgv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIgv method, of class Compra.
     */
    @Test
    public void testSetIgv() {
        System.out.println("setIgv");
        Integer igv = null;
        Compra instance = new Compra();
        instance.setIgv(igv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Compra.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Compra instance = new Compra();
        Double expResult = null;
        Double result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTotal method, of class Compra.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        Double total = null;
        Compra instance = new Compra();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Compra.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Compra instance = new Compra();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFecha method, of class Compra.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Compra instance = new Compra();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class Compra.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        Compra instance = new Compra();
        Integer expResult = null;
        Integer result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class Compra.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        Integer activo = null;
        Compra instance = new Compra();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Compra.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Compra instance = new Compra();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Compra.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Compra instance = new Compra();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class Compra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of clone method, of class Compra.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Compra instance = new Compra();
        Object expResult = null;
        Object result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class Compra.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        Compra instance = new Compra();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class Compra.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        Compra instance = new Compra();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
