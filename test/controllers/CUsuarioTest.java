/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import core.JAbstractModelBD;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import modelbd.Usuario;
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
public class CUsuarioTest {

    public CUsuarioTest() {
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
     * Test of getRegistros method, of class CUsuario.
     */
    @Test
    public void testGetRegistros_0args() {
        System.out.println("getRegistros");
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CUsuario.
     */
    @Test
    public void testGetRegistros_ObjectArr() {
        System.out.println("getRegistros");
        Object[] cvl = null;
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistros(cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getLoginUser method, of class CUsuario.
     */
    @Test
    public void testGetLoginUser() {
        System.out.println("getLoginUser");
        String login = "";
        CUsuario instance = new CUsuario();
        Usuario expResult = null;
        Usuario result = instance.getLoginUser(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CUsuario.
     */
    @Test
    public void testGetRegistros_StringArr_ObjectArr() {
        System.out.println("getRegistros");
        String[] columnas = null;
        Object[] cvl = null;
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistros(columnas, cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistrosPorTipoCargo method, of class CUsuario.
     */
    @Test
    public void testGetRegistrosPorTipoCargo() {
        System.out.println("getRegistrosPorTipoCargo");
        String cargo = "";
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistrosPorTipoCargo(cargo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistrosDni method, of class CUsuario.
     */
    @Test
    public void testGetRegistrosDni() {
        System.out.println("getRegistrosDni");
        String dni = "";
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistrosDni(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistrosCodigo method, of class CUsuario.
     */
    @Test
    public void testGetRegistrosCodigo() {
        System.out.println("getRegistrosCodigo");
        String codigo = "";
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistrosCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistrosLogin method, of class CUsuario.
     */
    @Test
    public void testGetRegistrosLogin() {
        System.out.println("getRegistrosLogin");
        String login = "";
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistrosLogin(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistrosFecha method, of class CUsuario.
     */
    @Test
    public void testGetRegistrosFecha_long() {
        System.out.println("getRegistrosFecha");
        long valor = 0L;
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistrosFecha(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistrosFecha method, of class CUsuario.
     */
    @Test
    public void testGetRegistrosFecha_long_long() {
        System.out.println("getRegistrosFecha");
        long valor1 = 0L;
        long valor = 0L;
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistrosFecha(valor1, valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CUsuario.
     */
    @Test
    public void testGetRegistro_0args() {
        System.out.println("getRegistro");
        CUsuario instance = new CUsuario();
        Usuario expResult = null;
        Usuario result = instance.getRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegitro method, of class CUsuario.
     */
    @Test
    public void testGetRegitro() {
        System.out.println("getRegitro");
        String id = "";
        CUsuario instance = new CUsuario();
        Usuario expResult = null;
        Usuario result = instance.getRegitro(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistro method, of class CUsuario.
     */
    @Test
    public void testGetRegistro_JAbstractModelBD_boolean() {
        System.out.println("getRegistro");
        JAbstractModelBD mdl = null;
        boolean opcion = false;
        CUsuario instance = new CUsuario();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.getRegistro(mdl, opcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of buscarRegistro method, of class CUsuario.
     */
    @Test
    public void testBuscarRegistro() {
        System.out.println("buscarRegistro");
        Object cvl = null;
        CUsuario instance = new CUsuario();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.buscarRegistro(cvl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of guardarRegistro method, of class CUsuario.
     */
    @Test
    public void testGuardarRegistro() {
        System.out.println("guardarRegistro");
        JAbstractModelBD mdl = null;
        CUsuario instance = new CUsuario();
        boolean expResult = false;
        boolean result = instance.guardarRegistro(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizarRegistro method, of class CUsuario.
     */
    @Test
    public void testActualizarRegistro() {
        System.out.println("actualizarRegistro");
        JAbstractModelBD mdl = null;
        CUsuario instance = new CUsuario();
        int expResult = 0;
        int result = instance.actualizarRegistro(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizarConFoto method, of class CUsuario.
     */
    @Test
    public void testActualizarConFoto() {
        System.out.println("actualizarConFoto");
        JAbstractModelBD mdl = null;
        CUsuario instance = new CUsuario();
        int expResult = 0;
        int result = instance.actualizarConFoto(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizarPass method, of class CUsuario.
     */
    @Test
    public void testActualizarPass() {
        System.out.println("actualizarPass");
        JAbstractModelBD mdl = null;
        CUsuario instance = new CUsuario();
        int expResult = 0;
        int result = instance.actualizarPass(mdl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of grabarEnBitacora method, of class CUsuario.
     */
    @Test
    public void testGrabarEnBitacora() {
        System.out.println("grabarEnBitacora");
        Usuario us = null;
        CUsuario instance = new CUsuario();
        int expResult = 0;
        int result = instance.grabarEnBitacora(us);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistroPorPk method, of class CUsuario.
     */
    @Test
    public void testGetRegistroPorPk() {
        System.out.println("getRegistroPorPk");
        Integer id = null;
        CUsuario instance = new CUsuario();
        Usuario expResult = null;
        Usuario result = instance.getRegistroPorPk(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistros method, of class CUsuario.
     */
    @Test
    public void testGetRegistros_3args() {
        System.out.println("getRegistros");
        String[] campos = null;
        String[] columnaId = null;
        Object[] id = null;
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistros(campos, columnaId, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getUltimoUsuario method, of class CUsuario.
     */
    @Test
    public void testGetUltimoUsuario() {
        System.out.println("getUltimoUsuario");
        CUsuario instance = new CUsuario();
        Usuario expResult = null;
        Usuario result = instance.getUltimoUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRegistrosMn method, of class CUsuario.
     */
    @Test
    public void testGetRegistrosMn() {
        System.out.println("getRegistrosMn");
        String[] campos = null;
        String[] columnaId = null;
        Object[] id = null;
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getRegistrosMn(campos, columnaId, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of existeCodigo method, of class CUsuario.
     */
    @Test
    public void testExisteCodigo() {
        System.out.println("existeCodigo");
        String codigo = "";
        CUsuario instance = new CUsuario();
        boolean expResult = false;
        boolean result = instance.existeCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of existeDni method, of class CUsuario.
     */
    @Test
    public void testExisteDni() {
        System.out.println("existeDni");
        String dni = "";
        CUsuario instance = new CUsuario();
        boolean expResult = false;
        boolean result = instance.existeDni(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of existeLogin method, of class CUsuario.
     */
    @Test
    public void testExisteLogin() {
        System.out.println("existeLogin");
        String login = "";
        CUsuario instance = new CUsuario();
        boolean expResult = false;
        boolean result = instance.existeLogin(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getCodigoUsuario method, of class CUsuario.
     */
    @Test
    public void testGetCodigoUsuario() {
        System.out.println("getCodigoUsuario");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getCodigoUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getFoto method, of class CUsuario.
     */
    @Test
    public void testGetFoto() {
        System.out.println("getFoto");
        Integer id = null;
        CUsuario instance = new CUsuario();
        ImageIcon expResult = null;
        ImageIcon result = instance.getFoto(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getDatoFoto method, of class CUsuario.
     */
    @Test
    public void testGetDatoFoto() {
        System.out.println("getDatoFoto");
        CUsuario instance = new CUsuario();
        InputStream expResult = null;
        InputStream result = instance.getDatoFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getNumeroRegistros method, of class CUsuario.
     */
    @Test
    public void testGetNumeroRegistros() {
        System.out.println("getNumeroRegistros");
        CUsuario instance = new CUsuario();
        int expResult = 0;
        int result = instance.getNumeroRegistros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of activarUsuario method, of class CUsuario.
     */
    @Test
    public void testActivarUsuario() {
        System.out.println("activarUsuario");
        Usuario us = null;
        CUsuario instance = new CUsuario();
        int expResult = 0;
        int result = instance.activarUsuario(us);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

}
