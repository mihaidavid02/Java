package seminar2de;

import javax.swing.*;

public class DesenareMainDE {
    public static void main(String[] args) {
        int w=640, h=480;   //lungimea width=w, inaltimea height=h a frame-ului 
        JFrame f=new JFrame(); 
        
        PanzaDesenareDE pd=new PanzaDesenareDE(w,h); 
        f.add(pd); 
        
        f.setSize(w,h); 
        f.setTitle("Azi desenam in Java"); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setVisible(true); 
    }
    
}
