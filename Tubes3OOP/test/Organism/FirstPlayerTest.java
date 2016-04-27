/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

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
public class FirstPlayerTest {
    
    public FirstPlayerTest() {
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
     * Test of setArah method, of class FirstPlayer.
     */
    @Test
    public void testSetArah() {
        System.out.println("setArah");
        int i = 0;
        FirstPlayer instance = new FirstPlayer();
        instance.setArah(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class FirstPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        FirstPlayer instance = new FirstPlayer();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMati method, of class FirstPlayer.
     */
    @Test
    public void testSetMati() {
        System.out.println("setMati");
        boolean t = false;
        FirstPlayer instance = new FirstPlayer();
        instance.setMati(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of name method, of class FirstPlayer.
     */
    @Test
    public void testName() {
        System.out.println("name");
        FirstPlayer instance = new FirstPlayer();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMati method, of class FirstPlayer.
     */
    @Test
    public void testIsMati() {
        System.out.println("isMati");
        FirstPlayer instance = new FirstPlayer();
        boolean expResult = false;
        boolean result = instance.isMati();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKecepatan method, of class FirstPlayer.
     */
    @Test
    public void testGetKecepatan() {
        System.out.println("getKecepatan");
        FirstPlayer instance = new FirstPlayer();
        int expResult = 0;
        int result = instance.getKecepatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWin method, of class FirstPlayer.
     */
    @Test
    public void testGetWin() {
        System.out.println("getWin");
        FirstPlayer instance = new FirstPlayer();
        int expResult = 0;
        int result = instance.getWin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class FirstPlayer.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        FirstPlayer instance = new FirstPlayer();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Reaction method, of class FirstPlayer.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        Organisme M = null;
        FirstPlayer instance = new FirstPlayer();
        instance.Reaction(M);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
