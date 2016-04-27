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

import Movement.*;
import java.awt.Color;

/**
 *
 * @author CXXXV
 */
public class FirstPlayer extends Eater{
    private boolean mati;
    private int win;
    private DirectionMovement pergerakan;
    
    /**
     *
     * @param name
     */
    public FirstPlayer(){
        super();
        mati = false;
        win = 0;
        pergerakan = new DirectionMovement();
    }
    
    /**
     *
     * @param i
     */
    public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    @Override
    public void move() {
        Point P2 = pergerakan.move(getPosition(),getKecepatan()); //Posisi yang baru
        setPosition(P2);
    }
        
    public void setMati(boolean t){
        mati = t;
    }
    
    @Override
    public String name() {
        return "1";
    }

    @Override
    public boolean isMati() {
        return mati;
    }
    
    @Override
    public int getKecepatan(){
        return 6;
    }
    
    /**
     *
     * @return
     */
    public int getWin(){
        return win;
    }
    
    @Override
    public Color getColor()
    {
        return Color.blue;
    }
    
    @Override
    public void Reaction(Organisme M){
        if (isRadius(20,M.getPosition())){
            if (M.name() != "2"){
                setMati(true);
            }
            else{
                win = 1;
            }
        }
        
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
}
