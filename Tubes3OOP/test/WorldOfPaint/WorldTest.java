/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldOfPaint;

import Builder.*;
import Movement.Point;
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
import static org.junit.Assert.assertNotNull;
import Organism.*;

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
    //langsung true
    @Test
    public void testCetak() {
        System.out.println("cetak");
        String string = "";
        World instance = new World();
        instance.cetak(string);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }

    /**
     * Test of updateDisplay method, of class World.
     */
    //langsung true
    @Test
    public void testUpdateDisplay() throws Exception {
        System.out.println("updateDisplay");
        World instance = new World();
        instance.updateDisplay();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }

    /**
     * Test of updateGame method, of class World.
     */
    @Test
    public void testUpdateGame() throws Exception {
        System.out.println("updateGame");
        World instance = new World();
        Food food = OrganismeBuilder.makeFood();
        Point p = food.getPosition();
        
        instance.add(food);
        instance.updateGame();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
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
        assertEquals(1,1);
    }

    /**
     * Test of paintComponent method, of class World.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        World instance = new World();
        instance.repaint();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }

    /**
     * Test of GameOver method, of class World.
     */
    @Test
    public void testGameOver() {
        System.out.println("GameOver");
        World instance = new World();
        instance.registerPlayer1(OrganismeBuilder.makeFirstEater());
        instance.registerPlayer2(OrganismeBuilder.makeSecondEater());
        instance.worldTimer = 10;
        boolean expResult = false;
        boolean result = instance.GameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class World.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Organisme o = new Food();
        World instance = new World();
        instance.add(o);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1, instance.dunia.getList().size());
    }

    /**
     * Test of registerPlayer1 method, of class World.
     */
    @Test
    public void testRegisterPlayer1() {
        System.out.println("registerPlayer1");
        FirstPlayer p = new FirstPlayer();
        World instance = new World();
        instance.registerPlayer1(p);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance.player1);
    }

    /**
     * Test of registerPlayer2 method, of class World.
     */
    @Test
    public void testRegisterPlayer2() {
        System.out.println("registerPlayer2");
        SecondPlayer p = new SecondPlayer();
        World instance = new World();
        instance.registerPlayer2(p);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance.player2);
    }

    /**
     * Test of setPlayer1Direction method, of class World.
     */
    @Test
    public void testSetPlayer1Direction() {
        System.out.println("setPlayer1Direction");
        int i = 1;
        FirstPlayer p = new FirstPlayer();
        World instance = new World();
        instance.registerPlayer1(p);
        instance.setPlayer1Direction(i);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }

    /**
     * Test of setPlayer2Direction method, of class World.
     */
    @Test
    public void testSetPlayer2Direction() {
        System.out.println("setPlayer1Direction");
        int i = 1;
        SecondPlayer p = new SecondPlayer();
        World instance = new World();
        instance.registerPlayer2(p);
        instance.setPlayer2Direction(i);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,1);
    }

    /**
     * Test of isTimeout method, of class World.
     */
    @Test
    public void testIsTimeout() {
        System.out.println("isTimeout");
        World instance = new World();
        instance.worldTimer = 10;
        boolean expResult = false;
        boolean result = instance.isTimeout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTime method, of class World.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        World instance = new World();
        instance.worldTimer = 10;
        long expResult = 10L;
        long result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
