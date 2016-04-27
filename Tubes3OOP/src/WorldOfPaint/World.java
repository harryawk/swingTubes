package WorldOfPaint;

import Builder.ListOfOrganisme;
import java.lang.*;
import Controller.ListenKey;
import Movement.*;
import Organism.*;
import java.util.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Color;
import java.io.*;

/**
 *  A World is a singleton that 
 *  contains information of all object within it and capable to display them.
 *  @author Harry Alvin
 */
public class World extends JPanel{
        /**
         * Dunia[][] to store the world's frame
         * size the limit of MakhlukHidup in World
         * count counter of MakhlukHidup currently in World
         * daftar the list of things that instance of MakhlukHidup
         * lifeState indicates the MakhlukHidup has died or not yet
         * Count counter of age
         * clear() void to clear the console screen
         */
        ListOfOrganisme dunia = new ListOfOrganisme();
        FirstPlayer player1;
        SecondPlayer player2;
        int width;
        int height;
        long lastTime;
        long worldTimer = 30;

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
            setFocusable(true);   
            requestFocusInWindow();
            this.addKeyListener(new ListenKey(this));
            lastTime = System.currentTimeMillis();
        }
        /**
	 *  Store an empty world (all dot)
	 */
        public void printDunia() {
           
        }
        
    /**
     *
     * @param string
     */
    public void cetak(String string) {
            System.out.println(string);
        }

    /**
     *
     * @throws ExceptionInInitializerError
     */
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
     *
     * @throws ExceptionInInitializerError
     */
    public void updateGame() throws ExceptionInInitializerError
	{
            //update waktu
            long passedTime = (System.currentTimeMillis() - lastTime)/1000;
            if(passedTime > 0)
            {
                lastTime = System.currentTimeMillis();
                worldTimer -= passedTime;
            }
                 
            
            //gerak
            MoveThread m = new MoveThread(player1);
                m.start();
            m = new MoveThread(player2);
                m.start();
            for(Organisme o : dunia.getList())
            {
                m = new MoveThread(o);
                m.start();
            }
            
        //reaksi
            int i = 0;
            int j = 0;
            
            //player terhadap player
            player1.Reaction(player2);
            player2.Reaction(player1);
            
            //player terhadap NPC
            for(Organisme o : dunia.getList())
            {
                player1.Reaction(o);
                player2.Reaction(o);
            }
            
            //npc terhadap player
            for(Organisme o : dunia.getList())
            {
                o.Reaction(player1);
                o.Reaction(player2);
            }
            
            //npc terhadap npc
            for(Organisme o : dunia.getList())
            {
                if(o != null)
                {
                    j=0;

                    for(Organisme oo : dunia.getList())
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
            /*
            for(Organisme o : dunia)
            {
                if(o != null && o.isOutside(width, height))
                {
                    o.setMati(true);
                }
            }
            */
            
            //pluck yang mati
            i = 0;
            ArrayList<Integer> removeList = new ArrayList<Integer>();
            for(Organisme o : dunia.getList())
            {
                if(o != null && o.isMati())
                {
                    removeList.add(i);
                }
                i++;
            }
            for(Integer k:removeList)
            {
                dunia.deleteOrganismeAt(k.intValue());
            }
	}

    /**
     *
     * @param g
     */
    public void clear(Graphics g)
    {
        g.clearRect(0, 0, getWidth(), getHeight());
    }

    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        clear(g);
        
        g.setColor(Color.black);
        g.drawString(Long.toString(worldTimer), 700, 80);
        g.drawRect(95, 95, width-190, height-190);
        
        int x = 0;
        int y = 0;
        
        x = player1.getPosition().getAbsis();
        y = player1.getPosition().getOrdinat();
        g.setColor(player1.getColor());
        g.fillOval(x, y, 20, 20);
        
        x = player2.getPosition().getAbsis();
        y = player2.getPosition().getOrdinat();
        g.setColor(player2.getColor());
        g.fillOval(x, y, 20, 20);

        for(Organisme o : dunia.getList())
        {       
            x = o.getPosition().getAbsis();
            y = o.getPosition().getOrdinat();
            g.setColor(o.getColor());
            g.fillOval(x, y, 20, 20);
        }
        
        if(GameOver())
        {
            g.setColor(Color.black);
            if(player1.isMati())
            {
                g.drawString("GameOver: kalah", 600, 720);
            }
            else if(player2.isMati())
            {
                g.drawString("GameOver: menang", 600, 720);
            }
            else if(isTimeout())
            {
                g.drawString("GameOver: timeout", 600, 720);
            }
        }
    }
	/*  Draw display at Pc and remove the previous drawing at Px
         *  @param Px is previous position that would be erased
         *  @param Pc is the new position that would be drawn
         *  @param display is the character that would be drawn at Pc
	*/

    /**
     *
     * @return
     */
    public boolean GameOver()
	{
            if(player1.isMati() || player2.isMati())
            {
                return true;
            }

            return (isTimeout());
	}
     
    /**
     *
     * @throws IOException
     * @throws NullPointerException
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

    /**
     *
     * @param o
     */
    public void add(Organisme o)
    {
        dunia.addOrganisme(o);
    }
    
    /**
     *
     * @param p
     */
    public void registerPlayer1(FirstPlayer p)
    {
        player1= p;
    }
    
    /**
     *
     * @param p
     */
    public void registerPlayer2(SecondPlayer p)
    {
        player2 = p;
    }
    
    /**
     *
     * @param i
     */
    public void setPlayer1Direction(int i)
    {
        player1.setArah(i);
    }
    
    /**
     *
     * @param i
     */
    public void setPlayer2Direction(int i)
    {
        player2.setArah(i);
    }

    /**
     *
     */
    public void pause()
    {
        lifeState = 0;
    }
    
    /**
     *
     */
    public void resume()
    {
        lifeState = 1;
    }
    
    /**
     *
     * @return
     */
    public boolean isPaused()
    {
        return(lifeState == 0);
    }
    
    /**
     *
     * @return
     */
    public boolean isTimeout()
    {
        return(worldTimer <= 0);
    }
   
}
