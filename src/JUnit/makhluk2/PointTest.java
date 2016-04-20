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
public class PointTest {
    
    public PointTest() {
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
     * Test of geser method, of class Point.
     */
    @Test
    public void testGeser() {
        System.out.println("geser");
        int dx = 0;
        int dy = 0;
        Point instance = new Point();
        instance.geser(dx, dy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbsis method, of class Point.
     */
    @Test
    public void testGetAbsis() {
        System.out.println("getAbsis");
        Point instance = new Point();
        int expResult = 0;
        int result = instance.getAbsis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdinat method, of class Point.
     */
    @Test
    public void testGetOrdinat() {
        System.out.println("getOrdinat");
        Point instance = new Point();
        int expResult = 0;
        int result = instance.getOrdinat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAbsis method, of class Point.
     */
    @Test
    public void testSetAbsis() {
        System.out.println("setAbsis");
        int _x = 0;
        Point instance = new Point();
        instance.setAbsis(_x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrdinat method, of class Point.
     */
    @Test
    public void testSetOrdinat() {
        System.out.println("setOrdinat");
        int _y = 0;
        Point instance = new Point();
        instance.setOrdinat(_y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Point instance = new Point();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
