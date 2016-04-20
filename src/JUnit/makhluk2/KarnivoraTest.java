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
public class KarnivoraTest {
    
    public KarnivoraTest() {
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
     * Test of setMelambat method, of class Karnivora.
     */
    @Test
    public void testSetMelambat() {
        System.out.println("setMelambat");
        boolean lambat = false;
        Karnivora instance = new Karnivora();
        instance.setMelambat(lambat);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(!instance.getMelambat());
    }

    /**
     * Test of setDeltaKecepatan method, of class Karnivora.
     */
    @Test
    public void testSetDeltaKecepatan() {
        System.out.println("setDeltaKecepatan");
        int delta = 3;
        Karnivora instance = new Karnivora();
        instance.setDeltaKecepatan(delta);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getDeltaKecepatan() == 3);
    }

    /**
     * Test of getMelambat method, of class Karnivora.
     */
    @Test
    public void testGetMelambat() {
        System.out.println("getMelambat");
        Karnivora instance = new Karnivora();
        boolean expResult = false;
        instance.setMelambat(expResult);
        boolean result = instance.getMelambat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDeltaKecepatan method, of class Karnivora.
     */
    @Test
    public void testGetDeltaKecepatan() {
        System.out.println("getDeltaKecepatan");
        Karnivora instance = new Karnivora();
        int expResult = 4;
        instance.setDeltaKecepatan(expResult);
        int result = instance.getDeltaKecepatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of prosesMelambat method, of class Karnivora.
     */
    @Test
    public void testProsesMelambat() {
        System.out.println("prosesMelambat");
        Karnivora instance = new Karnivora();
        instance.set_maks_tingkat_kekenyangan(6);
        instance.set_tingkat_kekenyangan(5);
        instance.prosesMelambat();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getMelambat());
    }

    /**
     * Test of Reaction method, of class Karnivora.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        Point posisi = new Point(3,4);
        Herbivora gajah = new Herbivora();
        Factory.makeGajah(gajah);
        gajah.setPosisi(posisi);
        Karnivora instance = new Karnivora();
        Factory.makeHarimau(instance);
        instance.setPosisi(posisi);
        instance.set_tingkat_kekenyangan(4);
        instance.set_maks_tingkat_kekenyangan(8);
        instance.Reaction(gajah);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.get_tingkat_kekenyangan() == 8);
    }
    
}
