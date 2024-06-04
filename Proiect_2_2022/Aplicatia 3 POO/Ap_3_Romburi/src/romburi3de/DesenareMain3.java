package romburi3de;

import java.awt.Color;
import javax.swing.JFrame;

public class DesenareMain3 {
    public static void main(String[] args) {
        int w=640, h=480;
        JFrame f=new JFrame("Azi desenam in Java");
        PanzaDesenare3DE pd=new PanzaDesenare3DE(w,h);
        f.add(pd);
        f.setSize(w,h);
        f.setLocationRelativeTo(null); //pune GUI in mijlocul ecranului
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        Romb romb1=new Romb(300,100,Color.GREEN);
    }
    
}
