/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhluk2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aditio Pangestu
 */
public class MakhlukHidupTest {
    
    public MakhlukHidupTest() {
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
     * Test of menua method, of class MakhlukHidup.
     */
    @Test
    public void testMenua() {
        System.out.println("menua");
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.menua();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMati method, of class MakhlukHidup.
     */
    @Test
    public void testIsMati() {
        System.out.println("isMati");
        MakhlukHidup instance = new MakhlukHidupImpl();
        boolean expResult = false;
        boolean result = instance.isMati();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_umur method, of class MakhlukHidup.
     */
    @Test
    public void testGet_umur() {
        System.out.println("get_umur");
        MakhlukHidup instance = new MakhlukHidupImpl();
        int expResult = 0;
        int result = instance.get_umur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_ulang_tahun method, of class MakhlukHidup.
     */
    @Test
    public void testGet_ulang_tahun() {
        System.out.println("get_ulang_tahun");
        MakhlukHidup instance = new MakhlukHidupImpl();
        int expResult = 0;
        int result = instance.get_ulang_tahun();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_DNA method, of class MakhlukHidup.
     */
    @Test
    public void testGet_DNA() {
        System.out.println("get_DNA");
        MakhlukHidup instance = new MakhlukHidupImpl();
        char expResult = ' ';
        char result = instance.get_DNA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_batas_umur method, of class MakhlukHidup.
     */
    @Test
    public void testGet_batas_umur() {
        System.out.println("get_batas_umur");
        MakhlukHidup instance = new MakhlukHidupImpl();
        int expResult = 0;
        int result = instance.get_batas_umur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosisi method, of class MakhlukHidup.
     */
    @Test
    public void testGetPosisi() {
        System.out.println("getPosisi");
        MakhlukHidup instance = new MakhlukHidupImpl();
        Point expResult = null;
        Point result = instance.getPosisi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecPosisi method, of class MakhlukHidup.
     */
    @Test
    public void testGetPrecPosisi() {
        System.out.println("getPrecPosisi");
        MakhlukHidup instance = new MakhlukHidupImpl();
        Point expResult = null;
        Point result = instance.getPrecPosisi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPredator method, of class MakhlukHidup.
     */
    @Test
    public void testGetPredator() {
        System.out.println("getPredator");
        int i = 0;
        MakhlukHidup instance = new MakhlukHidupImpl();
        char expResult = ' ';
        char result = instance.getPredator(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUkuranPredator method, of class MakhlukHidup.
     */
    @Test
    public void testGetUkuranPredator() {
        System.out.println("getUkuranPredator");
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.
        int expResult = 0;
        int result = instance.getUkuranPredator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of set_umur method, of class MakhlukHidup.
     */
    @Test
    public void testSet_umur() {
        System.out.println("set_umur");
        int a = 0;
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.set_umur(a);
        insta
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_batas_umur method, of class MakhlukHidup.
     */
    @Test
    public void testSet_batas_umur() {
        System.out.println("set_batas_umur");
        int a = 0;
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.set_batas_umur(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_ulang_tahun method, of class MakhlukHidup.
     */
    @Test
    public void testSet_ulang_tahun() {
        System.out.println("set_ulang_tahun");
        int a = 0;
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.set_ulang_tahun(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_DNA method, of class MakhlukHidup.
     */
    @Test
    public void testSet_DNA() {
        System.out.println("set_DNA");
        char a = ' ';
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.set_DNA(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosisi method, of class MakhlukHidup.
     */
    @Test
    public void testSetPosisi() {
        System.out.println("setPosisi");
        Point P = null;
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.setPosisi(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecPosisi method, of class MakhlukHidup.
     */
    @Test
    public void testSetPrecPosisi() {
        System.out.println("setPrecPosisi");
        Point P = null;
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.setPrecPosisi(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPredator method, of class MakhlukHidup.
     */
    @Test
    public void testSetPredator() {
        System.out.println("setPredator");
        int i = 0;
        char _predator = ' ';
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.setPredator(i, _predator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMati method, of class MakhlukHidup.
     */
    @Test
    public void testSetMati() {
        System.out.println("setMati");
        boolean _mati = false;
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.setMati(_mati);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPredator method, of class MakhlukHidup.
     */
    @Test
    public void testIsPredator() {
        System.out.println("isPredator");
        char DNA_predator = ' ';
        MakhlukHidup instance = new MakhlukHidupImpl();
        boolean expResult = false;
        boolean result = instance.isPredator(DNA_predator);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRadius method, of class MakhlukHidup.
     */
    @Test
    public void testIsRadius() {
        System.out.println("isRadius");
        int rad = 0;
        Point p = null;
        MakhlukHidup instance = new MakhlukHidupImpl();
        boolean expResult = false;
        boolean result = instance.isRadius(rad, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Reaction method, of class MakhlukHidup.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        MakhlukHidup M = null;
        MakhlukHidup instance = new MakhlukHidupImpl();
        instance.Reaction(M);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MakhlukHidupImpl extends MakhlukHidup {

        public void Reaction(MakhlukHidup M) {
        }
    }
    
}
