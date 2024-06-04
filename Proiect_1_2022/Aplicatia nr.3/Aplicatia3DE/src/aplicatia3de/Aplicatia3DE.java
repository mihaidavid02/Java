package aplicatia3de;

public class Aplicatia3DE {
    public static void main(String[] args) {
        int vect[]={1,0,4,8,2,4,3,6};
        
        Polygon polygon=new Polygon(vect,8);
        
        //AFISARE
        for(int i=0;i<8;i++){
            polygon.puncte[i].toString();
        }
    }
    
}
