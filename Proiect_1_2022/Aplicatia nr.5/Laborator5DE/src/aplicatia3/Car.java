package aplicatia3;

public class Car {
    int pret;
    CarType tip;
    int anFabricatie;
    
    enum CarType{
        Mercedes,
        Fiat,
        Skoda
    }
    
    Car(int pret,CarType tip,int anFabricatie){
        this.pret=pret;
        this.tip=tip;
        this.anFabricatie=anFabricatie;
    }
    
    @Override
    public String toString(){
        return "Car{price=" + pret + ", carType=" + tip + ", year+" + anFabricatie;
    }
}
