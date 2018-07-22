/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blok.gui;

import java.awt.Window;

import blok.interfaces.IControlerSimulator;

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
            	IControlerSimulator mainWindow = new MainWindow();
                ( (Window) mainWindow).setVisible(true);
            }
        });
    }
}
