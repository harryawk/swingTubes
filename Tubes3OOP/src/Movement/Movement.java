/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movement;

/**
 *
 * @author Ali-pc
 */
public interface Movement {

  /**
   * @param p a Point.
   * @param d an integer.
   * @return Point.
   */
  Point move(Point p, int d);
}
