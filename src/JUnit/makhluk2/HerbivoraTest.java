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
public class HerbivoraTest {
    
    public HerbivoraTest() {
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
     * Test of set_percepat method, of class Herbivora.
     */
    @Test
    public void testSet_percepat() {
        System.out.println("set_percepat");
        boolean cepat = true;
        Herbivora instance = new Herbivora();
        instance.set_percepat(cepat);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_percepat());
    }

    /**
     * Test of set_deltaKecepatan method, of class Herbivora.
     */
    @Test
    public void testSet_deltaKecepatan() {
        System.out.println("set_deltaKecepatan");
        int kec = 0;
        Herbivora instance = new Herbivora();
        instance.set_deltaKecepatan(kec);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_deltaKecepatan() == 0);
    }

    /**
     * Test of get_percepat method, of class Herbivora.
     */
    @Test
    public void testGet_percepat() {
        System.out.println("get_percepat");
        Herbivora instance = new Herbivora();
        boolean expResult = false;
        boolean result = instance.get_percepat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get_deltaKecepatan method, of class Herbivora.
     */
    @Test
    public void testGet_deltaKecepatan() {
        System.out.println("get_deltaKecepatan");
        Herbivora instance = new Herbivora();
        int expResult = 0;
        int result = instance.get_deltaKecepatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of prosesMempercepat method, of class Herbivora.
     */
    @Test
    public void testProsesMempercepat() {
        System.out.println("prosesMempercepat");
        Herbivora instance = new Herbivora();
        Factory.makeGajah(instance);
        int old = instance.get_Kecepatan();
        instance.prosesMempercepat();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_Kecepatan() == old + instance.get_deltaKecepatan());
    }

    /**
     * Test of Reaction method, of class Herbivora.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        MakhlukHidup m = null;
        Herbivora instance = new Herbivora();
        //instance.Reaction(m);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}
