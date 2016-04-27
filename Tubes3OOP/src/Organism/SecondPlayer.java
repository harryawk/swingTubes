/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organism;

import movement.DirectionMovement;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class SecondPlayer extends Eater {
  /**
   * a boolean private member.
   */
  private boolean mati;

  /**
   * a private integer member.
   */
  private int tingkatkekenyangan;

  /**
   * a private DirectionMovement member.
   */
  private DirectionMovement pergerakan;

  /**
   * a private Color member.
   */
  private Color myColor;

  /**
   * a private max kekenyangan member.
   */
  private final int maxK = 700;

  /**
   * a procedure to set directtion.
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
    int a = getKekenyangan();
    a--;
    setKekenyangan(a);
  }

  /**
   * a constructor.
   */
  public SecondPlayer() {
    super();
    mati = false;
    tingkatkekenyangan = maxK;
    pergerakan = new DirectionMovement();
    Random rand = new Random();
    myColor = new Color(rand.nextInt(256), rand.nextInt(256),
            rand.nextInt(256));
  }

  /**
   * a procedure to set death.
   * @param t a boolean.
   */
  public final void setMati(final boolean t) {
    mati = t;
  }

  @Override
  /**
   * a function that return the second player name.
   * @return String.
   */
  public final String name() {
    return "2";
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
   * a procedure to react.
   * @param m an organism.
   */
  public final void Reaction(final Organisme m) {
    if (isRadius(20, m.getPosition()) && m != null) {
      if (m.name() == "1") {
        setMati(true);
      } else if (m.name() == "F") {
        tingkatkekenyangan = maxK;
      }
    }

    //cek kekenyangan
    if (getKekenyangan() == 0) {
      setMati(true);
    }

    boundaryRespon();
  }

  @Override
  /**
   * a function to return velocity.
   */
  public final int getKecepatan() {
    return 4;
  }

  @Override
  /**
   * a function to return Color.
   */
  public final Color getColor() {
    return myColor;
  }

  /**
   * a function to return tingkat kekenyangan.
   * @return an integer.
   */
  public final int getKekenyangan() {
    return tingkatkekenyangan;
  }

  /**
   * a procedure to set kekenyangan.
   * @param k an integer.
   */
  public final void setKekenyangan(final int k) {
    tingkatkekenyangan = k;
  }

}
