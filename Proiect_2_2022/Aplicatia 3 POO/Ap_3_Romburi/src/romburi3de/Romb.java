package romburi3de;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import java.awt.geom.Path2D;

public class Romb{
    private int x,y;
    private Color color;
    
    public Romb(int x, int y,Color color) {
    this.x = x;
    this.y = y;
    this.color=color;
    }
    
 public void desenareRomb(Graphics2D g2D){ 
 //DESENARE ROMB
 Path2D.Double romb=new Path2D.Double();
 g2D.setColor(color);
 romb.moveTo(x, y);
 romb.lineTo(x+20, y+30);
 romb.lineTo(x, y+60);
 romb.lineTo(x-20, y+30);
 romb.lineTo(x, y);
 romb.closePath();
 g2D.fill(romb);
 } 
}
