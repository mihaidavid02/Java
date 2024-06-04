package seminar2de;

import java.awt.*;  //clasele Color si Graphics 
import java.awt.geom.*; //pentru crearea formelor geometrice  
import javax.swing.*; 

public class PanzaDesenareDE extends JComponent{
     private int width, height;
     private NorDE n,n1,n2,n3;
     
     public PanzaDesenareDE(int width,int height){  
     this.width=width; 
     this.height=height; 
     //n=new NorDE();
     n1=new NorDE(10,50,75,Color.LIGHT_GRAY); 
     n2=new NorDE(200,75,90,Color.BLUE); 
     n3=new NorDE(420,60,85,Color.DARK_GRAY); 
     } 
  //Suprascriem metoda paintComponent a clasei JComponent 
     @Override  
     protected void paintComponent(Graphics g){  
        
        Graphics2D g2D=(Graphics2D) g; 
        
        /*NETEZIRE FORME*/
        RenderingHints rh=new RenderingHints( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
        //argumentele din constructor determina metoda de netezire 
        g2D.setRenderingHints(rh);  
        
        /*Desenare clasa NorDE*/
        //n.desenareNorDE(g2D);
        n1.desenareNorDE(g2D); 
        n2.desenareNorDE(g2D); 
        n3.desenareNorDE(g2D); 
        
        /* DREPTUNGHI*/
        /*
        Rectangle2D.Double r=new Rectangle2D.Double(50,75,100,250);
        g2D.setColor(new Color(100,150,250));//Cornflower blue 
        g2D.fill(r);  
        */
        
        /*ELIPSA*/
        /*
        Ellipse2D.Double e=new Ellipse2D.Double(200,75,100,100); 
        g2D.setColor(Color.RED); 
        g2D.fill(e);  
        */
        
        /*SEGMENT SI CONTUR CERC*/
        /*
         Line2D.Double line=new Line2D.Double(100,250,300,75);       
         g2D.setColor(Color.BLACK); 
         g2D.setStroke(new BasicStroke(5));//setarea grosimii liniei 
         g2D.draw(line);
         g2D.setColor(Color.BLUE); 
         g2D.draw(e);  
        */ 
        
         /*NOR*/
         /*
          Ellipse2D.Double e1=new Ellipse2D.Double(200,75,100,100); 
          Ellipse2D.Double e2=new Ellipse2D.Double(235,55,175,140); 
          Ellipse2D.Double e3=new Ellipse2D.Double(350,90,90,90); 
          Ellipse2D.Double e4=new Ellipse2D.Double(380,80,30,30); 
          g2D.setColor(Color.BLUE); 
          g2D.fill(e1); 
          g2D.fill(e2); 
          g2D.fill(e3); 
          g2D.fill(e4);  
          */
     } 
}
