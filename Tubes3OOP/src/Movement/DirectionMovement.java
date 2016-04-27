/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movement;

import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class DirectionMovement implements Movement{
    private int direction;
    private int timeToChangeDirection;
    
    /**
     *
     */
    public DirectionMovement(){
        Random rand = new Random();
        direction = rand.nextInt(8)+1;
        timeToChangeDirection = 0;
    }

    /**
     *
     * @param i
     */
    public void setDirection(int i){
        direction = i;
    }
    
    /**
     *
     * @param i
     */
    public void setTimeToChangeDirection(int i){
        timeToChangeDirection = i;
    }
    
    /**
     *
     * @return
     */
    public int getDirection(){
        return direction;
    }
    
    public int getTimeToChangeDirection(){
        return timeToChangeDirection;
    }

    /**
     *
     */
    public void setWithRandomDirection(){
        Random rand = new Random();
        if (timeToChangeDirection%(rand.nextInt(30) + 30) == 0){
            direction = rand.nextInt(8) + 1;
        }
        timeToChangeDirection++;
    }

    @Override
    public Point move(Point P1, int d) {
        Point temp = new Point(0,0);
        temp.setAbsis(P1.getAbsis());
        temp.setOrdinat(P1.getOrdinat());
        switch (direction) {
            case 1 : temp.geser(0,-d); break;        
            case 2 : temp.geser(d,-d); break;        
            case 3 : temp.geser(d,0); break;
            case 4 : temp.geser(d,d); break;
            case 5 : temp.geser(0,d); break;
            case 6 : temp.geser(-1*d,d); break;
            case 7 : temp.geser(-1*d,0); break;
            case 8 : temp.geser(-1*d,-d); break;
            default:
        }
        return temp;
    }
}
