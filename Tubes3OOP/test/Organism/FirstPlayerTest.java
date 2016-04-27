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
public class FirstPlayerTest {

  public FirstPlayerTest() {
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
   * Test of setArah method, of class FirstPlayer.
   */
  @Test
  public void testSetArah() {
    System.out.println("setArah");
    int i = 3;
    FirstPlayer instance = new FirstPlayer();
    instance.setArah(i);
    Point temp = new Point();
    temp.setAbsis(instance.getPosition().getAbsis());
    temp.setOrdinat(instance.getPosition().getOrdinat());
    instance.move();
    assertTrue(instance.getPosition().getAbsis() == (temp.getAbsis() + 6));
  }

  /**
   * Test of move method, of class FirstPlayer.
   */
  @Test
  public void testMove() {
    System.out.println("move");
    int i = 3;
    FirstPlayer instance = new FirstPlayer();
    instance.setArah(i);
    Point temp = new Point();
    temp.setAbsis(instance.getPosition().getAbsis());
    temp.setOrdinat(instance.getPosition().getOrdinat());
    instance.move();
    assertTrue(instance.getPosition().getAbsis() == (temp.getAbsis() + 6));
  }

  /**
   * Test of setMati method, of class FirstPlayer.
   */
  @Test
  public void testSetMati() {
    System.out.println("setMati");
    boolean t = false;
    FirstPlayer instance = new FirstPlayer();
    instance.setMati(t);
    assertTrue(!instance.isMati());
  }

  /**
   * Test of name method, of class FirstPlayer.
   */
  @Test
  public void testName() {
    System.out.println("name");
    FirstPlayer instance = new FirstPlayer();
    String expResult = "1";
    String result = instance.name();
    assertEquals(expResult, result);
  }

  /**
   * Test of isMati method, of class FirstPlayer.
   */
  @Test
  public void testIsMati() {
    System.out.println("isMati");
    FirstPlayer instance = new FirstPlayer();
    instance.setMati(false);
    boolean expResult = false;
    boolean result = instance.isMati();
    assertEquals(expResult, result);
  }

  /**
   * Test of getKecepatan method, of class FirstPlayer.
   */
  @Test
  public void testGetKecepatan() {
    System.out.println("getKecepatan");
    FirstPlayer instance = new FirstPlayer();
    int expResult = 6;
    int result = instance.getKecepatan();
    assertEquals(expResult, result);
  }

  /**
   * Test of getWin method, of class FirstPlayer.
   */
  @Test
  public void testGetWin() {
    System.out.println("getWin");
    FirstPlayer instance = new FirstPlayer();
    int expResult = 0;
    int result = instance.getWin();
    assertEquals(expResult, result);
  }

  /**
   * Test of getColor method, of class FirstPlayer.
   */
  @Test
  public void testGetColor() {
    System.out.println("getColor");
    FirstPlayer instance = new FirstPlayer();
    Color expResult = Color.blue;
    Color result = instance.getColor();
    assertEquals(expResult, result);
  }

  /**
   * Test of Reaction method, of class FirstPlayer.
   */
  @Test
  public void testReaction() {
    System.out.println("Reaction");
    Organisme M = new NPCEater();
    FirstPlayer instance = new FirstPlayer();
    instance.setPosition(M.getPosition());
    instance.Reaction(M);
    assertEquals(instance.getWin(), 0);
  }

}
