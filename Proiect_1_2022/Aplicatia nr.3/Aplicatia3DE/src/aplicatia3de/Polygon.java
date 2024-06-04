package aplicatia3de;

public class Polygon {
    Point puncte[];
    
    //CONSTRUCTORI
    public Polygon(int n){
        puncte=new Point[n];
        for(int i=0;i<n;i++){
            puncte[i]=new Point(0,0);
        }
    }
    
    public Polygon(int vect[],int n){
        this(n);
        for(int i=0;i<n;i=i+2){
            puncte[i].changeCoords(vect[i], vect[i+1]);
        }
    }
}
