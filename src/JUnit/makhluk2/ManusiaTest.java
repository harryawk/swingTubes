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
 * @author Ali-pc
 */
public class ManusiaTest {
    
    public ManusiaTest() {
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
     * Test of setMenghindar method, of class Manusia.
     */
    @Test
    public void testSetMenghindar() {
        System.out.println("setMenghindar");
        boolean m = true;
        Manusia instance = new ManusiaImpl();
        instance.setMenghindar(m);
        boolean expResult = true;
        boolean result = instance.getMenghindar();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMenghindar method, of class Manusia.
     */
    @Test
    public void testGetMenghindar() {
        System.out.println("getMenghindar");
        Manusia instance = new ManusiaImpl();
        boolean expResult = false;
        boolean result = instance.getMenghindar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of Reaction method, of class Manusia.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        MakhlukHidup M = null;
        Manusia instance = new ManusiaImpl();
        instance.Reaction(M);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    public class ManusiaImpl extends Manusia {

        public void Reaction(MakhlukHidup M) {
        }
    }
    
}
