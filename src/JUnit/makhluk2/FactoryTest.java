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
public class FactoryTest {
    
    public FactoryTest() {
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
     * Test of makePohon method, of class Factory.
     */
    @Test
    public void testMakePohon() {
        System.out.println("makePohon");
        Tumbuhan t = null;
        Factory.makePohon(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeRumput method, of class Factory.
     */
    @Test
    public void testMakeRumput() {
        System.out.println("makeRumput");
        Tumbuhan t = null;
        Factory.makeRumput(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeGajah method, of class Factory.
     */
    @Test
    public void testMakeGajah() {
        System.out.println("makeGajah");
        Herbivora h = null;
        Factory.makeGajah(h);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeUnta method, of class Factory.
     */
    @Test
    public void testMakeUnta() {
        System.out.println("makeUnta");
        Herbivora h = null;
        Factory.makeUnta(h);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
