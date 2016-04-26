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

/**
 *
 * @author Ali-pc
 */
public abstract class Eater implements Organisme{
    private Point position = new Point();
    
    /**
     *
     */
    public Eater(){
    }
    
    /**
     *
     * @param P
     */
    public void setPosition(Point P){
        position.setAbsis(P.getAbsis());
        position.setOrdinat(P.getOrdinat());
    }
    
    @Override
    public Point getPosition(){
        return position;
    }
    
    /**
     *
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
        return ((_y <= rad) &&(_x <= rad));
    }
    
    @Override
    public abstract String name();
    
    @Override
    public abstract boolean isMati();
    
    @Override
    public abstract void move();
    
    public boolean isOutside(int width, int height)
    {
        if(getPosition().getAbsis() > width || getPosition().getAbsis() < 0)
        {
            return true;
        }
        
        if(getPosition().getOrdinat() > height || getPosition().getAbsis() < 0)
        {
            return true;
        }
        
        return false;
    }
}
