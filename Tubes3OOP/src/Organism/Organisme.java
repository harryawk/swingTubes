/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

/**
 *
 * @author Ali-pc
 */
import Movement.Point;

public interface Organisme {
    public String name();
    public boolean isMati();
    public void move();
    public Point getPosition();
    public void Reaction(Organisme o);
    public boolean isOutside(int width, int height);  //tambahan bimo
    public void setMati(boolean t); //tambahan bimp
}
