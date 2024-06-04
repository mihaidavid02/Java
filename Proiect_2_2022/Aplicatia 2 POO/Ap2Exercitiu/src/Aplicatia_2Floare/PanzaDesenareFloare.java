package Seminar2Floare;

import java.awt.*;  //clasele Color si Graphics 
import java.awt.geom.*; //pentru crearea formelor geometrice  
import javax.swing.*; 

public class PanzaDesenareFloare extends JComponent{
    private int width, height;
    private Floare floare1,floare2,floare3,floare4;
    private Dreptunghi dreptunghi;
    
    public PanzaDesenareFloare(int width,int height){  
        this.width=width; 
        this.height=height; 

        dreptunghi=new Dreptunghi();
        floare1=new Floare(170,80,40,Color.RED); 
        floare2=new Floare(80,200,60,Color.pink); 
        floare3=new Floare(100,350,70,Color.ORANGE); 
        floare4=new Floare(150,105,50,Color.MAGENTA);
     }
    
    @Override  
     protected void paintComponent(Graphics g){  
        
        Graphics2D g2D=(Graphics2D) g; 
        
        /*NETEZIRE FORME*/
        RenderingHints rh=new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
        //argumentele din constructor determina metoda de netezire 
        g2D.setRenderingHints(rh);  
        
        dreptunghi.desenareDreptunghi(g2D);
        floare1.desenareFloare(g2D); 
        floare2.desenareFloare(g2D); 
        floare3.desenareFloare(g2D);
        floare4.desenareFloare(g2D);
     }
}
