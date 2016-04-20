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
public class OmnivoraTest {
    
    public OmnivoraTest() {
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
     * Test of memuda method, of class Omnivora.
     */
    @Test
    public void testMemuda() {
        System.out.println("memuda");
        Omnivora instance = new Omnivora();
        instance.memuda();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTumbuhan method, of class Omnivora.
     */
    @Test
    public void testIsTumbuhan() {
        System.out.println("isTumbuhan");
        MakhlukHidup M = null;
        Omnivora instance = new Omnivora();
        boolean expResult = false;
        boolean result = instance.isTumbuhan(M);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Reaction method, of class Omnivora.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        MakhlukHidup M = null;
        Omnivora instance = new Omnivora();
        instance.Reaction(M);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
