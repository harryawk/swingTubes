/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instinct;

import Movement.DirectionMovement;
import Movement.Point;


/**
 *
 * @author Ali-pc
 */
public class CautionMovement extends DirectionMovement implements Instinct{ 
    @Override
    public void run(Point Awal, Point Predator){
        if ((Awal.getAbsis() == Predator.getAbsis()) && (Awal.getOrdinat() > Predator.getOrdinat()))
           setDirection(5);
        else if ((Awal.getAbsis() < Predator.getAbsis()) && (Awal.getOrdinat() > Predator.getOrdinat()))
            setDirection(6);
        else if ((Awal.getAbsis() < Predator.getAbsis()) && (Awal.getOrdinat() == Predator.getOrdinat()))
            setDirection(7);
        else if ((Awal.getAbsis() < Predator.getAbsis()) && (Awal.getOrdinat() < Predator.getOrdinat()))
            setDirection(8);
        else if ((Awal.getAbsis() == Predator.getAbsis()) && (Awal.getOrdinat() < Predator.getOrdinat()))
            setDirection(1);
        else if ((Awal.getAbsis() > Predator.getAbsis()) && (Awal.getOrdinat() < Predator.getOrdinat()))
            setDirection(2);
        else if ((Awal.getAbsis() > Predator.getAbsis()) && (Awal.getOrdinat() == Predator.getOrdinat()))
            setDirection(3);
        else
            setDirection(4);
    }
}
