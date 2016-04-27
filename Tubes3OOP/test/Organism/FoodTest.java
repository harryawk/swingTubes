/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Movement.Point;
import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CXXXV
 */
public class FoodTest {
    
    public FoodTest() {
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
     * Test of setPosition method, of class Food.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Point P = null;
        Food instance = new Food();
        instance.setPosition(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArah method, of class Food.
     */
    @Test
    public void testSetArah() {
        System.out.println("setArah");
        int i = 0;
        Food instance = new Food();
        instance.setArah(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKecepatan method, of class Food.
     */
    @Test
    public void testSetKecepatan() {
        System.out.println("setKecepatan");
        Food instance = new Food();
        instance.setKecepatan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Food.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Food instance = new Food();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class Food.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Food instance = new Food();
        Point expResult = null;
        Point result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Food.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Food instance = new Food();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKecepatan method, of class Food.
     */
    @Test
    public void testGetKecepatan() {
        System.out.println("getKecepatan");
        Food instance = new Food();
        int expResult = 0;
        int result = instance.getKecepatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMati method, of class Food.
     */
    @Test
    public void testSetMati() {
        System.out.println("setMati");
        boolean t = false;
        Food instance = new Food();
        instance.setMati(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of name method, of class Food.
     */
    @Test
    public void testName() {
        System.out.println("name");
        Food instance = new Food();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMati method, of class Food.
     */
    @Test
    public void testIsMati() {
        System.out.println("isMati");
        Food instance = new Food();
        boolean expResult = false;
        boolean result = instance.isMati();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Reaction method, of class Food.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        Organisme M = null;
        Food instance = new Food();
        instance.Reaction(M);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRadius method, of class Food.
     */
    @Test
    public void testIsRadius() {
        System.out.println("isRadius");
        int rad = 0;
        Point p = null;
        Food instance = new Food();
        boolean expResult = false;
        boolean result = instance.isRadius(rad, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of boundaryRespon method, of class Food.
     */
    @Test
    public void testBoundaryRespon() {
        System.out.println("boundaryRespon");
        Food instance = new Food();
        instance.boundaryRespon();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
