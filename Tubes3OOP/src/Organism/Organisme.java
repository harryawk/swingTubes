/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import java.awt.Color;

/**
 * An interface that makes the organism
 *
 * @author Ali Akbar
 */
import Movement.Point;

/**
 *
 * @author Ali-pc
 */
public interface Organisme {

  /**
   * a function that returns the name of the organism
   *
   * @return a String that contain the name of the organism
   */
  public String name();

  /**
   * a function to check if the organism still alive or not
   *
   * @return a boolean
   */
  public boolean isMati();

  /**
   * procedure to move the organism
   */
  public void move();

  /**
   * a function to get the current position of the organism
   *
   * @return a Point
   */
  public Point getPosition();

  /**
   * a procedure that control the reaction of organism if they meet another
   * Organism
   *
   * @param o an organism
   */
  public void Reaction(Organisme o);

  /**
   * a function that return the velocity of the organism
   *
   * @return an integer
   */
  public int getKecepatan();

  /**
   * a procedure to set the death variable
   *
   * @param t a boolean
   */
  public void setMati(boolean t); //tambahan bimo

  /**
   * procedure to get color representation of a creature
   *
   * @return Color of the creature
   */
  public Color getColor(); //tambahan bimo

}
