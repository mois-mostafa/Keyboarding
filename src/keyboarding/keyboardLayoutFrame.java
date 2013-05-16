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
public class KeyboardLayoutFrame extends JFrame {
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

    private JButton leftButton;
    private JButton rightButton;
    private JButton upButton;
    private JButton downButton;
    
    private JButton shift;
    private JButton control;
    private JButton alt;
    private JButton tab;
    private JButton enter;
    
    private FlowLayout layout;
    private Container container;
    
    public KeyboardLayoutFrame(){
        super("Keyboarding");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        one   = new JButton("1");
        two   = new JButton("2");
        three = new JButton("3");
        four  = new JButton("4");
        five  = new JButton("5");
        six   = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine  = new JButton("9");
        zero  = new JButton("0");

        A = new JButton("A");
        B = new JButton("B");
        C = new JButton("C");
        D = new JButton("D");
        E = new JButton("E");
        F = new JButton("F");
        G = new JButton("G");
        H = new JButton("H");
        I = new JButton("I");
        J = new JButton("J");
        K = new JButton("K");
        L = new JButton("L");
        M = new JButton("M");
        N = new JButton("N");
        O = new JButton("O");
        P = new JButton("P");
        Q = new JButton("Q");
        R = new JButton("R");
        S = new JButton("S");
        T = new JButton("T");
        U = new JButton("U");
        V = new JButton("V");
        W = new JButton("W");
        X = new JButton("X");
        Y = new JButton("Y");
        Z = new JButton("Z");

        leftButton  = new JButton("Left");
        rightButton = new JButton("Right");
        upButton    = new JButton("Up");
        downButton  = new JButton("Down");

        shift       = new JButton("Shift");
        control     = new JButton("Control");
        alt         = new JButton("Alt");
        tab         = new JButton("Tab");
        enter       = new JButton("Enter");
        
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

        add(Q);
        add(W);
        add(E);
        add(R);
        add(T);
        add(Y);
        add(U);
        add(I);
        add(O);
        add(P);
        add(A);
        add(S);
        add(D);
        add(F);
        add(G);
        add(H);
        add(J);
        add(K);
        add(L);
        add(Z);
        add(X);
        add(C);
        add(V);
        add(B);
        add(N);
        add(M);

        add(leftButton);
        add(rightButton);
        add(upButton);
        add(downButton);

        add(shift);
        add(control);
        add(alt);
        add(tab);
        add(enter);
        
        one.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
		
        two.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        three.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        four.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        five.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        six.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        seven.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        eight.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        nine.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        zero.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        A.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        B.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        C.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        D.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        E.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        F.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        G.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        H.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        I.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        J.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        K.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        L.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        M.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        N.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        O.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        P.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        Q.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        R.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        S.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        T.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
        U.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        V.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        W.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        X.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        Y.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        Z.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
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

        upButton.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        downButton.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        shift.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        control.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        alt.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        tab.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );

        enter.addActionListener(
                
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
                
        );
        
    }
    
    
}
