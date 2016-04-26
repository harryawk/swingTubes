/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Movement.DirectionMovement;
import Movement.Point;

/**
 *
 * @author Ali-pc
 */
public class SecondPlayer extends Eater{
    private boolean mati;
    private int tingkat_kekenyangan;
    private String nickName;
    private DirectionMovement pergerakan;
    
     public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    @Override
    public void move() {
        Point P1 = getPosition();
        Point P2 = pergerakan.move(getPosition()); //Posisi yang baru
        setPosition(P2);
    }
    
    public SecondPlayer(String name){
        super();
        mati = false;
        tingkat_kekenyangan = 40;
        nickName = name;
        pergerakan = new DirectionMovement();
    }
    
    public void setMati(boolean t){
        mati = t;
    }
    
    public String nickName(){
        return nickName();
    }
    
    @Override
    public String name() {
        return "2";
    }
    
    @Override
    public boolean isMati() {
        return mati;
    }
    
    public void setTingkatKekenyangan(int a){
        tingkat_kekenyangan = a;
    }
    
    public void Reaction(Organisme M){
        if (getPosition() == M.getPosition()){
            if (M.name() == "1"){
                setMati(true);
            }
            else{
                if (M.name() == "N"){
                    move();
                }
                else if (M.name() == "F"){
                    tingkat_kekenyangan++;
                    move();
                }
            }
        }
        else{
            move();
        }
    }
}
