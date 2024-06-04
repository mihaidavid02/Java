package aplicatia3;

public class Dealership extends Car implements Offer{

    Dealership(Car car){
        super(car.pret,car.tip,car.anFabricatie);
    }
    
    Dealership(int pret, CarType tip, int anFabricatie) {
        super(pret, tip, anFabricatie);
    }

    private int BrandOffer(Car car){
        if(null!=car.tip) switch (car.tip) {
            case Mercedes -> {
                int nr=(int) (car.pret*0.05);
                getDiscount(car,nr);
                System.out.println("Applying Brand discount: "+nr+" euros.");
            }
            case Fiat -> {
                int nr=(int) (car.pret*0.1);
                getDiscount(car,nr);
                System.out.println("Applying Brand discount: "+nr+" euros.");
            }
            case Skoda -> {
                int nr=(int) (car.pret*0.15);
                getDiscount(car,nr);
                System.out.println("Applying Brand discount: "+nr+" euros.");
            }
            default -> {
            }
        }
        return 0;
    }
    
    private int DealerOffer(Car car){
        if(null!=car.tip) switch (car.tip) {
            case Mercedes -> {
                int nr=300*car.anFabricatie;
                getDiscount(car,nr);
                System.out.println("Applying Dealer discount: "+nr+" euros.");
            }
            case Fiat -> {
                int nr=100*car.anFabricatie;
                getDiscount(car,nr);
                System.out.println("Applying Dealer discount: "+nr+" euros.");
            }
            case Skoda -> {
                int nr=150*car.anFabricatie;
                getDiscount(car,nr);
                System.out.println("Applying Dealer discount: "+nr+" euros.");
            }
            default -> {
            }
        }
        return 0;
    }
    
    private int SpecialOffer(Car car){
        int randomNum=20+(int)(Math.random()*980);
        getDiscount(car,randomNum);
        System.out.println("Applying Special discount: "+randomNum+" euros.");
        return 0;
    }
    
    int getFinalPrice(Car car){
        car.pret=BrandOffer(car);
        car.pret=DealerOffer(car);
        car.pret=SpecialOffer(car);
        return car.pret;
    }
    
    public void negotiate(Car car, double offer){
        getDiscount(car,car.pret*offer);
    }
    
    @Override
    public int getDiscount(Car car, double nr) {
        return (int) (car.pret-nr);
    }
    
}
