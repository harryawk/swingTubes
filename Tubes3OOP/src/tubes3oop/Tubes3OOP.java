/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes3oop;

import WorldOfPaint.*;
import Movement.*;
import Organism.*;

/**
 *
 * @author Ali-pc
 */
public class Tubes3OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
	{
		World w = new World();

                Organisme o1 = new Eater();
		Organisme o2 = new Eater();
		Organisme o3 = new Eater();
                
		Point p1 = new Point(50, 50);
		Point p2 = new Point(500, 500);
		Point p3 = new Point(350, 700);
                
                o1.setPosisi(p1);
                o2.setPosisi(p2);
                o3.setPosisi(p3);

		w.add(o1);
		w.add(o2);
		w.add(o3);

		//game-loop
		while(true)
		{
			w.updateGame();
			w.updateDisplay();
			

			try
	        {
	            Thread.sleep(166);
	        }
	        catch(Exception e)
	        {

	        }
		}
	}
    
}
