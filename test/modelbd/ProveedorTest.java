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
public class ProveedorTest {
    
    public ProveedorTest() {
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
     * Test of getDireccion method, of class Proveedor.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDireccion method, of class Proveedor.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Proveedor instance = new Proveedor();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdproveedor method, of class Proveedor.
     */
    @Test
    public void testGetIdproveedor() {
        System.out.println("getIdproveedor");
        Proveedor instance = new Proveedor();
        Integer expResult = null;
        Integer result = instance.getIdproveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdproveedor method, of class Proveedor.
     */
    @Test
    public void testSetIdproveedor() {
        System.out.println("setIdproveedor");
        Integer idproveedor = null;
        Proveedor instance = new Proveedor();
        instance.setIdproveedor(idproveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuc method, of class Proveedor.
     */
    @Test
    public void testGetRuc() {
        System.out.println("getRuc");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getRuc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setRuc method, of class Proveedor.
     */
    @Test
    public void testSetRuc() {
        System.out.println("setRuc");
        String ruc = "";
        Proveedor instance = new Proveedor();
        instance.setRuc(ruc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRazonSocial method, of class Proveedor.
     */
    @Test
    public void testGetRazonSocial() {
        System.out.println("getRazonSocial");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getRazonSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setRazonSocial method, of class Proveedor.
     */
    @Test
    public void testSetRazonSocial() {
        System.out.println("setRazonSocial");
        String razonSocial = "";
        Proveedor instance = new Proveedor();
        instance.setRazonSocial(razonSocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCiudad method, of class Proveedor.
     */
    @Test
    public void testGetCiudad() {
        System.out.println("getCiudad");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getCiudad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCiudad method, of class Proveedor.
     */
    @Test
    public void testSetCiudad() {
        System.out.println("setCiudad");
        String ciudad = "";
        Proveedor instance = new Proveedor();
        instance.setCiudad(ciudad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Proveedor.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTelefono method, of class Proveedor.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Proveedor instance = new Proveedor();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextel method, of class Proveedor.
     */
    @Test
    public void testGetNextel() {
        System.out.println("getNextel");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getNextel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNextel method, of class Proveedor.
     */
    @Test
    public void testSetNextel() {
        System.out.println("setNextel");
        String nextel = "";
        Proveedor instance = new Proveedor();
        instance.setNextel(nextel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovil method, of class Proveedor.
     */
    @Test
    public void testGetMovil() {
        System.out.println("getMovil");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getMovil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setMovil method, of class Proveedor.
     */
    @Test
    public void testSetMovil() {
        System.out.println("setMovil");
        String movil = "";
        Proveedor instance = new Proveedor();
        instance.setMovil(movil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFax method, of class Proveedor.
     */
    @Test
    public void testGetFax() {
        System.out.println("getFax");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getFax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFax method, of class Proveedor.
     */
    @Test
    public void testSetFax() {
        System.out.println("setFax");
        String fax = "";
        Proveedor instance = new Proveedor();
        instance.setFax(fax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCtaBancaria method, of class Proveedor.
     */
    @Test
    public void testGetCtaBancaria() {
        System.out.println("getCtaBancaria");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getCtaBancaria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCtaBancaria method, of class Proveedor.
     */
    @Test
    public void testSetCtaBancaria() {
        System.out.println("setCtaBancaria");
        String ctaBancaria = "";
        Proveedor instance = new Proveedor();
        instance.setCtaBancaria(ctaBancaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomContacto method, of class Proveedor.
     */
    @Test
    public void testGetNomContacto() {
        System.out.println("getNomContacto");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getNomContacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNomContacto method, of class Proveedor.
     */
    @Test
    public void testSetNomContacto() {
        System.out.println("setNomContacto");
        String nomContacto = "";
        Proveedor instance = new Proveedor();
        instance.setNomContacto(nomContacto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Proveedor.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setEmail method, of class Proveedor.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Proveedor instance = new Proveedor();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRubro method, of class Proveedor.
     */
    @Test
    public void testGetRubro() {
        System.out.println("getRubro");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getRubro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setRubro method, of class Proveedor.
     */
    @Test
    public void testSetRubro() {
        System.out.println("setRubro");
        String rubro = "";
        Proveedor instance = new Proveedor();
        instance.setRubro(rubro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductos method, of class Proveedor.
     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.getProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setProductos method, of class Proveedor.
     */
    @Test
    public void testSetProductos() {
        System.out.println("setProductos");
        String productos = "";
        Proveedor instance = new Proveedor();
        instance.setProductos(productos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class Proveedor.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        Proveedor instance = new Proveedor();
        Integer expResult = null;
        Integer result = instance.getActivo();
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActivo method, of class Proveedor.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        Integer activo = null;
        Proveedor instance = new Proveedor();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Proveedor.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Proveedor instance = new Proveedor();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Proveedor.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Proveedor instance = new Proveedor();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class Proveedor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Proveedor instance = new Proveedor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class Proveedor.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        Proveedor instance = new Proveedor();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class Proveedor.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        Proveedor instance = new Proveedor();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
