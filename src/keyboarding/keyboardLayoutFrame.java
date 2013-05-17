/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keyboarding;


import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author Mostafa
 */
public class keyboardLayoutFrame extends JFrame {
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
    private JButton SEMI;
    
    
    public keyboardLayoutFrame(){
        super("Keyboard Layout");
        setLayout(new FlowLayout());
        
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
        SEMI = new JButton(";");
        
        
        
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
        add(SEMI);
        add(Z);
        add(X);
        add(C);
        add(V);
        add(B);
        add(N);
        add(M);
        
        
        
        
        
        
        
    }
}
