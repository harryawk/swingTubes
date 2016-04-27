/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldOfPaint;

import Organism.FirstPlayer;
import Organism.Organisme;
import Organism.SecondPlayer;
import java.awt.Graphics;
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
public class WorldTest {
    
    public WorldTest() {
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
     * Test of cetak method, of class World.
     */
    @Test
    public void testCetak() {
        System.out.println("cetak");
        String string = "";
        World instance = new World();
        instance.cetak(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDisplay method, of class World.
     */
    @Test
    public void testUpdateDisplay() throws Exception {
        System.out.println("updateDisplay");
        World instance = new World();
        instance.updateDisplay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGame method, of class World.
     */
    @Test
    public void testUpdateGame() throws Exception {
        System.out.println("updateGame");
        World instance = new World();
        instance.updateGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class World.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Graphics g = null;
        World instance = new World();
        instance.clear(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class World.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        World instance = new World();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GameOver method, of class World.
     */
    @Test
    public void testGameOver() {
        System.out.println("GameOver");
        World instance = new World();
        boolean expResult = false;
        boolean result = instance.GameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class World.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Organisme o = null;
        World instance = new World();
        instance.add(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerPlayer1 method, of class World.
     */
    @Test
    public void testRegisterPlayer1() {
        System.out.println("registerPlayer1");
        FirstPlayer p = null;
        World instance = new World();
        instance.registerPlayer1(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerPlayer2 method, of class World.
     */
    @Test
    public void testRegisterPlayer2() {
        System.out.println("registerPlayer2");
        SecondPlayer p = null;
        World instance = new World();
        instance.registerPlayer2(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer1Direction method, of class World.
     */
    @Test
    public void testSetPlayer1Direction() {
        System.out.println("setPlayer1Direction");
        int i = 0;
        World instance = new World();
        instance.setPlayer1Direction(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer2Direction method, of class World.
     */
    @Test
    public void testSetPlayer2Direction() {
        System.out.println("setPlayer2Direction");
        int i = 0;
        World instance = new World();
        instance.setPlayer2Direction(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTimeout method, of class World.
     */
    @Test
    public void testIsTimeout() {
        System.out.println("isTimeout");
        World instance = new World();
        boolean expResult = false;
        boolean result = instance.isTimeout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class World.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        World instance = new World();
        long expResult = 0L;
        long result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
