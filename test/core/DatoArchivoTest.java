/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.FileInputStream;
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
public class DatoArchivoTest {
    
    public DatoArchivoTest() {
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
     * Test of getFis method, of class DatoArchivo.
     */
    @Test
    public void testGetFis() {
        System.out.println("getFis");
        DatoArchivo instance = null;
        FileInputStream expResult = null;
        FileInputStream result = instance.getFis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getLongitud method, of class DatoArchivo.
     */
    @Test
    public void testGetLongitud() {
        System.out.println("getLongitud");
        DatoArchivo instance = null;
        int expResult = 0;
        int result = instance.getLongitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
