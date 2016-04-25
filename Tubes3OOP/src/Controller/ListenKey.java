/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import WorldOfPaint.*;
import Movement.Point;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import java.io.IOException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

/**
 * A class to listen keystroke that pressed by user while the application is running
 * @author Harry Alvin
 */
class ListenKey implements NativeKeyListener {
        
    private World world;

    public ListenKey() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println(ex.getMessage());
        }
        GlobalScreen.addNativeKeyListener(this);
    }
    @Override
    /**
     * nativeKeyPressed interface implementation
     * @param e NativeKeyEvent to take the key that pressed by user
     */
    public void nativeKeyPressed(NativeKeyEvent e) {
        Point P = new Point(30);
        switch (e.getKeyCode()) {
            case NativeKeyEvent.VC_0:
                world.creation(P,'0');
                break;
            case NativeKeyEvent.VC_1:
                world.creation(P,'1');
                break;
            case NativeKeyEvent.VC_2:
                world.creation(P,'2');
                break;
            case NativeKeyEvent.VC_3:
                world.creation(P,'3');
                break;
            case NativeKeyEvent.VC_4:
                world.creation(P,'4');
                break;
            case NativeKeyEvent.VC_5:
                world.creation(P,'5');
                break;
            case NativeKeyEvent.VC_6:
                world.creation(P,'6');
                break;
            case NativeKeyEvent.VC_7:
                world.creation(P,'7');
                break;
            case NativeKeyEvent.VC_8:
                world.creation(P,'8');
                break;
            case NativeKeyEvent.VC_9:
                world.creation(P,'9');
                break;
            case NativeKeyEvent.VC_X:
                world.killAll();
                break;
            case NativeKeyEvent.VC_SPACE:
                world.resume();
                break;
            case NativeKeyEvent.VC_C:
                try {
                    world.tangkapLayar();
                } catch (IOException e1) {
                    System.err.println("IOException retrieved");
                }
                break;
                //Step-by-step exec
            case NativeKeyEvent.VC_M:
                world.pause();
                boolean resume = false;
                ListenKey l = new ListenKey();
                while (!resume) {
                    l.nativeKeyPressed(e);
                    if (e.getKeyCode() == NativeKeyEvent.VC_SPACE) {
                        world.resume();
                    }
                    world.pause();
                    if (e.getKeyCode() == NativeKeyEvent.VC_M) {
                        resume = true;
                    }
                }
                break;
                //Pause
            case NativeKeyEvent.VC_P:
                world.pause();
                break;
            default:
                //Do Nothing
                break;
        }

    }
    
    @Override
    /**
     * Overrides the nativeKeyReleased method to be implemented
     * @param e 
     */
    public void nativeKeyReleased(NativeKeyEvent e) {
        //Do nothing
    }
    
    @Override
    /**
     * Overrides the nativeKeyTyped method to be implemented
     * @param e NativeKeyEvent, the characteristic of the keystroke
     */
    public void nativeKeyTyped(NativeKeyEvent e) {
        //Do Nothing
    }
    
    /**
     * Get the world which want to be integrated by ListenKey
     * @param W World
     */
    public void simpanWorld(World W) {
        world = W;
    }
    
    public void keyStroke() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
