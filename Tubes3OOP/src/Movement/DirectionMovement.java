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
    
    public DirectionMovement(){
        direction = 0;
        timeToChangeDirection = 0;
    }
    public void setDirection(int i){
        direction = i;
    }
    
    public int getDirection(){
        return direction;
    }
    public void setWithRandomDirection(){
        Random rand = new Random();
        if (timeToChangeDirection%(rand.nextInt(30) + 20) == 0){
            direction = rand.nextInt(8) + 1;
        }
        timeToChangeDirection++;
    }

    @Override
    public Point move(Point P1) {
        Point temp = new Point(0,0);
        temp.setAbsis(P1.getAbsis());
        temp.setOrdinat(P1.getOrdinat());
        int d = 1;
        switch (direction) {
            case 1 : temp.geser(0,d); break;        
            case 2 : temp.geser(d,d); break;        
            case 3 : temp.geser(d,0); break;
            case 4 : temp.geser(d,-1*d); break;
            case 5 : temp.geser(0,-1*d); break;
            case 6 : temp.geser(-1*d,-1*d); break;
            case 7 : temp.geser(-1*d,0); break;
            case 8 : temp.geser(-1*d,d); break;
            default:
        }
        return temp;
    }
}
