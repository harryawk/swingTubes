/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldofpain;

import organism.Organisme;

/**
 *
 * @author CXXXV
 */
public class MoveThread extends Thread {
  /**
   * a constructor.
   * @param o Organisme.
   */
  MoveThread(final Organisme o) {
    organisme = o;
  }

  /**
   * a private organism member.
   */
  private Organisme organisme;

  @Override
  /**
   * a procedure to run.
   */
  public final void run() {
    organisme.move();
  }

}
