package laborator4de;

public class ChocAmor extends CandyBox{
    float length;
    
    //CONSTRUCTORI
    public ChocAmor(){
        length=(float)0.0;
    }
    
    public ChocAmor(String flavor,String origin,float length){
        super(flavor,origin);
        this.length=length;
    }
    
    //SUPRASCRIERE
    @Override
    public float getVolume(){
        return length*length*length;
    }
    
    @Override
    public String toString(){
        return "ChocAmor: "+super.toString()+" chocolate has volume "+getVolume();
    }
    
    //METODE
    public void printChocAmorDim(){
        System.out.println("Lungime: "+length);
    }
}
