/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelbd;

import core.DatoArchivo;
import core.JAbstractModelBD;
import java.io.FileInputStream;
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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of getUbicacion method, of class Producto.
     */
    @Test
    public void testGetUbicacion() {
        System.out.println("getUbicacion");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getUbicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setUbicacion method, of class Producto.
     */
    @Test
    public void testSetUbicacion() {
        System.out.println("setUbicacion");
        String ubicacion = "";
        Producto instance = new Producto();
        instance.setUbicacion(ubicacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnidadPrincipal method, of class Producto.
     */
    @Test
    public void testGetUnidadPrincipal() {
        System.out.println("getUnidadPrincipal");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getUnidadPrincipal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setUnidadPrincipal method, of class Producto.
     */
    @Test
    public void testSetUnidadPrincipal() {
        System.out.println("setUnidadPrincipal");
        String unidadPrincipal = "";
        Producto instance = new Producto();
        instance.setUnidadPrincipal(unidadPrincipal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProducto method, of class Producto.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdProducto method, of class Producto.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        Integer idProducto = null;
        Producto instance = new Producto();
        instance.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoBarras method, of class Producto.
     */
    @Test
    public void testGetCodigoBarras() {
        System.out.println("getCodigoBarras");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getCodigoBarras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCodigoBarras method, of class Producto.
     */
    @Test
    public void testSetCodigoBarras() {
        System.out.println("setCodigoBarras");
        String codigoBarras = "";
        Producto instance = new Producto();
        instance.setCodigoBarras(codigoBarras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Producto.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCodigo method, of class Producto.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Producto instance = new Producto();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoDelFabricante method, of class Producto.
     */
    @Test
    public void testGetCodigoDelFabricante() {
        System.out.println("getCodigoDelFabricante");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getCodigoDelFabricante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCodigoDelFabricante method, of class Producto.
     */
    @Test
    public void testSetCodigoDelFabricante() {
        System.out.println("setCodigoDelFabricante");
        String codigoDelFabricante = "";
        Producto instance = new Producto();
        instance.setCodigoDelFabricante(codigoDelFabricante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosto method, of class Producto.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Producto instance = new Producto();
        Double expResult = null;
        Double result = instance.getCosto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCosto method, of class Producto.
     */
    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        Double costo = null;
        Producto instance = new Producto();
        instance.setCosto(costo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioAlMayor method, of class Producto.
     */
    @Test
    public void testGetPrecioAlMayor() {
        System.out.println("getPrecioAlMayor");
        Producto instance = new Producto();
        Double expResult = null;
        Double result = instance.getPrecioAlMayor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setPrecioAlMayor method, of class Producto.
     */
    @Test
    public void testSetPrecioAlMayor() {
        System.out.println("setPrecioAlMayor");
        Double precioAlMayor = null;
        Producto instance = new Producto();
        instance.setPrecioAlMayor(precioAlMayor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioAlMenor method, of class Producto.
     */
    @Test
    public void testGetPrecioAlMenor() {
        System.out.println("getPrecioAlMenor");
        Producto instance = new Producto();
        Double expResult = null;
        Double result = instance.getPrecioAlMenor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setPrecioAlMenor method, of class Producto.
     */
    @Test
    public void testSetPrecioAlMenor() {
        System.out.println("setPrecioAlMenor");
        Double precioAlMenor = null;
        Producto instance = new Producto();
        instance.setPrecioAlMenor(precioAlMenor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilidad method, of class Producto.
     */
    @Test
    public void testGetUtilidad() {
        System.out.println("getUtilidad");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getUtilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setUtilidad method, of class Producto.
     */
    @Test
    public void testSetUtilidad() {
        System.out.println("setUtilidad");
        Integer utilidad = null;
        Producto instance = new Producto();
        instance.setUtilidad(utilidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAplicaIGV method, of class Producto.
     */
    @Test
    public void testGetAplicaIGV() {
        System.out.println("getAplicaIGV");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getAplicaIGV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setAplicaIGV method, of class Producto.
     */
    @Test
    public void testSetAplicaIGV() {
        System.out.println("setAplicaIGV");
        Integer aplicaIGV = null;
        Producto instance = new Producto();
        instance.setAplicaIGV(aplicaIGV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStockMinimo method, of class Producto.
     */
    @Test
    public void testGetStockMinimo() {
        System.out.println("getStockMinimo");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getStockMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setStockMinimo method, of class Producto.
     */
    @Test
    public void testSetStockMinimo() {
        System.out.println("setStockMinimo");
        Integer stockMinimo = null;
        Producto instance = new Producto();
        instance.setStockMinimo(stockMinimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Producto.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setTipo method, of class Producto.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Producto instance = new Producto();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdMoneda method, of class Producto.
     */
    @Test
    public void testGetIdMoneda() {
        System.out.println("getIdMoneda");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getIdMoneda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdMoneda method, of class Producto.
     */
    @Test
    public void testSetIdMoneda() {
        System.out.println("setIdMoneda");
        Integer idMoneda = null;
        Producto instance = new Producto();
        instance.setIdMoneda(idMoneda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Producto.
     */
    @Test
    public void testGetImagen_0args() {
        System.out.println("getImagen");
        Producto instance = new Producto();
        FileInputStream expResult = null;
        FileInputStream result = instance.getImagen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setImagen method, of class Producto.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        FileInputStream imagen = null;
        Producto instance = new Producto();
        instance.setImagen(imagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagenDA method, of class Producto.
     */
    @Test
    public void testSetImagenDA_FileInputStream_int() {
        System.out.println("setImagenDA");
        FileInputStream foto = null;
        int longitud = 0;
        Producto instance = new Producto();
        instance.setImagenDA(foto, longitud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagenDA method, of class Producto.
     */
    @Test
    public void testSetImagenDA_DatoArchivo() {
        System.out.println("setImagenDA");
        DatoArchivo dat = null;
        Producto instance = new Producto();
        instance.setImagenDA(dat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Producto.
     */
    @Test
    public void testGetImagen_String() {
        System.out.println("getImagen");
        String s = "";
        Producto instance = new Producto();
        DatoArchivo expResult = null;
        DatoArchivo result = instance.getImagen(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getIdClase method, of class Producto.
     */
    @Test
    public void testGetIdClase() {
        System.out.println("getIdClase");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getIdClase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdClase method, of class Producto.
     */
    @Test
    public void testSetIdClase() {
        System.out.println("setIdClase");
        Integer idClase = null;
        Producto instance = new Producto();
        instance.setIdClase(idClase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdMarca method, of class Producto.
     */
    @Test
    public void testGetIdMarca() {
        System.out.println("getIdMarca");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getIdMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdMarca method, of class Producto.
     */
    @Test
    public void testSetIdMarca() {
        System.out.println("setIdMarca");
        Integer idMarca = null;
        Producto instance = new Producto();
        instance.setIdMarca(idMarca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdModelo method, of class Producto.
     */
    @Test
    public void testGetIdModelo() {
        System.out.println("getIdModelo");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getIdModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setIdModelo method, of class Producto.
     */
    @Test
    public void testSetIdModelo() {
        System.out.println("setIdModelo");
        Integer idModelo = null;
        Producto instance = new Producto();
        instance.setIdModelo(idModelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class Producto.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Producto instance = new Producto();
        Double expResult = null;
        Double result = instance.getPeso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setPeso method, of class Producto.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        Double peso = null;
        Producto instance = new Producto();
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivo method, of class Producto.
     */
    @Test
    public void testGetActivo() {
        System.out.println("getActivo");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getActivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setActivo method, of class Producto.
     */
    @Test
    public void testSetActivo() {
        System.out.println("setActivo");
        Integer activo = null;
        Producto instance = new Producto();
        instance.setActivo(activo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Producto.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of equals method, of class Producto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Producto instance = new Producto();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class Producto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of clone method, of class Producto.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Producto instance = new Producto();
        Object expResult = null;
        Object result = instance.clone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarObjeto method, of class Producto.
     */
    @Test
    public void testLlenarObjeto() {
        System.out.println("llenarObjeto");
        ResultSet rs = null;
        Producto instance = new Producto();
        JAbstractModelBD expResult = null;
        JAbstractModelBD result = instance.llenarObjeto(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of llenarValores method, of class Producto.
     */
    @Test
    public void testLlenarValores() {
        System.out.println("llenarValores");
        Producto instance = new Producto();
        Object[] expResult = null;
        Object[] result = instance.llenarValores();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }
    
}
