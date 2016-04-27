/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organism;

import Movement.DirectionMovement;
import Movement.Point;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Ali-pc
 */
public class SecondPlayer extends Eater{
    private boolean mati;
    private int tingkat_kekenyangan;
    private String nickName;
    private DirectionMovement pergerakan;
    
    /**
     *
     * @param i
     */
    public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    @Override
    public void move() {
        Point P2 = pergerakan.move(getPosition(),getKecepatan());
        setPosition(P2);
        int a = getKekenyangan();
        a--;
        setKekenyangan(a);
    }
    
    /**
     *
     * @param name
     */
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
    
    /**
     *
     * @return
     */
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
    
    /**
     *
     * @param a
     */
    public void setTingkatKekenyangan(int a){
        tingkat_kekenyangan = a;
    }
    
    public void Reaction(Organisme M){
        if (isRadius(20,M.getPosition())){
            if (M.name() == "1"){
                setMati(true);
            }
            else if (M.name() == "F"){
                tingkat_kekenyangan++;
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
        
        if (getKekenyangan() == 0){
            setMati(true);
        }
    }
    
    @Override
    public int getKecepatan(){
        return 4;
    }
    
    @Override
    public Color getColor()
    {
        Random rand = new Random();
        Color myColor = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        return myColor;
    }
    
}
