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
     * Test of keyTyped method, of class ListenKey.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        ListenKey instance = null;
        try {
            instance.keyTyped(e);
        } catch (NullPointerException ex) {
            assert(true);
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of keyPressed method, of class ListenKey.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        ListenKey instance = null;
        try {
            instance.keyTyped(e);
        } catch (NullPointerException ex) {
            assert(true);
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isAllFalse method, of class ListenKey.
     */
    @Test
    public void testIsAllFalse() {
        System.out.println("isAllFalse");
        try {
            ListenKey instance = null;
            boolean expResult = false;
            boolean result = instance.isAllFalse();
            assertEquals(expResult, result);
        } catch (NullPointerException ex) {
            assert(true);
        }
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
        try {
            instance.keyReleased(e);
        } catch (NullPointerException ex) {
            assert(true);
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
