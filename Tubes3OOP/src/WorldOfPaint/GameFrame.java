/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldOfPaint;

import Builder.OrganismeBuilder;
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
    
    /**
     *
     */
    public GameFrame()
    {
        w = new World();
        add(w);
        setPreferredSize(new Dimension(1366, 768));
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //inisialisasi makhluk
        NPCEater o1 = new NPCEater();
        NPCEater o2 = new NPCEater();
        NPCEater o3 = new NPCEater();
        
        Food f1 = new Food();
        Food f2 = new Food();
        Food f3 = new Food();
        Food f4 = new Food();
        Food f5 = new Food();
        Food f6 = new Food();
        Food f7 = new Food();
        Food f8 = new Food();
        Food f9 = new Food();
        
        
        FirstPlayer pl1 = new FirstPlayer();
        pl1.setArah(0);
        SecondPlayer pl2 = new SecondPlayer();

        w.add(o1);
        w.add(o2);
        w.add(o3);
        w.registerPlayer1(pl1);
        w.registerPlayer2(pl2);
        w.add(f1);
        w.add(f2);
        w.add(f3);
        w.add(f4);
        w.add(f5);
        w.add(f6);
        w.add(f7);
        w.add(f8);
        w.add(f9);
        
    }
    
    /**
     *
     */
    public void updateGame()
    {
        w.updateGame();
    }

    /**
     *
     */
    public void updateDisplay()
    {
        w.updateDisplay();
        repaint();
    }

    /**
     *
     * @return
     */
    public boolean GameOver()
    {
        return w.GameOver();
    }

}
