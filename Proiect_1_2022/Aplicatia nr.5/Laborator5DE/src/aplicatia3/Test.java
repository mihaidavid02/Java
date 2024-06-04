package aplicatia3;

import java.util.ArrayList;
import java.util.Iterator;

public class Test extends Dealership{
    public static void main(String[] args){   
        
        ArrayList<Car> masini=new ArrayList<>();
        masini.add(new Car(20000,CarType.Mercedes,2010));
        masini.add(new Car(35000,CarType.Mercedes,2015));
        masini.add(new Car(3500,CarType.Fiat,2008));
        masini.add(new Car(7000,CarType.Fiat,2010));
        masini.add(new Car(12000,CarType.Skoda,2015));
        masini.add(new Car(25000,CarType.Skoda,2021));
    
        ArrayList<Dealership> dealership=new ArrayList<>();
        for(int i=0;i<6;i++){
            dealership.add(new Dealership(masini.get(i)));
        }
        
        Iterator<Dealership> iterator=dealership.iterator();
        while(iterator.hasNext()){
            getFinalPrice(iterator.next());
        }
    }

    
    //Task 3
    Car car1= new Car(20000,CarType.Mercedes,2019);
    negotiate(car1,(double)0.05);
    
    //Task 4
    ArrayList<Car> masiniLambda=new ArrayList<>();
        masiniLambda.add(new Car(30000,CarType.Mercedes,2019));
        masiniLambda.add(new Car(50000,CarType.Mercedes,2021));
        masiniLambda.add(new Car(10000,CarType.Fiat,2018));
        masiniLambda.add(new Car(20000,CarType.Skoda,2019));
    Iterator<Car> iteratorCar=masiniLambda.iterator();
    //Afisare lista initiala
    for(iteratorCar.hasNext()){
        System.out.println(iteratorCar.next());
    };
    //Eliminare masini cu pret peste 25000
    masiniLambda.removeIf((e) -> e.pret()>25000);
    //Afisare lista finala
    for(iteratorCar.hasNext()){
        System.out.println(iteratorCar.next());
    };
    
    public Test(Car car) {
        super(car);
    }
}
