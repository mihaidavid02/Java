package calculcredit;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculCredit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Valoare credit in dolari: ");
        int valCredit=sc.nextInt();
        while(valCredit<1000 || valCredit>100000){
            System.out.println("Valoarea creditului trebuie sa fie intre 1000$ si 100000$");
            valCredit=sc.nextInt();
        }
        
        System.out.println("Dobanda anuala: ");
        int dobandaAnuala=sc.nextInt();
        while(dobandaAnuala<0 || dobandaAnuala>10){
            System.out.println("Valoarea dobandei trebuie sa fie intre 0% si 10%$");
            dobandaAnuala=sc.nextInt();
        }
        
        System.out.println("Perioada credit:");
        int perioada=sc.nextInt();
        while(perioada<1 || perioada>30){
            System.out.println("Perioada trebuie sa fie intre 1 si 30 de ani");
            perioada=sc.nextInt();
        }
        
        // i) Calcul rata lunara
        int dobandaLunara=dobandaAnuala/100/12; //dobanda lunara
        int nrPlati=perioada*12; //numar plati
        double m=valCredit*(dobandaLunara*Math.pow(1+dobandaLunara,nrPlati))/((Math.pow(1+dobandaLunara,nrPlati)-1));     
        
        /*String rataLunara=NumberFormat.getCurrencyInstance().format(123456.789);
        rataLunara=Double.toString(m);
        */
        System.out.println('$'+m);
        
    }
    
}
