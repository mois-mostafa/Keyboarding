/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboarding;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.Object;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Mostafa
 */
public class KeyboardingManifest extends JFrame implements KeyListener{
    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private String line4 = "";
    private long time1 = 0;
    private long time2 = 0;
    private JTextField inputArea;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JButton button;
    
    public KeyboardingManifest(){
        super("Demonstrating Keystroke Events");
        Window();
        // Keyboard();
    }

    private void Window(){
        inputArea = new JTextField(20);
        inputArea.addKeyListener(this);

        textArea = new JTextArea();
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);

        add(textArea);
        addKeyListener(this);
        
        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(375, 125));

        button = new JButton("Clear");
        button.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    textArea.setText("");
                    inputArea.setText("");
                    inputArea.requestFocusInWindow();
                }
            }
        );
        
        getContentPane().add(inputArea, BorderLayout.PAGE_START);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.PAGE_END);
    }

    // private void Keyboard(){

    // }
    
    public void keyPressed(KeyEvent event){
        time1 = System.currentTimeMillis();
        time2 = System.currentTimeMillis();
        line1 = String.format("Key Pressed: %s", KeyEvent.getKeyText(event.getKeyCode()));
        setLines2and3(event);
    }
    
    public void keyReleased(KeyEvent event){
        line1 = String.format("Key released: %s", KeyEvent.getKeyText(event.getKeyCode()));
        setLines2and3(event);
    }
    
    public void keyTyped(KeyEvent event){
        line1 = String.format("Key typed: %s", event.getKeyChar());
        setLines2and3(event);
    }

    private void setLines2and3(KeyEvent event){
        line2 = String.format("This key is %san action key", event.isActionKey() ? "" : "not ");
        String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
        line3 = String.format("Modifier keys pressed: %s", (temp.equals("") ? "none" : temp));
        float time = (time2 - time1)/1000;
        line4 = String.format("Time = %s", Float.toString(time)); 
        textArea.append(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
    
}
