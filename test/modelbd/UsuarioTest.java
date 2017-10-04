/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbd;

import autorizacion.DbAutorizacionAdministrador;
import core.DatoArchivo;
import core.JAbstractModelBD;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.swing.tree.DefaultMutableTreeNode;
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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getAuth method, of class Usuario.
     */
    @Test
    public void testGetAuth() {
        System.out.println("getAuth");
        Usuario instance = new Usuario();
        DbAutorizacionAdministrador expResult = null;
        DbAutorizacionAdministrador result = instance.getAuth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of verificarAcceso method, of class Usuario.
     */
    @Test
    public void testVerificarAcceso() {
        System.out.println("verificarAcceso");
        String itemName = "";
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.verificarAcceso(itemName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getPermisos method, of class Usuario.
     */
    @Test
    public void testGetPermisos() {
        System.out.println("getPermisos");
        Usuario instance = new Usuario();
        DefaultMutableTreeNode expResult = null;
        DefaultMutableTreeNode result = instance.getPermisos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getFechaNacimiento method, of class Usuario.
     */
    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Usuario instance = new Usuario();
        long expResult = 0L;
        long result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFechaNacimiento method, of class Usuario.
     */
    @Test
    public void testSetFechaNacimiento() {
        System.out.println("setFechaNacimiento");
        long fechaNacimiento = 0L;
        Usuario instance = new Usuario();
        instance.setFechaNacimiento(fechaNacimiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class Usuario.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class Usuario.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        Integer activo = null;
        Usuario instance = new Usuario();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isActivoBool method, of class Usuario.
     */
    @Test
    public void testIsActivoBool() {
        System.out.println("isActivoBool");
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.isActivoBool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivoBool method, of class Usuario.
     */
    @Test
    public void testSetActivoBool() {
        System.out.println("setActivoBool");
        boolean activoBool = false;
        Usuario instance = new Usuario();
        instance.setActivoBool(activoBool);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Usuario.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setApellidos method, of class Usuario.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Usuario instance = new Usuario();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCelular method, of class Usuario.
     */
    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCelular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCelular method, of class Usuario.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        String celular = "";
        Usuario instance = new Usuario();
        instance.setCelular(celular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClave method, of class Usuario.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getClave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setClave method, of class Usuario.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        Usuario instance = new Usuario();
        instance.setClave(clave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Usuario.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCodigo method, of class Usuario.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Usuario instance = new Usuario();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescipcion method, of class Usuario.
     */
    @Test
    public void testGetDescipcion() {
        System.out.println("getDescipcion");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getDescipcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDescipcion method, of class Usuario.
     */
    @Test
    public void testSetDescipcion() {
        System.out.println("setDescipcion");
        String descipcion = "";
        Usuario instance = new Usuario();
        instance.setDescipcion(descipcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Usuario.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setDni method, of class Usuario.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        String dni = "";
        Usuario instance = new Usuario();
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecBaja method, of class Usuario.
     */
    @Test
    public void testGetFecBaja() {
        System.out.println("getFecBaja");
        Usuario instance = new Usuario();
        long expResult = 0L;
        long result = instance.getFecBaja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFecBaja method, of class Usuario.
     */
    @Test
    public void testSetFecBaja() {
        System.out.println("setFecBaja");
        long fecBaja = 0L;
        Usuario instance = new Usuario();
        instance.setFecBaja(fecBaja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecRegistro method, of class Usuario.
     */
    @Test
    public void testGetFecRegistro() {
        System.out.println("getFecRegistro");
        Usuario instance = new Usuario();
        long expResult = 0L;
        long result = instance.getFecRegistro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFecRegistro method, of class Usuario.
     */
    @Test
    public void testSetFecRegistro() {
        System.out.println("setFecRegistro");
        long fecRegistro = 0L;
        Usuario instance = new Usuario();
        instance.setFecRegistro(fecRegistro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFono method, of class Usuario.
     */
    @Test
    public void testGetFono() {
        System.out.println("getFono");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getFono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFono method, of class Usuario.
     */
    @Test
    public void testSetFono() {
        System.out.println("setFono");
        String fono = "";
        Usuario instance = new Usuario();
        instance.setFono(fono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFono2 method, of class Usuario.
     */
    @Test
    public void testGetFono2() {
        System.out.println("getFono2");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getFono2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFono2 method, of class Usuario.
     */
    @Test
    public void testSetFono2() {
        System.out.println("setFono2");
        String fono2 = "";
        Usuario instance = new Usuario();
        instance.setFono2(fono2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoto method, of class Usuario.
     */
    @Test
    public void testGetFoto_0args() {
        System.out.println("getFoto");
        Usuario instance = new Usuario();
        FileInputStream expResult = null;
        FileInputStream result = instance.getFoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setFoto method, of class Usuario.
     */
    @Test
    public void testSetFoto() {
        System.out.println("setFoto");
        FileInputStream foto = null;
        Usuario instance = new Usuario();
        instance.setFoto(foto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFotoDA method, of class Usuario.
     */
    @Test
    public void testSetFotoDA_FileInputStream_int() {
        System.out.println("setFotoDA");
        FileInputStream foto = null;
        int longitud = 0;
        Usuario instance = new Usuario();
        instance.setFotoDA(foto, longitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFotoDA method, of class Usuario.
     */
    @Test
    public void testSetFotoDA_DatoArchivo() {
        System.out.println("setFotoDA");
        DatoArchivo dat = null;
        Usuario instance = new Usuario();
        instance.setFotoDA(dat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFoto method, of class Usuario.
     */
    @Test
    public void testGetFoto_String() {
        System.out.println("getFoto");
        String s = "";
        Usuario instance = new Usuario();
        DatoArchivo expResult = null;
        DatoArchivo result = instance.getFoto(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getIdu method, of class Usuario.
     */
    @Test
    public void testGetIdu() {
        System.out.println("getIdu");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getIdu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdu method, of class Usuario.
     */
    @Test
    public void testSetIdu() {
        System.out.println("setIdu");
        Integer idu = null;
        Usuario instance = new Usuario();
        instance.setIdu(idu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Usuario.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setLogin method, of class Usuario.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Usuario instance = new Usuario();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextel method, of class Usuario.
     */
    @Test
    public void testGetNextel() {
        System.out.println("getNextel");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNextel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNextel method, of class Usuario.
     */
    @Test
    public void testSetNextel() {
        System.out.println("setNextel");
        String nextel = "";
        Usuario instance = new Usuario();
        instance.setNextel(nextel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalt method, of class Usuario.
     */
    @Test
    public void testGetSalt() {
        System.out.println("getSalt");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getSalt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setSalt method, of class Usuario.
     */
    @Test
    public void testSetSalt() {
        System.out.println("setSalt");
        String salt = "";
        Usuario instance = new Usuario();
        instance.setSalt(salt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Usuario.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Object obj = null;
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getSexo(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setSexo method, of class Usuario.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Usuario instance = new Usuario();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encriptarPass method, of class Usuario.
     */
    @Test
    public void testEncriptarPass() {
        System.out.println("encriptarPass");
        Usuario instance = new Usuario();
        instance.encriptarPass();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desencriptarPass method, of class Usuario.
     */
    @Test
    public void testDesencriptarPass() {
        System.out.println("desencriptarPass");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.desencriptarPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getTipoCargo method, of class Usuario.
     */
    @Test
    public void testGetTipoCargo() {
        System.out.println("getTipoCargo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTipoCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTipoCargo method, of class Usuario.
     */
    @Test
    public void testSetTipoCargo() {
        System.out.println("setTipoCargo");
        String tipoCargo = "";
        Usuario instance = new Usuario();
        instance.setTipoCargo(tipoCargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoCargoAlmacen method, of class Usuario.
     */
    @Test
    public void testGetTipoCargoAlmacen() {
        System.out.println("getTipoCargoAlmacen");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTipoCargoAlmacen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTipoCargoAlmacen method, of class Usuario.
     */
    @Test
    public void testSetTipoCargoAlmacen() {
        System.out.println("setTipoCargoAlmacen");
        String tipoCargoAlmacen = "";
        Usuario instance = new Usuario();
        instance.setTipoCargoAlmacen(tipoCargoAlmacen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of hashCode method, of class Usuario.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Usuario.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class Usuario.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        Usuario instance = new Usuario();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class Usuario.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        Usuario instance = new Usuario();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
