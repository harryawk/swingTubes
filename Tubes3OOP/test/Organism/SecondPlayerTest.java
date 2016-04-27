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
public class SecondPlayerTest {
    
    public SecondPlayerTest() {
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
     * Test of setArah method, of class SecondPlayer.
     */
    @Test
    public void testSetArah() {
        System.out.println("setArah");
        int i = 0;
        SecondPlayer instance = new SecondPlayer();
        instance.setArah(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class SecondPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        SecondPlayer instance = new SecondPlayer();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMati method, of class SecondPlayer.
     */
    @Test
    public void testSetMati() {
        System.out.println("setMati");
        boolean t = false;
        SecondPlayer instance = new SecondPlayer();
        instance.setMati(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of name method, of class SecondPlayer.
     */
    @Test
    public void testName() {
        System.out.println("name");
        SecondPlayer instance = new SecondPlayer();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMati method, of class SecondPlayer.
     */
    @Test
    public void testIsMati() {
        System.out.println("isMati");
        SecondPlayer instance = new SecondPlayer();
        boolean expResult = false;
        boolean result = instance.isMati();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Reaction method, of class SecondPlayer.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        Organisme M = null;
        SecondPlayer instance = new SecondPlayer();
        instance.Reaction(M);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKecepatan method, of class SecondPlayer.
     */
    @Test
    public void testGetKecepatan() {
        System.out.println("getKecepatan");
        SecondPlayer instance = new SecondPlayer();
        int expResult = 0;
        int result = instance.getKecepatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class SecondPlayer.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        SecondPlayer instance = new SecondPlayer();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKekenyangan method, of class SecondPlayer.
     */
    @Test
    public void testGetKekenyangan() {
        System.out.println("getKekenyangan");
        SecondPlayer instance = new SecondPlayer();
        int expResult = 0;
        int result = instance.getKekenyangan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKekenyangan method, of class SecondPlayer.
     */
    @Test
    public void testSetKekenyangan() {
        System.out.println("setKekenyangan");
        int k = 0;
        SecondPlayer instance = new SecondPlayer();
        instance.setKekenyangan(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
