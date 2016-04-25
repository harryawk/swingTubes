package WorldOfPaint;

import Movement.*;
import Organism.*;
import java.util.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
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
            this.setPreferredSize(new Dimension(1366, 768));
            this.pack();
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        /**
	 *  Store an empty world (all dot)
	 */
        public void printDunia() {
           
        }
        /**
	 *  Draw an empty world (all dot)
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
	 * update the position of a makhlukhidup within world matrix
         * @param i is index of would be updated makhlukhidup
	 */
	public void updateGame() throws ExceptionInInitializerError
	{
            for(Organisme o : dunia)
            {
                o.getPosition().geser(5,5);
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

        for(Organisme o : dunia)
        {       
            x = o.getPosition().getAbsis();
            y = o.getPosition().getOrdinat();
            g.drawString("Z", x, y);
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