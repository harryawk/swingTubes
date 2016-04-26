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

public class FirstPlayer extends Eater{
    private String nickName;
    private boolean mati;
    private int win;
    private DirectionMovement pergerakan;
    
    public FirstPlayer(String name){
        super();
        nickName = name;
        mati = false;
        win = 0;
        pergerakan = new DirectionMovement();
    }
    
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
    
    public String nickName(){
        return nickName;
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
        return 7;
    }
    
    public int getWin(){
        return win;
    }
    
    @Override
    public void Reaction(Organisme M){
        if (isRadius(10,M.getPosition())){
            if (M.name() != "2"){
                setMati(true);
            }
            else{
                win = 1;
            }
        }
    }
}
