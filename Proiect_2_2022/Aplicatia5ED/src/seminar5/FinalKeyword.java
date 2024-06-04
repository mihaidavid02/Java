package seminar5;

public class FinalKeyword {
    public final int id;
    
    public FinalKeyword(){
        id=1;
    }
    
    public final String finalMethod(){
        return "Final, nu se poate suprascrie";
    }
}

//eroare la compilare care ne spune că nu se poate suprascrie o metodă final
/*class FinalKeywordCopil extends FinalKeyword{
    @Override
    public final String finalMethod(){
        return "Final, nu se poate suprascrie";
    }
}
*/


//eroare de compilare: Cannot inherit from final Copil 
/*
final class Copil extends FinalKeyword{
}

class Nepot extends Copil{
}
*/