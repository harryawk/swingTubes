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
        int count = 0;

        NPCEater o1 = new NPCEater("wawa");
        NPCEater o2 = new NPCEater("wawa");
        NPCEater o3 = new NPCEater("wawa");

        Point p1 = new Point(50, 50);
        Point p2 = new Point(500, 500);
        Point p3 = new Point(350, 700);

        o1.setPosition(p1);
        o2.setPosition(p2);
        o3.setPosition(p3);

        w.add(o1);
        w.add(o2);
        w.add(o3);

        //game-loop
        while(true)
        {
            if(!w.isPaused())
            {
                w.updateGame();
                w.updateDisplay();
                
                if(count == 30)
                {
                    w.pause();
                }
            }
            count++;
            if(count > 70)
            {
                w.resume();
            }
            System.out.println(count);
            System.out.println(w.isPaused());
            try
            {
            Thread.sleep(33);
            }
            catch(Exception e)
            {

            }
        }
    }
}
