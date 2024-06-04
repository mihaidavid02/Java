package laborator7ed;

import java.util.Collection;

public interface Sumabil {
    void addValue(Sumabil value);   
    //adună la valoarea curentă (stocată în instanța ce apelează metoda) 
    //o altă valoare, aflată într-o instanță cu același tip 
    
    int Sum(Collection<Sumabil> collection);
    //primește o colecție generică cu elemente de tipul Sumabil 
    //și returnează suma tuturor elementelor din colecție
}
