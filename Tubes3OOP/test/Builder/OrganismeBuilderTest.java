/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Organism.FirstPlayer;
import Organism.Food;
import Organism.NPCEater;
import Organism.SecondPlayer;
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
public class OrganismeBuilderTest {
    
    public OrganismeBuilderTest() {
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
     * Test of makeFood method, of class OrganismeBuilder.
     */
    @Test
    public void testMakeFood() {
        System.out.println("makeFood");
        Food expResult = new Food();
        Food result = OrganismeBuilder.makeFood();
        assertEquals(expResult.getClass(), result.getClass());
    }

    /**
     * Test of makeEaterNPC method, of class OrganismeBuilder.
     */
    @Test
    public void testMakeEaterNPC() {
        System.out.println("makeEaterNPC");
        NPCEater expResult = new NPCEater();
        NPCEater result = OrganismeBuilder.makeEaterNPC();
        assertEquals(expResult.getClass(), result.getClass());
    }

    /**
     * Test of makeFirstEater method, of class OrganismeBuilder.
     */
    @Test
    public void testMakeFirstEater() {
        System.out.println("makeFirstEater");
        FirstPlayer expResult = new FirstPlayer();
        FirstPlayer result = OrganismeBuilder.makeFirstEater();
        assertEquals(expResult.getClass(), result.getClass());
    }

    /**
     * Test of makeSecondEater method, of class OrganismeBuilder.
     */
    @Test
    public void testMakeSecondEater() {
        System.out.println("makeSecondEater");
        SecondPlayer expResult = new SecondPlayer();
        SecondPlayer result = OrganismeBuilder.makeSecondEater();
        assertEquals(expResult.getClass(), result.getClass());
    }
    
}
