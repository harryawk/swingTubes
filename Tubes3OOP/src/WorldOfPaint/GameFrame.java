/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldOfPaint;

import Movement.Point;
import Organism.FirstPlayer;
import Organism.Food;
import Organism.NPCEater;
import Organism.SecondPlayer;
import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author CXXXV
 */
public class GameFrame extends JFrame {
    private World w;
    
    public GameFrame()
    {
        w = new World();
        add(w);
        setPreferredSize(new Dimension(1366, 768));
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //inisialisasi makhluk
        NPCEater o1 = new NPCEater("wawa");
        NPCEater o2 = new NPCEater("wawa");
        NPCEater o3 = new NPCEater("wawa");
        
        Food f1 = new Food();
        Food f2 = new Food();
        Food f3 = new Food();
        Food f4 = new Food();
        
        FirstPlayer pl1 = new FirstPlayer("1");
        SecondPlayer pl2 = new SecondPlayer("2");

        Point p1 = new Point(50, 300);
        Point p2 = new Point(500, 500);
        Point p3 = new Point(350, 700);
        Point p4 = new Point(700, 500);
        Point p5 = new Point(700, 300);
        Point p6 = new Point();
        Point p7 = new Point();
        Point p8 = new Point();
        Point p9 = new Point();

        o1.setPosition(p1);
        o2.setPosition(p2);
        o3.setPosition(p3);
        
        pl1.setPosition(p4);
        pl2.setPosition(p5);
        
        f1.setPosition(p6);
        f2.setPosition(p7);
        f3.setPosition(p8);
        f4.setPosition(p9);

        w.add(o1);
        w.add(o2);
        w.add(o3);
        w.registerPlayer1(pl1);
        w.registerPlayer2(pl2);
        w.add(f1);
        w.add(f2);
        w.add(f3);
        w.add(f4);
    }
    
    public void updateGame()
    {
        w.updateGame();
    }
    public void updateDisplay()
    {
        w.updateDisplay();
        repaint();
    }
    public boolean GameOver()
    {
        return w.GameOver();
    }

}
