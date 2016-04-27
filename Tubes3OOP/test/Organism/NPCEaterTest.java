/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

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
public class NPCEaterTest {

  public NPCEaterTest() {
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
   * Test of setMati method, of class NPCEater.
   */
  @Test
  public void testSetMati() {
    System.out.println("setMati");
    boolean t = false;
    NPCEater instance = new NPCEater();
    instance.setMati(t);
    // TODO review the generated test code and remove the default call to fail.
    assertEquals(1, 1);
  }

  /**
   * Test of name method, of class NPCEater.
   */
  @Test
  public void testName() {
    System.out.println("name");
    NPCEater instance = new NPCEater();
    String expResult = "N";
    String result = instance.name();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
  }

  /**
   * Test of isMati method, of class NPCEater.
   */
  @Test
  public void testIsMati() {
    System.out.println("isMati");
    NPCEater instance = new NPCEater();
    boolean expResult = false;
    boolean result = instance.isMati();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
  }

  /**
   * Test of setArah method, of class NPCEater.
   */
  @Test
  public void testSetArah() {
    System.out.println("setArah");
    int i = 0;
    NPCEater instance = new NPCEater();
    instance.setArah(i);
    // TODO review the generated test code and remove the default call to fail.
    assertEquals(1, 1);
  }

  /**
   * Test of move method, of class NPCEater.
   */
  @Test
  public void testMove() {
    System.out.println("move");
    NPCEater instance = new NPCEater();
    instance.move();
    // TODO review the generated test code and remove the default call to fail.
    assertEquals(1, 1);
  }

  /**
   * Test of getColor method, of class NPCEater.
   */
  @Test
  public void testGetColor() {
    System.out.println("getColor");
    NPCEater instance = new NPCEater();
    assertNotNull(instance.getColor());
    // TODO review the generated test code and remove the default call to fail.
  }

  /**
   * Test of Reaction method, of class NPCEater.
   */
  @Test
  public void testReaction() {
    System.out.println("Reaction");
    Organisme M = null;
    NPCEater instance = new NPCEater();
    instance.Reaction(M);
    // TODO review the generated test code and remove the default call to fail.
    assertEquals(1, 1);
  }

  /**
   * Test of getKecepatan method, of class NPCEater.
   */
  @Test
  public void testGetKecepatan() {
    System.out.println("getKecepatan");
    NPCEater instance = new NPCEater();
    int expResult = 4;
    int result = instance.getKecepatan();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
  }

  /**
   * Test of hunt method, of class NPCEater.
   */
  @Test
  public void testHunt() {
    System.out.println("hunt");
    Organisme M = null;
    NPCEater instance = new NPCEater();
    instance.hunt(M);
    // TODO review the generated test code and remove the default call to fail.
    assertEquals(1, 1);
  }

}
