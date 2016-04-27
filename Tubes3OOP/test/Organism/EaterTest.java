/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Movement.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;

/**
 *
 * @author CXXXV
 */
public class EaterTest {
    
    public EaterTest() {
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
     * Test of getPosition method, of class Eater.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Eater instance = new EaterImpl();
        Point expResult = null;
        Point result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of name method, of class Eater.
     */
    @Test
    public void testName() {
        System.out.println("name");
        Eater instance = new EaterImpl();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMati method, of class Eater.
     */
    @Test
    public void testIsMati() {
        System.out.println("isMati");
        Eater instance = new EaterImpl();
        boolean expResult = false;
        boolean result = instance.isMati();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Eater.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Eater instance = new EaterImpl();
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRadius method, of class Eater.
     */
    @Test
    public void testIsRadius() {
        System.out.println("isRadius");
        int rad = 0;
        Point p = null;
        Eater instance = new EaterImpl();
        boolean expResult = false;
        boolean result = instance.isRadius(rad, p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of boundaryRespon method, of class Eater.
     */
    @Test
    public void testBoundaryRespon() {
        System.out.println("boundaryRespon");
        Eater instance = new EaterImpl();
        instance.boundaryRespon();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class Eater.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Point P = null;
        Eater instance = new EaterImpl();
        instance.setPosition(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EaterImpl extends Eater {
        
        @Override
        public String name()
        {
            return "eater";
        }
    
        /**
        * a function to check if the organism still alive or not
        * @return a boolean
        */
        @Override
        public boolean isMati()
        {
            return true;
        }

        /**
         * procedure to move the organism
         */
        @Override
        public void move()
        {
            
        }

        /**
         * a function to get the current position of the organism
         * @return a Point
         */
        @Override
        public Point getPosition()
        {
            return new Point(0,0);
        }

        /**
         * a procedure that control the reaction of organism if
         * they meet another Organism
         * @param o an organism
         */
        @Override
        public void Reaction(Organisme o)
        {
            
        }

        /**
         * a function that return the velocity of the organism
         * @return an integer
         */
        @Override
        public int getKecepatan()
        {
            return 0;
        }

        /**
         * a procedure to set the death variable
         * @param t a boolean
         */
        @Override
        public void setMati(boolean t) //tambahan bimo
        {
            
        }

        /**
         * procedure to get color representation of a creature
         * @return Color of the creature
         */
        @Override
        public Color getColor() //tambahan bimo
        {
            return Color.black;
        }
    }

}
