/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toshiba
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
        int dx = 5;
        int dy = 7;
        Point instance = new Point();
        Point temp = new Point(); 
        temp.setAbsis(instance.getAbsis());
        temp.setOrdinat(instance.getOrdinat());
        instance.geser(dx, dy);
        assertTrue(((instance.getAbsis()-dx) == temp.getAbsis()) && ((instance.getOrdinat()-dy) == temp.getOrdinat()));
    }

    /**
     * Test of getAbsis method, of class Point.
     */
    @Test
    public void testGetAbsis() {
        System.out.println("getAbsis");
        Point instance = new Point();
        int expResult = 6;
        instance.setAbsis(expResult);
        int result = instance.getAbsis();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrdinat method, of class Point.
     */
    @Test
    public void testGetOrdinat() {
        System.out.println("getOrdinat");
        Point instance = new Point();
        int expResult = 873;
        instance.setOrdinat(expResult);
        int result = instance.getOrdinat();
        assertEquals(expResult, result);
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
        assertTrue(true);
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
        assertTrue(true);
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Point instance = new Point();
        String expResult = instance.getAbsis()+" "+instance.getOrdinat();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
