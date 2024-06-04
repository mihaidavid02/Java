package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nr=sc.nextInt();
        
        int rest5=nr%5;
        int rest3=nr%3;
        
        if(rest5==0){
            System.out.print("Fuzz");
        }
        if(rest3==0){
            System.out.print("Buzz");
        }
        if(rest3!=0 && rest5!=0){
            System.out.println(nr);
        }     
    }
}
