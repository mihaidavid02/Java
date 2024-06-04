package seminar5exceptii;

public class Main {
    
    //Pentru metoda throw
    /*
    static void a(){
        try{
            System.out.println("Atentie, se arunca exceptia");
            throw new ArithmeticException("Aruncam exceptie de tip aritmetic");
            //System.out.println("Se va prinde?");
            //dupa throw nu punem alte instructiuni in try, genereaza RuntimeException
        }
        catch(ArithmeticException e){
            System.out.println("Prinsa exceptia de tip aritmetic");
        }
    }
    */
    
    //Pentru metoda throws
    
    static void a() throws ArithmeticException {
        System.out.println("Posibil sa se arunce o exceptie aritmetica");
        int var = 30/0;
        //sau throw new ArithmeticException("S-a aruncat exceptia!");
    }


    public static void main(String[] args){
        
        //NullPointerException - afisam lungimea unei var. de tip String initializata ca null
        /*
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Exceptie de tip NullPointer, " 
                    + "ai cerut sa afisezi lungimea unui string null!");
        }
        */
        
        
        //ArithmeticException - impartim un nr. la 0
        /*
        try{
            int a=30, b=0;
            System.out.println("Catul impartirii lui a la b: " + a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Vezi ca imparti un numar la 0!!!");
        }
        */
        
        
        //NumberFormatException - transformam in intreg un string care contine litere
        /*
        try{
            int numar = Integer.parseInt("Java");
            System.out.println(numar);
        }
        catch(NumberFormatException e){
            System.out.println("Ai introdus un string ce nu se poate converti la intreg!!!");
        }
        */
        
        
        //ArrayIndexOutOfBoundsException - se acceseaza o componenta de indice mai mare decat lungimea-1 a unui vector
        /*
        try{
            int[] a={1,2,3,4}; //sau int a[]={1,2,3,4};
            //sau int[] a=new int[4]; //caz in care se creeaza un vector de lungime 4 cu toate componentele 0
            //aceste componente au indicii 0,1,2,3
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Incerci sa accesezi o componenta de indice in afara rangului!!!");
        }
        */
        
        
        //Nested Try
        /*
        try{
            try{
                int numar=Integer.parseInt("Java");
                System.out.println(numar);
            }
            catch(NumberFormatException e){
                System.out.println("Ai introdus un string ce nu se poate converti la intreg!!!");
            }
            
            try{
                int[] a={1,2,3,4};
                System.out.println(a[5]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Incerci sa accesezi o componenta de indice in afara rangului!!!");
            }
            
            System.out.println("Am trecut prin blocul try principal");
            
            int a=30,b=0;
            System.out.println("Catul impartirii lui a la b este " + a/b);
        }
        catch(Exception e){ //sau AritmeticException e
            System.out.println("Oricare ar fi fost exceptia, a fost tratata!");
        }
        */
        
        
        //Multi-catch
        /*
        try{
            String str=null;
            System.out.println(str.length());
            
            int a=30, b=0;
            System.out.println("Catul impartirii lui a la b este " + a/b);
        }
        catch(NullPointerException e){
            System.out.println("Exceptie de tip NullPointer, " 
                + "ai cerut sa afisezi lungimea unui string null!!!");
        }
        catch(ArithmeticException e){
            System.out.println("Vezi ca imparti un numar la 0!!!");
        }
        */
        /*
        try{
            String str = "Java";
            System.out.println(str.length());

            int a = 30, b = 0;
            System.out.println("Catul impartirii lui a la b este " + a/b);
        }
        catch(NullPointerException|ArithmeticException e){
           System.out.println("Exceptie de tip NullPointer sau Arithmetic!");
           System.out.println(e.getMessage()); //printeaza mesajul exceptiei
           e.printStackTrace();//printeaza stiva de apeluri a exceptiei  
        }
        */
        
        
        //Metoda finally{}
        /*
        try{
            System.out.println("Inainte exceptie");
            //instructiunea se executa si daca se arunca exceptia si daca nu
            int a = 30, b = 0;
            System.out.println("Catul impartirii lui a la b este " + a/b);
            System.out.println("Dupa exceptie");
           //instructiunea se executa doar daca nu se arunca exceptia
        }
        catch(ArithmeticException e){//de incercat si cu blocul catch comentat
            System.out.println("Vezi ca imparti un numar la 0!!!");}
        finally{
            System.out.println("Blocul finally se executa mereu");
        }
        */
        
        
        //Metoda throw
        /*
        a();  //se afiseaza doar mesajul de dinainte de throw 
              //si cel corespunzator tratarii cu catch
        */
        
        
        //Metoda throws
        try{
            a();
        }
        catch(ArithmeticException e){ //de incercat si fara blocul catch
        //Cum fara catch nu se trateaza exceptia, 
        //se afiseaza in terminal exceptia respectiva in rosu
            System.out.println(„Am prins-o!”);
        }
        finally{
            System.out.println(„Executam oricum”);
        }

    }
}
