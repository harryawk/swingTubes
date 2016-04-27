/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import static Builder.OrganismeBuilder.makeFood;
import Organism.Organisme;
import java.util.ArrayList;
import java.util.List;
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
public class ListOfOrganismeTest {
    
    public ListOfOrganismeTest() {
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
     * Test of addOrganisme method, of class ListOfOrganisme.
     */
    @Test
    public void testAddOrganisme() {
        System.out.println("addOrganisme");
        Organisme O = makeFood();
        ListOfOrganisme instance = new ListOfOrganisme();
        instance.addOrganisme(O);
        assertEquals(instance.getList().size(), 1);
    }

    /**
     * Test of deleteOrganismeAt method, of class ListOfOrganisme.
     */
    @Test
    public void testDeleteOrganismeAt() throws Exception {
        System.out.println("deleteOrganismeAt");
        int i = 0;
        ListOfOrganisme instance = new ListOfOrganisme();
        instance.addOrganisme(makeFood());
        instance.deleteOrganismeAt(i);
        assertEquals(instance.getList().size(), 0);
    }

    /**
     * Test of getList method, of class ListOfOrganisme.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        ListOfOrganisme instance = new ListOfOrganisme();
        instance.addOrganisme(makeFood());
        instance.addOrganisme(makeFood());
        instance.addOrganisme(makeFood());
        List<Organisme> expResult = new ArrayList<Organisme>();
        for (Organisme o : instance.getList()){
            expResult.add(o);
        }
        List<Organisme> result = instance.getList();
        assertEquals(expResult, result);
    }
    
}
