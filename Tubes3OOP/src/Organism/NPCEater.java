/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organism;

import instinct.CautionMovement;
import java.awt.Color;
import java.util.Random;

/**
 * A class that implements the NPCEater.
 * @author Ali-pc
 */
public class NPCEater extends Eater {
  /**
   * a private boolean member.
   */
  private boolean mati;
  
  /**
   * a private CautionMovement member.
   */
  private CautionMovement pergerakan;
  
  /**
   * a private Color member.
   */
  private Color myColor;

  /**
   * A constructor.
   */
  public NPCEater() {
    mati = false;
    pergerakan = new CautionMovement();
    Random rand = new Random();
    myColor = new Color(rand.nextInt(256), rand.nextInt(256),
            rand.nextInt(256));
  }

  /**
   * a procedure to set death.
   * @param t a boolean.
   */
  public void setMati(boolean t) {
    mati = t;
  }

  @Override
  /**
   * a procedure to get the name of the NPCEater.
   * @return String.
   */
  public final String name() {
    return "N";
  }

  @Override
  /**
   * a function to return the death variable.
   * @return a boolean.
   */
  public final boolean isMati() {
    return mati;
  }

  /**
   * a procedure to set the direction.
   * @param i an integer.
   */
  public final void setArah(final int i) {
    pergerakan.setDirection(i);
  }

  @Override
  /**
   * a procedure to move.
   */
  public final void move() {
    setPosition(pergerakan.move(getPosition(), getKecepatan()));
  }

  @Override
  /**
   * a function to return the Color.
   * @return Color.
   */
  public final Color getColor() {
    return myColor;
  }

  @Override
  /**
   * a procedure to react.
   */
  public final void Reaction(final Organisme M) {
    if (M != null && isRadius(100, M.getPosition())) {
      if (M.name() == "F") {
        if (pergerakan.getTimeToChangeDirection() % 5 == 0) {
          hunt(M);
          pergerakan.setTimeToChangeDirection(1);
        }
      } else if (M.name() == "1") {
        if (pergerakan.getTimeToChangeDirection() % 5 == 0) {
          pergerakan.run(getPosition(), M.getPosition());
          pergerakan.setTimeToChangeDirection(1);
        }
      } else {
        pergerakan.setWithRandomDirection();
      }
    } else {
      pergerakan.setWithRandomDirection();
    }
    boundaryRespon();
  }

  @Override
  /**
   * a function that return the velocity.
   * @return an integer.
   */
  public final int getKecepatan() {
    return 4;
  }

  /**
   * a method to implement hunt.
   * @param M an Organisme.
   */
  public final void hunt(final Organisme m) {
    if (m != null) {
      if ((getPosition().getAbsis() == m.getPosition().getAbsis())
              && (getPosition().getOrdinat()
              > m.getPosition().getOrdinat())) {
        setArah(1);
      } else if ((getPosition().getAbsis() < m.getPosition().getAbsis())
              && (getPosition().getOrdinat()
              > m.getPosition().getOrdinat())) {
        setArah(2);
      } else if ((getPosition().getAbsis() < m.getPosition().getAbsis())
              && (getPosition().getOrdinat()
              == m.getPosition().getOrdinat())) {
        setArah(3);
      } else if ((getPosition().getAbsis() < m.getPosition().getAbsis())
              && (getPosition().getOrdinat()
              < m.getPosition().getOrdinat())) {
        setArah(4);
      } else if ((getPosition().getAbsis() == m.getPosition().getAbsis())
              && (getPosition().getOrdinat()
              < m.getPosition().getOrdinat())) {
        setArah(5);
      } else if ((getPosition().getAbsis() > m.getPosition().getAbsis())
              && (getPosition().getOrdinat()
              < m.getPosition().getOrdinat())) {
        setArah(6);
      } else if ((getPosition().getAbsis() > m.getPosition().getAbsis())
              && (getPosition().getOrdinat()
              == m.getPosition().getOrdinat())) {
        setArah(7);
      } else {
        setArah(8);
      }
    }
  }
}
