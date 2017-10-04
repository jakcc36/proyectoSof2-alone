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
public class BitacoraTest {
    
    public BitacoraTest() {
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
     * Test of getArquitectura method, of class Bitacora.
     */
    @Test
    public void testGetArquitectura() {
        System.out.println("getArquitectura");
        Bitacora instance = new Bitacora();
        String expResult = "";
        String result = instance.getArquitectura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setArquitectura method, of class Bitacora.
     */
    @Test
    public void testSetArquitectura() {
        System.out.println("setArquitectura");
        String arquitectura = "";
        Bitacora instance = new Bitacora();
        instance.setArquitectura(arquitectura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOs method, of class Bitacora.
     */
    @Test
    public void testGetOs() {
        System.out.println("getOs");
        Bitacora instance = new Bitacora();
        String expResult = "";
        String result = instance.getOs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setOs method, of class Bitacora.
     */
    @Test
    public void testSetOs() {
        System.out.println("setOs");
        String os = "";
        Bitacora instance = new Bitacora();
        instance.setOs(os);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Bitacora.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Bitacora instance = new Bitacora();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setUsuario method, of class Bitacora.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        Bitacora instance = new Bitacora();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVersion method, of class Bitacora.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        Bitacora instance = new Bitacora();
        String expResult = "";
        String result = instance.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setVersion method, of class Bitacora.
     */
    @Test
    public void testSetVersion() {
        System.out.println("setVersion");
        String version = "";
        Bitacora instance = new Bitacora();
        instance.setVersion(version);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaActividad method, of class Bitacora.
     */
    @Test
    public void testGetFechaActividad() {
        System.out.println("getFechaActividad");
        Bitacora instance = new Bitacora();
        long expResult = 0L;
        long result = instance.getFechaActividad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFechaActividad method, of class Bitacora.
     */
    @Test
    public void testSetFechaActividad() {
        System.out.println("setFechaActividad");
        long fechaActividad = 0L;
        Bitacora instance = new Bitacora();
        instance.setFechaActividad(fechaActividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdbitacora method, of class Bitacora.
     */
    @Test
    public void testGetIdbitacora() {
        System.out.println("getIdbitacora");
        Bitacora instance = new Bitacora();
        Long expResult = null;
        Long result = instance.getIdbitacora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdbitacora method, of class Bitacora.
     */
    @Test
    public void testSetIdbitacora() {
        System.out.println("setIdbitacora");
        Long idbitacora = null;
        Bitacora instance = new Bitacora();
        instance.setIdbitacora(idbitacora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdusuario method, of class Bitacora.
     */
    @Test
    public void testGetIdusuario() {
        System.out.println("getIdusuario");
        Bitacora instance = new Bitacora();
        int expResult = 0;
        int result = instance.getIdusuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdusuario method, of class Bitacora.
     */
    @Test
    public void testSetIdusuario() {
        System.out.println("setIdusuario");
        int idusuario = 0;
        Bitacora instance = new Bitacora();
        instance.setIdusuario(idusuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltimaActividad method, of class Bitacora.
     */
    @Test
    public void testGetUltimaActividad() {
        System.out.println("getUltimaActividad");
        Bitacora instance = new Bitacora();
        long expResult = 0L;
        long result = instance.getUltimaActividad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setUltimaActividad method, of class Bitacora.
     */
    @Test
    public void testSetUltimaActividad() {
        System.out.println("setUltimaActividad");
        long ultimaActividad = 0L;
        Bitacora instance = new Bitacora();
        instance.setUltimaActividad(ultimaActividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Bitacora.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Bitacora instance = new Bitacora();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Bitacora.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Bitacora instance = new Bitacora();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class Bitacora.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bitacora instance = new Bitacora();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class Bitacora.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        Bitacora instance = new Bitacora();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class Bitacora.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        Bitacora instance = new Bitacora();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
