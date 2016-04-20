/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhluk2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ali-pc
 */
public class PolisiTest {
    
    public PolisiTest() {
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
     * Test of Reaction method, of class Polisi.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        Point P1 = new Point(1,0);
        Point P2 = new Point(1,1);
        MakhlukHidup M = new Pemburu(P2);
        Polisi instance = new Polisi(P1);
        instance.Reaction(M);
        instance.gerak_berarah();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getPosisi().getAbsis(),P2.getAbsis());
    }
    
}
