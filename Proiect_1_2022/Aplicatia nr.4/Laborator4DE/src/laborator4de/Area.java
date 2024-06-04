package laborator4de;

public class Area {
    CandyBag Cadou;
    int number;
    String street;
    String message;
    
    //CONSTRUCTORI
    public Area(){
        Cadou=null;
        number=0;
        street="nowhere";
        message="none";
    }
    
    public Area(CandyBag Cadou,int number,String street,String message){
        this.Cadou=Cadou;
        this.number=number;
        this.street=street;
        this.message=message;
    }
    
    public void getBirthdayCard(){
        System.out.println("Adresa: "+street+" "+number);
        System.out.println("La multi ani!");
        
        for (CandyBox cutiiCiocolata : Cadou.cutiiCiocolata){
            System.out.println(Cadou.cutiiCiocolata);
        }
    }
}
