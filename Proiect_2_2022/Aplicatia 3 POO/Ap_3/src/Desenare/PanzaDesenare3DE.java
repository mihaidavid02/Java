package temaDECasa;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import java.awt.geom.Path2D;

public class PanzaDesenare3DE extends JComponent{
    private int width, height;
 public PanzaDesenare3DE(int width, int height) {
 this.width = width;
 this.height = height;
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
 g2D.setColor(Color.CYAN);
 g2D.fill(bgr);
 
 
 AffineTransform record=g2D.getTransform();
 
 //CASA
 Path2D.Double p=new Path2D.Double();
 //ACOPERIS
 p.moveTo(100,200);
 p.lineTo(200,100);
 p.lineTo(400,100);
 p.lineTo(500,200);
 p.lineTo(100,200);
 p.closePath();

 //CLADIRE PROPRIU-ZISA
 Path2D.Double p1=new Path2D.Double();
 p1.moveTo(150,200);
 p1.lineTo(450,200);
 p1.lineTo(450,400);
 p1.lineTo(150,400);
 p1.lineTo(150,200);
 p1.closePath();
 //FERESTRE SI USI
 Path2D.Double p2=new Path2D.Double();
 p2.moveTo(200,250);    //Fereastra 1
 p2.lineTo(250,250);
 p2.lineTo(250,300);
 p2.lineTo(200,300);
 p2.lineTo(200,250);
 p2.closePath();
 
 p2.moveTo(350,250);    //Fereastra 2
 p2.lineTo(400,250);
 p2.lineTo(400,300);
 p2.lineTo(350,300);
 p2.lineTo(350,250);
 p2.closePath();
 
 p2.moveTo(250,350);    //Usi
 p2.lineTo(350,350);
 p2.lineTo(350,400);
 p2.lineTo(250,400);
 p2.lineTo(250,350);
 p2.closePath();
 
 //TRANSLATIE
 g2D.translate(100,0); 
 
 //ROTATIE IN JURUL COLTULUI STANGA-SUS AL FOII DE HARTIE
 g2D.rotate(Math.toRadians(15));
 
 //DESENARE SI COLORARE
 g2D.setColor(Color.RED);   //ACOPERIS
 g2D.fill(p);
 g2D.setColor(Color.ORANGE);    //CORP CLADIRE
 g2D.fill(p1);
 g2D.setColor(Color.YELLOW);    //FERESTRE SI USI
 g2D.fill(p2);
 
 
 }

}
