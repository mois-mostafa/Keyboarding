/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboarding;


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
        
        KeyboardingManifest keyDemoFrame = new KeyboardingManifest();
        keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyDemoFrame.setSize(350,100);
        keyDemoFrame.setVisible(true);
        
        keyboardLayoutFrame keyboardLayout = new keyboardLayoutFrame();
        keyboardLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyboardLayout.setSize(600,600);
        keyboardLayout.setVisible(true);
        
    }
}
