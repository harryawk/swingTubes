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
    
    public DirectionMovement(){
        direction = 0;
    }
    public void setDirection(int i){
        direction = i;
    }
    
    public int getDirection(){
        return direction;
    }
    public Point moveWithRandomDirection(Point P1){
        Random rand = new Random();
        direction = rand.nextInt(8);
        Point temp = new Point(0,0);
        temp.setAbsis(P1.getAbsis());
        temp.setOrdinat(P1.getOrdinat());
        switch (direction) {
            case 1 : temp.geser(0,1); break;
            case 2 : temp.geser(1,1); break;
            case 3 : temp.geser(1,0); break;
            case 4 : temp.geser(1,-1); break;
            case 5 : temp.geser(0,-1); break;
            case 6 : temp.geser(-1,-1); break;
            case 7 : temp.geser(-1,0); break;
            case 8 : temp.geser(-1,1); break;
        }
        return temp;
    }

    @Override
    public Point move(Point P1) {
        Point temp = new Point(0,0);
        temp.setAbsis(P1.getAbsis());
        temp.setOrdinat(P1.getOrdinat());
        switch (direction) {
            case 1 : temp.geser(0,1); break;
            case 2 : temp.geser(1,1); break;
            case 3 : temp.geser(1,0); break;
            case 4 : temp.geser(1,-1); break;
            case 5 : temp.geser(0,-1); break;
            case 6 : temp.geser(-1,-1); break;
            case 7 : temp.geser(-1,0); break;
            case 8 : temp.geser(-1,1); break;
        }
        return temp;
    }
}