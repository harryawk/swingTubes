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
public class DirectionMovementTest {
    
    public DirectionMovementTest() {
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
     * Test of setDirection method, of class DirectionMovement.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        int i = 4;
        DirectionMovement instance = new DirectionMovement();
        instance.setDirection(i);
        assertEquals(instance.getDirection(), i);
    }

    /**
     * Test of setTimeToChangeDirection method, of class DirectionMovement.
     */
    @Test
    public void testSetTimeToChangeDirection() {
        System.out.println("setTimeToChangeDirection");
        int i = 4;
        DirectionMovement instance = new DirectionMovement();
        instance.setTimeToChangeDirection(i);
        assertEquals(instance.getTimeToChangeDirection(), i);
    }

    /**
     * Test of getDirection method, of class DirectionMovement.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        DirectionMovement instance = new DirectionMovement();
        int expResult = 5;
        instance.setDirection(expResult);
        int result = instance.getDirection();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeToChangeDirection method, of class DirectionMovement.
     */
    @Test
    public void testGetTimeToChangeDirection() {
        System.out.println("getTimeToChangeDirection");
        DirectionMovement instance = new DirectionMovement();
        int expResult = 77;
        instance.setTimeToChangeDirection(expResult);
        int result = instance.getTimeToChangeDirection();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWithRandomDirection method, of class DirectionMovement.
     */
    @Test
    public void testSetWithRandomDirection() {
        System.out.println("setWithRandomDirection");
        DirectionMovement instance = new DirectionMovement();
        instance.setWithRandomDirection();
        assertTrue(true);
   }

    /**
     * Test of move method, of class DirectionMovement.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Point P1 = new Point();
        int d = 6;
        DirectionMovement instance = new DirectionMovement();
        instance.setDirection(1);
        Point expResult = P1;
        Point result = instance.move(P1, d);
        assertEquals((expResult.getOrdinat()-d), result.getOrdinat());
    }
    
}
