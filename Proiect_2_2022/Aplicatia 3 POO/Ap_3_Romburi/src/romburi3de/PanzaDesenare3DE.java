package romburi3de;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import java.awt.geom.Path2D;

public class PanzaDesenare3DE extends JComponent{
    private int width, height;
    private Romb romb1,romb2,romb3,romb4,romb5,romb6;
    public PanzaDesenare3DE(int width, int height) {
    this.width = width;
    this.height = height;
    romb1=new Romb(100,100,Color.GREEN);
    romb2=new Romb(150,100,Color.ORANGE);
    romb3=new Romb(200,100,Color.RED);
    romb4=new Romb(100,180,Color.cyan);
    romb5=new Romb(150,180,Color.blue);
    romb6=new Romb(200,180,Color.MAGENTA);
    }

@Override
 protected void paintComponent(Graphics g){
 Graphics2D g2D=(Graphics2D) g;

 //randarea/netezirea curbelor
 RenderingHints rh=new RenderingHints(RenderingHints.KEY_ANTIALIASING,
 RenderingHints.VALUE_ANTIALIAS_ON);
 g2D.setRenderingHints(rh);
 
 //definim fondul pe care desenam
 Rectangle2D.Double bgr=new Rectangle2D.Double(0,0,width,height);
 g2D.setColor(Color.WHITE);
 g2D.fill(bgr);
 
 //ROMB
 romb1.desenareRomb(g2D);
 romb2.desenareRomb(g2D);
 romb3.desenareRomb(g2D);
 romb4.desenareRomb(g2D);
 romb5.desenareRomb(g2D);
 romb6.desenareRomb(g2D);
 }
}
