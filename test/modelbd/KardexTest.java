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
public class KardexTest {
    
    public KardexTest() {
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
     * Test of getIdKardex method, of class Kardex.
     */
    @Test
    public void testGetIdKardex() {
        System.out.println("getIdKardex");
        Kardex instance = new Kardex();
        Integer expResult = null;
        Integer result = instance.getIdKardex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdKardex method, of class Kardex.
     */
    @Test
    public void testSetIdKardex() {
        System.out.println("setIdKardex");
        Integer idKardex = null;
        Kardex instance = new Kardex();
        instance.setIdKardex(idKardex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducto method, of class Kardex.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        Kardex instance = new Kardex();
        Producto expResult = null;
        Producto result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setProducto method, of class Kardex.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto producto = null;
        Kardex instance = new Kardex();
        instance.setProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Kardex.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Kardex instance = new Kardex();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFecha method, of class Kardex.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date Fecha = null;
        Kardex instance = new Kardex();
        instance.setFecha(Fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocumento method, of class Kardex.
     */
    @Test
    public void testGetDocumento() {
        System.out.println("getDocumento");
        Kardex instance = new Kardex();
        String expResult = "";
        String result = instance.getDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDocumento method, of class Kardex.
     */
    @Test
    public void testSetDocumento() {
        System.out.println("setDocumento");
        String documento = "";
        Kardex instance = new Kardex();
        instance.setDocumento(documento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroDeDocumento method, of class Kardex.
     */
    @Test
    public void testGetNumeroDeDocumento() {
        System.out.println("getNumeroDeDocumento");
        Kardex instance = new Kardex();
        String expResult = "";
        String result = instance.getNumeroDeDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNumeroDeDocumento method, of class Kardex.
     */
    @Test
    public void testSetNumeroDeDocumento() {
        System.out.println("setNumeroDeDocumento");
        String numeroDeDocumento = "";
        Kardex instance = new Kardex();
        instance.setNumeroDeDocumento(numeroDeDocumento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntrada method, of class Kardex.
     */
    @Test
    public void testGetEntrada() {
        System.out.println("getEntrada");
        Kardex instance = new Kardex();
        Integer expResult = null;
        Integer result = instance.getEntrada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setEntrada method, of class Kardex.
     */
    @Test
    public void testSetEntrada() {
        System.out.println("setEntrada");
        Integer entrada = null;
        Kardex instance = new Kardex();
        instance.setEntrada(entrada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalida method, of class Kardex.
     */
    @Test
    public void testGetSalida() {
        System.out.println("getSalida");
        Kardex instance = new Kardex();
        Integer expResult = null;
        Integer result = instance.getSalida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setSalida method, of class Kardex.
     */
    @Test
    public void testSetSalida() {
        System.out.println("setSalida");
        Integer salida = null;
        Kardex instance = new Kardex();
        instance.setSalida(salida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Kardex.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Kardex instance = new Kardex();
        Double expResult = null;
        Double result = instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setPrecio method, of class Kardex.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        Double precio = null;
        Kardex instance = new Kardex();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Kardex.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Kardex instance = new Kardex();
        Double expResult = null;
        Double result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setValor method, of class Kardex.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Double valor = null;
        Kardex instance = new Kardex();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStockActual method, of class Kardex.
     */
    @Test
    public void testGetStockActual() {
        System.out.println("getStockActual");
        Kardex instance = new Kardex();
        Integer expResult = null;
        Integer result = instance.getStockActual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setStockActual method, of class Kardex.
     */
    @Test
    public void testSetStockActual() {
        System.out.println("setStockActual");
        Integer StockActual = null;
        Kardex instance = new Kardex();
        instance.setStockActual(StockActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotal method, of class Kardex.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        Kardex instance = new Kardex();
        Double expResult = null;
        Double result = instance.getValorTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setValorTotal method, of class Kardex.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        Double valorTotal = null;
        Kardex instance = new Kardex();
        instance.setValorTotal(valorTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class Kardex.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        Kardex instance = new Kardex();
        Integer expResult = null;
        Integer result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class Kardex.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        Integer activo = null;
        Kardex instance = new Kardex();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Kardex.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Kardex instance = new Kardex();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Kardex.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Kardex instance = new Kardex();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Kardex.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Kardex instance = new Kardex();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class Kardex.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        Kardex instance = new Kardex();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class Kardex.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        Kardex instance = new Kardex();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
