/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.gui;

import java.awt.Window;

import block.core.Core;
import block.core.MainWindowControler;
import blok.interfaces.ICore;
import blok.interfaces.IUIControler;

/**
 *
 * @author sandroandrade
 */
public class Blok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               
             	IUIControler mainWindow = new MainWindowControler(2);
                
                ICore core  = new Core(mainWindow);
            	 
              //  ICore core  = new Core();
                core.initGame();
            }
            
        });
    }
}
