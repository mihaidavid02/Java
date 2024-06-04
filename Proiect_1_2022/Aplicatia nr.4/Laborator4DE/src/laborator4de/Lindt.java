package laborator4de;

public class Lindt extends CandyBox{
    float length;
    float width;
    float height;
    
    //CONSTRUCTORI
    public Lindt(){
        length=(float)0.0;
        width=(float)0.0;
        height=(float)0.0;
    }
    
    public Lindt(String flavor,String origin,float length,float width,float height){
        super(flavor,origin);
        this.length=length;
        this.width=width;
        this.height=height;
    }
    
    //SUPRASCRIERE
    @Override
    public float getVolume(){
        return length*width*height;
    }
    
    @Override
    public String toString(){
        return "Lindt: "+super.toString()+" chocolate has volume "+getVolume();
    }
    
    //METODE
    public void printLindtDim(){
        System.out.println("Lungime: "+length);
        System.out.println("Latime: "+width);
        System.out.println("Inaltime: "+height);
    }
}
