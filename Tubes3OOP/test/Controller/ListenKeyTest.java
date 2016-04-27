/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import WorldOfPaint.*;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Harry Alvin
 */
public class ListenKeyTest {
    
    public ListenKeyTest() {
        World W = new World();
        ListenKey L = new ListenKey(W);
        assert(true);
    }
    
    @BeforeClass
    public static void setUpClass() {
        assert(true);
    }
    
    @AfterClass
    public static void tearDownClass() {
        assert(true);
    }
    
    @Before
    public void setUp() {
        assert(true);
    }
    
    @After
    public void tearDown() {
        assert(true);
    }

    /**
     * Test of keyTyped method, of class ListenKey.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        ListenKey instance = null;
        instance.keyTyped(e);
        // TODO review the generated test code and remove the default call to fail.
        assert(true);
    }

    /**
     * Test of keyPressed method, of class ListenKey.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        ListenKey instance = null;
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
        assert(true);
    }

    /**
     * Test of isAllFalse method, of class ListenKey.
     */
    @Test
    public void testIsAllFalse() {
        System.out.println("isAllFalse");
        ListenKey instance = null;
        boolean expResult = false;
        boolean result = instance.isAllFalse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of keyReleased method, of class ListenKey.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        ListenKey instance = null;
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        assert(true);
    }
    
}
