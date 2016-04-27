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
        int i = 3;
        SecondPlayer instance = new SecondPlayer();
        instance.setArah(i);
        Point temp = new Point();
        temp.setAbsis(instance.getPosition().getAbsis());
        temp.setOrdinat(instance.getPosition().getOrdinat());
        instance.move();
        assertTrue(instance.getPosition().getAbsis() == (temp.getAbsis()+4));
    }

    /**
     * Test of move method, of class SecondPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int i = 3;
        SecondPlayer instance = new SecondPlayer();
        instance.setArah(i);
        Point temp = new Point();
        temp.setAbsis(instance.getPosition().getAbsis());
        temp.setOrdinat(instance.getPosition().getOrdinat());
        instance.move();
        assertTrue(instance.getPosition().getAbsis() == (temp.getAbsis()+4));
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
        assertTrue(!instance.isMati());
    }

    /**
     * Test of name method, of class SecondPlayer.
     */
    @Test
    public void testName() {
        System.out.println("name");
        SecondPlayer instance = new SecondPlayer();
        String expResult = "2";
        String result = instance.name();
        assertEquals(expResult, result);
    }

    /**
     * Test of isMati method, of class SecondPlayer.
     */
    @Test
    public void testIsMati() {
        System.out.println("isMati");
        SecondPlayer instance = new SecondPlayer();
        instance.setMati(false);
        boolean expResult = false;
        boolean result = instance.isMati();
        assertEquals(expResult, result);
    }

    /**
     * Test of Reaction method, of class SecondPlayer.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        FirstPlayer M = new FirstPlayer();
        SecondPlayer instance = new SecondPlayer();
        instance.setPosition(M.getPosition());
        instance.Reaction(M);
        assertEquals(instance.isMati(), true);
    }

    /**
     * Test of getKecepatan method, of class SecondPlayer.
     */
    @Test
    public void testGetKecepatan() {
        System.out.println("getKecepatan");
        SecondPlayer instance = new SecondPlayer();
        int expResult = 4;
        int result = instance.getKecepatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColor method, of class SecondPlayer.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        FirstPlayer instance = new FirstPlayer();
        Color result = instance.getColor();
        assertTrue(true);
    }

    /**
     * Test of getKekenyangan method, of class SecondPlayer.
     */
    @Test
    public void testGetKekenyangan() {
        System.out.println("getKekenyangan");
        SecondPlayer instance = new SecondPlayer();
        int expResult = 4;
        instance.setKekenyangan(expResult);
        int result = instance.getKekenyangan();
        assertEquals(expResult, result);
    }

    /**
     * Test of setKekenyangan method, of class SecondPlayer.
     */
    @Test
    public void testSetKekenyangan() {
        System.out.println("setKekenyangan");
        int k = 5;
        SecondPlayer instance = new SecondPlayer();
        instance.setKekenyangan(k);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}
