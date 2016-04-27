/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldOfPaint;

import Builder.OrganismeBuilder;
import static Builder.OrganismeBuilder.makeFood;
import Movement.Point;
import Organism.FirstPlayer;
import Organism.Food;
import Organism.NPCEater;
import Organism.SecondPlayer;
import com.sun.corba.se.impl.orbutil.ObjectWriter;
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
        w.registerPlayer1(OrganismeBuilder.makeFirstEater());
        w.registerPlayer2(OrganismeBuilder.makeSecondEater());
        
        //Make food
        for (int i = 1; i <= 4; i++){
            w.add(OrganismeBuilder.makeEaterNPC());
        }
        
        //Make food
        for (int i = 1; i <= 10; i++){
            w.add(OrganismeBuilder.makeFood());
        }
        
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
