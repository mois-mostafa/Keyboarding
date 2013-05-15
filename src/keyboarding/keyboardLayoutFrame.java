/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboarding;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author Mostafa
 */
public class keyboardLayoutFrame extends JFrame {
    private JButton leftButton;
    private JButton rightButton;
    private JButton upButton;
    private JButton downButton;
    private JButton shift;
    private JButton control;
    private JButton alt;
    private JButton tab;
    private JButton enter;
    
    
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    
    
    private JButton A;
    private JButton B;
    private JButton C;
    private JButton D;
    private JButton E;
    private JButton F;
    private JButton G;
    private JButton H;
    private JButton I;
    private JButton J;
    private JButton K;
    private JButton L;
    private JButton M;
    private JButton N;
    private JButton O;
    private JButton P;
    private JButton Q;
    private JButton R;
    private JButton S;
    private JButton T;
    private JButton U;
    private JButton V;
    private JButton W;
    private JButton X;
    private JButton Y;
    private JButton Z;
    
    
    private FlowLayout layout;
    private Container container;
    
    public keyboardLayoutFrame(){
        super("Keyboarding");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);
        
        leftButton = new JButton("Left");
        rightButton = new JButton("Right");
        upButton = new JButton("Up");
        downButton = new JButton("Down");
        shift = new JButton("Shift");
        control = new JButton("Control");
        alt = new JButton("Alt");
        tab = new JButton("Tab");
        enter = new JButton("Enter");
        
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        
        
        
        add(leftButton);
        add(rightButton);
        add(upButton);
        add(downButton);
        add(shift);
        add(control);
        add(alt);
        add(tab);
        add(enter);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);
        
        leftButton.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
		
        rightButton.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        rightButton.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        
    }
    
    
}
