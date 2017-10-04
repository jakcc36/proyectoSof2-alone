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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getIdc method, of class Cliente.
     */
    @Test
    public void testGetIdc() {
        System.out.println("getIdc");
        Cliente instance = new Cliente();
        Long expResult = null;
        Long result = instance.getIdc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdc method, of class Cliente.
     */
    @Test
    public void testSetIdc() {
        System.out.println("setIdc");
        Long idc = null;
        Cliente instance = new Cliente();
        instance.setIdc(idc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuc method, of class Cliente.
     */
    @Test
    public void testGetRuc() {
        System.out.println("getRuc");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getRuc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setRuc method, of class Cliente.
     */
    @Test
    public void testSetRuc() {
        System.out.println("setRuc");
        String ruc = "";
        Cliente instance = new Cliente();
        instance.setRuc(ruc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Cliente.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDni method, of class Cliente.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        String dni = "";
        Cliente instance = new Cliente();
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Cliente.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setApellidos method, of class Cliente.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Cliente instance = new Cliente();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Cliente.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTipo method, of class Cliente.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Cliente instance = new Cliente();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Cliente.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setEmail method, of class Cliente.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Cliente instance = new Cliente();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Cliente.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTelefono method, of class Cliente.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Cliente instance = new Cliente();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovil method, of class Cliente.
     */
    @Test
    public void testGetMovil() {
        System.out.println("getMovil");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getMovil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setMovil method, of class Cliente.
     */
    @Test
    public void testSetMovil() {
        System.out.println("setMovil");
        String movil = "";
        Cliente instance = new Cliente();
        instance.setMovil(movil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextel method, of class Cliente.
     */
    @Test
    public void testGetNextel() {
        System.out.println("getNextel");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNextel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNextel method, of class Cliente.
     */
    @Test
    public void testSetNextel() {
        System.out.println("setNextel");
        String nextel = "";
        Cliente instance = new Cliente();
        instance.setNextel(nextel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFax method, of class Cliente.
     */
    @Test
    public void testGetFax() {
        System.out.println("getFax");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getFax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFax method, of class Cliente.
     */
    @Test
    public void testSetFax() {
        System.out.println("setFax");
        String fax = "";
        Cliente instance = new Cliente();
        instance.setFax(fax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecReg method, of class Cliente.
     */
    @Test
    public void testGetFecReg() {
        System.out.println("getFecReg");
        Cliente instance = new Cliente();
        long expResult = 0L;
        long result = instance.getFecReg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFecReg method, of class Cliente.
     */
    @Test
    public void testSetFecReg() {
        System.out.println("setFecReg");
        long fecReg = 0L;
        Cliente instance = new Cliente();
        instance.setFecReg(fecReg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Cliente.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Cliente.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Cliente instance = new Cliente();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class Cliente.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        Cliente instance = new Cliente();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class Cliente.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        Cliente instance = new Cliente();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
