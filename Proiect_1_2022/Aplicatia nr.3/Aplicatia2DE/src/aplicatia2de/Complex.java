package aplicatia2de;

public class Complex {
    private int real;
    private int imaginar;
    
    //CONSTRUCTORI
    public Complex(int a,int b){
    }
    
    public Complex(){
        this(0,0);
    }
    
    public Complex(Complex nrComplex){
        this.real=nrComplex.real;
        this.imaginar=nrComplex.imaginar;
    }
    
    //METODE
    public int getReal(){
        return real;
    }
    
    public int getImaginar(){
        return imaginar;
    }
    
    public void addWithComplex(Complex nrComplex){
        this.real+=nrComplex.real;
        this.imaginar+=nrComplex.imaginar;
    }
    
    public void showNumber(){
        if(imaginar>0){
            System.out.println(real+" + i * "+imaginar);
        }
        else
            if(imaginar<0){
                System.out.println(real+" - i * "+imaginar);
            }
            else
                System.out.println(real);
    }
}
