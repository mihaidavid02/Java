package laborator7ed;

import java.lang.Comparable;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

class RandomNumbers{
    double nr;
    RandomNumbers(){
        nr=random()*100;
    }
}

class Copy{
    static <T> void CopyValues(T collection,T pqueue){
        pqueue.addAll(collection);
    }
}

class Iterate implements Iterable{
    
    @Override
    public <T> Iterator ExtraIterator(T collection) {
        Iterator<T> it=collection.iterator();
    }
    
}

public class Aplicatia1 {

    public static void main(String[] args) {
        
        PriorityQueue<RandomNumbers> pq=new PriorityQueue<>();
        pq.add(new RandomNumbers());
        
        LinkedList<RandomNumbers> nrList=new LinkedList<>();
        nrList.add(new RandomNumbers());
        
        Collection nrCollection=new ArrayList();
        nrCollection.add(new RandomNumbers());
        
        Iterator<Double> it=nrCollection.iterator();
        
        for(Object its : nrCollection){
            System.out.println(its);
        }
    }
    
}
