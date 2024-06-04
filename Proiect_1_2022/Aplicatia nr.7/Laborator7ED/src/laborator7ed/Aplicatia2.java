package laborator7ed;

import java.util.Collection;
import java.util.Iterator;

class MyVector3 implements Sumabil{
    int[] vect;
    int size;

    @Override
    public void addValue(Sumabil value) {
        
    }

    @Override
    public int Sum(Collection<Sumabil> collection) {
        int sum=0;
        for(int i : vect){
            sum.addValue(i);
        }
    }
}

class MyMatrix implements Sumabil{
    int[][] matrix;
    int length, height;

    @Override
    public void addValue(Sumabil value) {
        
    }

    @Override
    public int Sum(Collection<Sumabil> collection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class Aplicatia2 {
    
}
