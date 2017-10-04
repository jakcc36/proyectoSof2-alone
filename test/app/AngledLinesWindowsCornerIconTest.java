/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Component;
import java.awt.Graphics;
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
public class AngledLinesWindowsCornerIconTest {
    
    public AngledLinesWindowsCornerIconTest() {
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
     * Test of getIconHeight method, of class AngledLinesWindowsCornerIcon.
     */
    @Test
    public void testGetIconHeight() {
        System.out.println("getIconHeight");
        AngledLinesWindowsCornerIcon instance = new AngledLinesWindowsCornerIcon();
        int expResult = 13;
        int result = instance.getIconHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getIconWidth method, of class AngledLinesWindowsCornerIcon.
     */
    @Test
    public void testGetIconWidth() {
        System.out.println("getIconWidth");
        AngledLinesWindowsCornerIcon instance = new AngledLinesWindowsCornerIcon();
        int expResult = 13;
        int result = instance.getIconWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of paintIcon method, of class AngledLinesWindowsCornerIcon.
     */
//    @Test
//    public void testPaintIcon() {
//        System.out.println("paintIcon");
//        Component c = null;
//        Graphics g = null;
//        int x = 0;
//        int y = 0;
//        AngledLinesWindowsCornerIcon instance = new AngledLinesWindowsCornerIcon();
//        instance.paintIcon(c, g, x, y);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
