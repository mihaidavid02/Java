package Seminar2Floare;

import java.awt.*;  //clasele Color si Graphics 
import java.awt.geom.*; //pentru crearea formelor geometrice  
import javax.swing.*; 

public class Dreptunghi extends JComponent{
    public void Dreptunghi(Graphics2D g2D){
    }

    void desenareDreptunghi(Graphics2D g2D) {
        Rectangle2D.Double r=new Rectangle2D.Double(0,0,640,480);
        g2D.setColor(Color.BLACK);
        g2D.fill(r); 
    }
}
