package laborator4de;

public class Laborator4DE {

    public static void main(String[] args) {
        
        //SUBPUNCTUL C
        CandyBox Choc[]=new CandyBox[2];
        Choc[0]=new Lindt();
        Choc[1]=new Lindt("Poland","milk",4,7,3);
        System.out.println(Choc[0].equals(Choc[1]));
        
        
    }
    
}
