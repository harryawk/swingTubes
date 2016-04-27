/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instinct;

import Movement.Point;
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
public class CautionMovementTest {
    
    public CautionMovementTest() {
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
     * Test of run method, of class CautionMovement.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Point Awal = new Point();
        Point Predator = new Point();
        Predator.setOrdinat(Awal.getOrdinat()+5);
        Predator.setAbsis(Awal.getAbsis());
        CautionMovement instance = new CautionMovement();
        instance.run(Awal, Predator);
        assertTrue(instance.getDirection() == 1);
    }
    
}
