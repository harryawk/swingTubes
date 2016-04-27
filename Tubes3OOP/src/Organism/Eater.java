package Organism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A class to implement an eater organism
 * @author Ali-pc
 */
import Movement.Point;

public abstract class Eater implements Organisme{
    private Point position;
    
    /**
     * A constructor
     */
    public Eater(){
         position = new Point();
    }
    
    @Override
    public Point getPosition(){
        return position;
    }
    
    @Override
    /**
     * An abstract method that return name of the eater
     */
    public abstract String name();
    
    @Override
    /**
     * An abstract method to check if the eater already die or not
     */
    public abstract boolean isMati();
    
    @Override
    /**
     * An abstract method to move the eater
     */
    public abstract void move();
    
    /**
     * a function check if some point is near to eater current position
     * @param rad
     * @param p
     * @return
     */
    public boolean isRadius (int rad, Point p){
        int _x, _y;
        _x = getPosition().getAbsis() - p.getAbsis();
        if (_x < 0)
                _x = 0 - _x;
        _y = getPosition().getOrdinat() - p.getOrdinat();
        if (_y < 0)
                _y = 0 - _y;
        return ((_y <= rad) && (_x <= rad));
    }
    
    public void boundaryRespon() {
        //tetap di dalam
        int width  = 1366;
        int height = 768; 
        int x = getPosition().getAbsis();
        int y = getPosition().getOrdinat();

        //boundary
        if(x < 100)
        {
            getPosition().setAbsis(width-125);
        }
        else if(x > (width-115))
        {
            getPosition().setAbsis(110);
        }
        else if(y < 100)
        {
            getPosition().setOrdinat(height-125);
        }
        else if(y > (height-115))
        {
            getPosition().setOrdinat(110);
        }
    }
    
    /**
     * Set the current position of the 
     * @param P
     */
    public void setPosition(Point P){
        position.setAbsis(P.getAbsis());
        position.setOrdinat(P.getOrdinat());
    }
    
}
