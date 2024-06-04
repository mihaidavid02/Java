package aplicatia3de;

public class Point {
    private float x;
    private float y;
    
    //CONSTRUCTOR
    public Point(float x,float y){
    }
    
    //METODE
    public void changeCoords(float x,float y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
