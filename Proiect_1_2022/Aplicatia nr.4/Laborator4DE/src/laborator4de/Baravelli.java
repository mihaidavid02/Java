package laborator4de;

public class Baravelli extends CandyBox{
    float radius;
    float height;
    
    //CONSTRUCTORI
    public Baravelli(){
        radius=(float)0.0;
        height=(float)0.0;
    }
    
    public Baravelli(String flavour,String origin,float radius,float height){
        super(flavour,origin);
        this.radius=radius;
        this.height=height;
    }
    
    //SUPRASCRIERE
    @Override
    public float getVolume(){
        return radius*radius*height;
    }
    
    @Override
    public String toString(){
        return "Baravelli: "+super.toString()+" chocolate has volume "+getVolume();
    }
    
    //METODE
    public void printBaravelliDim(){
        System.out.println("Raza: "+radius);
        System.out.println("Inaltime: "+height);
    }
}
