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
public class HewanTest {
    
    public HewanTest() {
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
     * Test of setLapar method, of class Hewan.
     */
    @Test
    public void testSetLapar() {
        System.out.println("setLapar");
        Hewan instance = new HewanImpl();
        instance.setLapar();
        instance.set_tingkat_kekenyangan(20);
        instance.set_maks_tingkat_kekenyangan(15);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_lapar());
    }

    /**
     * Test of set_tingkat_kekenyangan method, of class Hewan.
     */
    @Test
    public void testSet_tingkat_kekenyangan() {
        System.out.println("set_tingkat_kekenyangan");
        int kenyang = 18;
        Hewan instance = new HewanImpl();
        instance.set_tingkat_kekenyangan(kenyang);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_tingkat_kekenyangan() == 18);
    }

    /**
     * Test of set_Kecepatan method, of class Hewan.
     */
    @Test
    public void testSet_Kecepatan() {
        System.out.println("set_Kecepatan");
        int kec = 23;
        Hewan instance = new HewanImpl();
        instance.set_Kecepatan(kec);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_Kecepatan() == 23);
    }

    /**
     * Test of set_maks_tingkat_kekenyangan method, of class Hewan.
     */
    @Test
    public void testSet_maks_tingkat_kekenyangan() {
        System.out.println("set_maks_tingkat_kekenyangan");
        int maks = 34;
        Hewan instance = new HewanImpl();
        instance.set_maks_tingkat_kekenyangan(maks);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_maks_tingkat_kekenyangan() == 34);
    }

    /**
     * Test of setMemburu method, of class Hewan.
     */
    @Test
    public void testSetMemburu() {
        System.out.println("setMemburu");
        boolean M = false;
        Hewan instance = new HewanImpl();
        instance.setMemburu(M);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(!instance.getMemburu());
    }

    /**
     * Test of setSedangMemburu method, of class Hewan.
     */
    @Test
    public void testSetSedangMemburu() {
        System.out.println("setSedangMemburu");
        boolean s = false;
        Hewan instance = new HewanImpl();
        instance.setSedangMemburu(s);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(!instance.getSedangMemburu());
    }

    /**
     * Test of setTarget method, of class Hewan.
     */
    @Test
    public void testSetTarget() {
        System.out.println("setTarget");
        int i = 3;
        char _target = ' ';
        char[] tempTarget = new char[20]; 
        Hewan instance = new HewanImpl();
        instance.setTarget(i, _target);
        
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getTarget()[3] == ' ');
    }

    /**
     * Test of set_Arah method, of class Hewan.
     */
    @Test
    public void testSet_Arah() {
        System.out.println("set_Arah");
        int _arah = 0;
        Hewan instance = new HewanImpl();
        instance.set_Arah(_arah);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_Arah() == 0);
    }

    /**
     * Test of set_Arah_Bebas method, of class Hewan.
     */
    @Test
    public void testSet_Arah_Bebas() {
        System.out.println("set_Arah_Bebas");
        Hewan instance = new HewanImpl();
        instance.set_Arah_Bebas();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_Arah() < 9);
    }

    /**
     * Test of set_Arah_Memburu method, of class Hewan.
     */
    @Test
    public void testSet_Arah_Memburu() {
        System.out.println("set_Arah_Memburu");
        Point Awal = new Point(0,0);
        Point Target = new Point (0,-2);
        Hewan instance = new HewanImpl();
        instance.set_Arah_Memburu(Awal, Target);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_Arah() == 1);
    }

    /**
     * Test of set_Arah_Menjauh method, of class Hewan.
     */
    @Test
    public void testSet_Arah_Menjauh() {
        System.out.println("set_Arah_Menjauh");
        Point Awal = new Point(0,0);
        Point Predator = new Point (0,-2);
        Hewan instance = new HewanImpl();
        instance.set_Arah_Menjauh(Awal, Predator);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_Arah() == 5);
    }

    /**
     * Test of get_tingkat_kekenyangan method, of class Hewan.
     */
    @Test
    public void testGet_tingkat_kekenyangan() {
        System.out.println("get_tingkat_kekenyangan");
        Hewan instance = new HewanImpl();
        int expResult = 4;
        instance.set_tingkat_kekenyangan(expResult);
        int result = instance.get_tingkat_kekenyangan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get_maks_tingkat_kekenyangan method, of class Hewan.
     */
    @Test
    public void testGet_maks_tingkat_kekenyangan() {
        System.out.println("get_maks_tingkat_kekenyangan");
        Hewan instance = new HewanImpl();
        int expResult = 6;
        instance.set_maks_tingkat_kekenyangan(expResult);
        int result = instance.get_maks_tingkat_kekenyangan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get_lapar method, of class Hewan.
     */
    @Test
    public void testGet_lapar() {
        System.out.println("get_lapar");
        Hewan instance = new HewanImpl();
        boolean expResult = true;
        instance.set_tingkat_kekenyangan(4);
        instance.set_maks_tingkat_kekenyangan(5);
        instance.setLapar();
        boolean result = instance.get_lapar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSedangMemburu method, of class Hewan.
     */
    @Test
    public void testGetSedangMemburu() {
        System.out.println("getSedangMemburu");
        Hewan instance = new HewanImpl();
        boolean expResult = false;
        boolean result = instance.getSedangMemburu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTarget method, of class Hewan.
     */
    @Test
    public void testGetTarget() {
        System.out.println("getTarget");
        Hewan instance = new HewanImpl();
        char[] expResult = new char[20];
        expResult[0] = 'a';
        expResult[1] = 'b';
        expResult[2] = 'c';
        char[] result = instance.getTarget();
        instance.setTarget(0, 'a');
        instance.setTarget(1, 'b');
        instance.setTarget(2, 'c');
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMemburu method, of class Hewan.
     */
    @Test
    public void testGetMemburu() {
        System.out.println("getMemburu");
        Hewan instance = new HewanImpl();
        boolean expResult = false;
        boolean result = instance.getMemburu();
        instance.setMemburu(expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isTarget method, of class Hewan.
     */
    @Test
    public void testIsTarget() {
        System.out.println("isTarget");
        char _target = ' ';
        Hewan instance = new HewanImpl();
        boolean expResult = false;
        instance.setTarget(0, '3');
        boolean result = instance.isTarget(_target);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get_Kecepatan method, of class Hewan.
     */
    @Test
    public void testGet_Kecepatan() {
        System.out.println("get_Kecepatan");
        Hewan instance = new HewanImpl();
        int expResult = 0;
        instance.set_Kecepatan(expResult);
        int result = instance.get_Kecepatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get_Arah method, of class Hewan.
     */
    @Test
    public void testGet_Arah() {
        System.out.println("get_Arah");
        Hewan instance = new HewanImpl();
        int expResult = 0;
        instance.set_Arah(expResult);
        int result = instance.get_Arah();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hewanMati method, of class Hewan.
     */
    @Test
    public void testHewanMati() {
        System.out.println("hewanMati");
        Hewan instance = new HewanImpl();
        instance.set_tingkat_kekenyangan(0);
        instance.hewanMati();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.isMati());
    }

    /**
     * Test of gerak_berarah method, of class Hewan.
     */
    @Test
    public void testGerak_berarah_Point() {
        System.out.println("gerak_berarah");
        Point Awal = new Point (0,0);
        Hewan instance = new HewanImpl();
        Point expResult = new Point (1,0);
        instance.set_Arah(3);
        Point result = instance.gerak_berarah(Awal);
        assertEquals(expResult.getAbsis(), result.getAbsis());
        assertEquals(expResult.getOrdinat(), result.getOrdinat());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of gerak_berarah method, of class Hewan.
     */
    @Test
    public void testGerak_berarah_0args() {
        System.out.println("gerak_berarah");
        Hewan instance = new HewanImpl();
        instance.gerak_berarah();
        // TODO review the generated test code and remove the default call to fail.
    }

    public class HewanImpl extends Hewan {
        public void Reaction(MakhlukHidup M) {
        }
    }
    
}
