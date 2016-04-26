package WorldOfPaint;

import java.lang.*;
import Controller.ListenKey;
import Movement.*;
import Organism.*;
import java.util.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.io.*;

/**
 *  A World is a singleton that 
 *  contains information of all object within it and capable to display them.
 *  @author Harry Alvin
 */
public class World extends JFrame{
        /**
         * Dunia[][] to store the world's frame
         * size the limit of MakhlukHidup in World
         * count counter of MakhlukHidup currently in World
         * daftar the list of things that instance of MakhlukHidup
         * lifeState indicates the MakhlukHidup has died or not yet
         * Count counter of age
         * clear() void to clear the console screen
         */
        ArrayList<Organisme> dunia = new ArrayList<Organisme>();
        FirstPlayer player1;
        SecondPlayer player2;
        int width;
        int height;
        

///Administrator///=========================================================================
	private int size=10; //banyak makhluk maksimal
	private int count=0; //banyak makhluk dalam daftar
	//private Vector<MakhlukHidup> daftar = new Vector<MakhlukHidup>(10);//array pointer objek makhluk
        
///Konduktor///=============================================================================
    private int lifeState = 1;
    private int Count = 0;

//public//=============================================================================================
        
//World//==============================================================================================
	/**
	 *  A constructor of World class
	 */
        public World() {
            width   = 1366;
            height = 768;
            this.setPreferredSize(new Dimension(1366, 768));
            this.pack();
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.addKeyListener(new ListenKey(this));
        }
        /**
	 *  Store an empty world (all dot)
	 */
        public void printDunia() {
           
        }
        /**
	 *  Draw an empty world (all dot)
	 */
        public void cetak(String string) {
            System.out.println(string);
        }
    public void initDisplay() throws ExceptionInInitializerError
	{
        
	}
        
        
//=======================================================================================
	/**
	 *  Draw all current object within world
	 */
    public void updateDisplay() throws ExceptionInInitializerError
	{
        repaint();
	}
        
        /**
	 * update the position of a makhlukhidup within world matrix
         * @param i is index of would be updated makhlukhidup
	 */
	public void updateGame() throws ExceptionInInitializerError
	{
            //gerak
            player1.getPosition().geser(1,1);
            player2.getPosition().geser(1,1);
            for(Organisme o : dunia)
            {
                MoveThread m = new MoveThread(o);
                m.start();
            }
            
            //reaksi
            int i = 0;
            int j = 0;
            for(Organisme o : dunia)
            {
                if(o != null)
                {
                    j=0;

                    for(Organisme oo : dunia)
                    {
                        if(i != j)
                        {
                            o.Reaction(oo);
                        }
                        j++;
                    }
                    i++;
                }
            }
            
            //cek lokasi
            for(Organisme o : dunia)
            {
                if(o != null && o.isOutside(width, height))
                {
                    o.setMati(true);
                }
            }
            
            //pluck yang mati
            i = 0;
            ArrayList<Integer> removeList = new ArrayList<Integer>();
            for(Organisme o : dunia)
            {
                if(o != null && o.isMati())
                {
                    removeList.add(i);
                }
                i++;
            }
            for(Integer k:removeList)
            {
                dunia.remove(k);
            }
	}

    public void clear(Graphics g)
    {
        g.clearRect(0, 0, getWidth(), getHeight());
    }
    

    public void paint(Graphics g) 
    {
        super.paint(g);
        clear(g);

        int x = 0;
        int y = 0;
        
        x = player1.getPosition().getAbsis();
        y = player1.getPosition().getOrdinat();
        g.drawString("Z", x, y);
        
        x = player2.getPosition().getAbsis();
        y = player2.getPosition().getOrdinat();
        g.drawString("Z", x, y);

        for(Organisme o : dunia)
        {       
            x = o.getPosition().getAbsis();
            y = o.getPosition().getOrdinat();
            g.setColor(Color.black);
            g.fillOval(x, y, 10, 10);
        }
    }
	/*  Draw display at Pc and remove the previous drawing at Px
         *  @param Px is previous position that would be erased
         *  @param Pc is the new position that would be drawn
         *  @param display is the character that would be drawn at Pc
	*/

	public boolean isGameOver()
	{
		return true;
	}
        /**
	 *  Save current world in txt format
	 */
	public void tangkapLayar() throws IOException, NullPointerException
	{
		
	}
        /**
 	*  create a new MakhlukHidup and put it in monitored list
        *  @param P is position where the new creation will be created
        *  @param opsi determine what MakhlukHidup is created
 	*/	
	//public void creation(Point P, char opsi)
	{

	}
        /**
 	*  make Mati attributes of all MakhlukHidup in daftar = true
 	*/	
	public void killAll()
	{

	}

    public void add(Organisme o)
    {
        dunia.add(o);
    }
    
    public void registerPlayer1(FirstPlayer p)
    {
        player1= p;
    }
    
    public void registerPlayer2(SecondPlayer p)
    {
        player2 = p;
    }
    
    public void setPlayer1Direction(int i)
    {
        player1.setArah(i);
    }
    
    public void setPlayer2Direction(int i)
    {
        player1.setArah(i);
    }

    public void pause()
    {
        lifeState = 0;
    }
    
    public void resume()
    {
        lifeState = 1;
    }
    
    public boolean isPaused()
    {
        return(lifeState == 0);
    }
    
    
}
