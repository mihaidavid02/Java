package laborator4de;

public class CandyBox {
    private String flavor;
    private String origin;
    
    //CONSTRUCTORI
    public CandyBox(){
        flavor="sugar-free";
        origin="Switzerland";
    }
    
    public CandyBox(String flavor,String origin){
        this.flavor=flavor;
        this.origin=origin;
    }
    
    //METODE
    public float getVolume(){
        return 0;
    }
    
    public String getFlavor(){
        return flavor;
    }
    
    public String getOrigin(){
        return origin;
    }
    
    public void setFlavor(String flavor){
        this.flavor=flavor;
    }
    
    public void setOrigin(String origin){
        this.origin=origin;
    }
    
    //SUPRASCRIERE
    @Override
    public String toString(){
        return origin+" "+flavor+" chocolate";
    }
    
    public boolean equals(CandyBox Chocolate){
        if(this.flavor.equals(Chocolate.flavor) && this.origin.equals(Chocolate.origin)){
            return true;
        }
        else
            return false;
    }
}
