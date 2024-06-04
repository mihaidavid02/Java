package aplicatia1;

public class Operation implements Minus,Plus,Mult,Div{
    float value;
    
    public float getNumber(){
        return value;
    }
    
    public Operation(float value){
    }
    
    @Override
    public void minus(float nr) {
        System.out.println(value-nr);
    }

    @Override
    public void plus(float nr) {
        System.out.println(value+nr);
    }

    @Override
    public void mult(float nr) {
        System.out.println(value*nr);
    }

    @Override
    public void div(float nr) {
        if(nr==0){
            System.out.println("Division by zero is not possible");
        }
        else
            System.out.println(value/nr);
    }
    
}
