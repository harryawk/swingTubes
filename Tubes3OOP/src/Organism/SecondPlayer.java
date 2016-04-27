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
    private Color myColor;
    
     public void setArah(int i){
        pergerakan.setDirection(i);
    }
    
    @Override
    public void move() {
        Point P2 = pergerakan.move(getPosition(),getKecepatan());
        setPosition(P2);
    }
    
    public SecondPlayer(String name){
        super();
        mati = false;
        tingkat_kekenyangan = 40;
        nickName = name;
        pergerakan = new DirectionMovement();
        Random rand = new Random();
        myColor = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
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
        if (isRadius(10,M.getPosition())){
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
        if(x > (width-100))
        {
            getPosition().setAbsis(110);
        }
        else if(x < 100)
        {
            getPosition().setAbsis(1256);
        }
        else if(y > (height-100))
        {
            getPosition().setOrdinat(110);
        }
        else if(y < 100)
        {
            getPosition().setOrdinat(658);
        }
    }
    
    @Override
    public int getKecepatan(){
        return 4;
    }
    
    public Color getColor()
    {
        return myColor;
    }
    
}
