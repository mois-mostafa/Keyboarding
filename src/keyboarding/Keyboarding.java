/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboarding;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Mostafa
 */
public class Keyboarding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dimension screenResolution = Toolkit.getDefaultToolkit().getScreenSize();
        
        KeyboardingManifest keyDemoFrame = new KeyboardingManifest();
        keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyDemoFrame.setSize(350,200);
        keyDemoFrame.setLocation(screenResolution.width/2-keyDemoFrame.getSize().width/2, screenResolution.height/6);
        keyDemoFrame.setVisible(true);
        
        KeyboardLayoutFrame keyboardLayout = new KeyboardLayoutFrame();
        keyboardLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyboardLayout.setSize(800,300);
        keyboardLayout.setLocation(screenResolution.width/2-keyboardLayout.getSize().width/2, screenResolution.height/2);
        keyboardLayout.setVisible(true);

        System.out.println(System.currentTimeMillis()/1000000);

    }
}
