package Seminar2Floare;

import java.awt.*; 
import java.awt.geom.*; 

public class Floare {
    private double x,y; //stochează poziția florii 
     private double size;//dimensiunea florii
     private Color color;//culoarea petalelor
    
    public Floare(double x,double y, double size, Color color){ 
          this.x=x; 
          this.y=y; 
          this.size=size; 
          this.color=color; 
     }; 
    
    public void desenareFloare(Graphics2D g2D){
  
        //Floare
        Ellipse2D.Double mijloc=new Ellipse2D.Double(x,y,size,size); 
        Ellipse2D.Double petala=new Ellipse2D.Double(x,y,size,size*1.5); 
        Ellipse2D.Double frunza=new Ellipse2D.Double(x,y,size,size*2.5);
        
        g2D.setColor(Color.GREEN);
        g2D.fill(frunza);
        
        g2D.setColor(color);
        g2D.fill(petala); 
        g2D.rotate(Math.toRadians(45),x+size*0.5,y+size*0.5);
        g2D.fill(petala);
        g2D.rotate(Math.toRadians(45),x+size*0.5,y+size*0.5);
        g2D.fill(petala);
        g2D.rotate(Math.toRadians(45),x+size*0.5,y+size*0.5);
        g2D.fill(petala);
        g2D.rotate(Math.toRadians(45),x+size*0.5,y+size*0.5);
        g2D.fill(petala);
        g2D.rotate(Math.toRadians(45),x+size*0.5,y+size*0.5);
        g2D.fill(petala);
        g2D.rotate(Math.toRadians(45),x+size*0.5,y+size*0.5);
        g2D.fill(petala);
        g2D.rotate(Math.toRadians(45),x+size*0.5,y+size*0.5);
        g2D.fill(petala);
        
        g2D.setColor(Color.YELLOW); 
        g2D.fill(mijloc);
    }
}
