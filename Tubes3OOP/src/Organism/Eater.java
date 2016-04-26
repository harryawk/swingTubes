package Organism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali-pc
 */
import Movement.Point;


public abstract class Eater implements Organisme{
    private Point position = new Point();
    
    public Eater(){
    }
    
    public void setPosition(Point P){
        position.setAbsis(P.getAbsis());
        position.setOrdinat(P.getOrdinat());
    }
    
    @Override
    public Point getPosition(){
        return position;
    }
    
    @Override
    public abstract String name();
    
    @Override
    public abstract boolean isMati();
    
    @Override
    public abstract void move();
}
