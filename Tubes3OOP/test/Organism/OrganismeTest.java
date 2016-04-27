/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Movement.Point;
import java.awt.Color;
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
public class OrganismeTest {

  public OrganismeTest() {
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
   * Test of name method, of class Organisme.
   */
  @Test
  public void testName() {
    System.out.println("name");
    Organisme instance = new OrganismeImpl();
    String expResult = "";
    String result = instance.name();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of isMati method, of class Organisme.
   */
  @Test
  public void testIsMati() {
    System.out.println("isMati");
    Organisme instance = new OrganismeImpl();
    boolean expResult = false;
    boolean result = instance.isMati();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of move method, of class Organisme.
   */
  @Test
  public void testMove() {
    System.out.println("move");
    Organisme instance = new OrganismeImpl();
    instance.move();
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getPosition method, of class Organisme.
   */
  @Test
  public void testGetPosition() {
    System.out.println("getPosition");
    Organisme instance = new OrganismeImpl();
    Point expResult = null;
    Point result = instance.getPosition();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of Reaction method, of class Organisme.
   */
  @Test
  public void testReaction() {
    System.out.println("Reaction");
    Organisme o = null;
    Organisme instance = new OrganismeImpl();
    instance.Reaction(o);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getKecepatan method, of class Organisme.
   */
  @Test
  public void testGetKecepatan() {
    System.out.println("getKecepatan");
    Organisme instance = new OrganismeImpl();
    int expResult = 0;
    int result = instance.getKecepatan();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setMati method, of class Organisme.
   */
  @Test
  public void testSetMati() {
    System.out.println("setMati");
    boolean t = false;
    Organisme instance = new OrganismeImpl();
    instance.setMati(t);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getColor method, of class Organisme.
   */
  @Test
  public void testGetColor() {
    System.out.println("getColor");
    Organisme instance = new OrganismeImpl();
    Color expResult = null;
    Color result = instance.getColor();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  public class OrganismeImpl implements Organisme {

    public String name() {
      return "";
    }

    public boolean isMati() {
      return false;
    }

    public void move() {
    }

    public Point getPosition() {
      return null;
    }

    public void Reaction(Organisme o) {
    }

    public int getKecepatan() {
      return 0;
    }

    public void setMati(boolean t) {
    }

    public Color getColor() {
      return null;
    }
  }

}
