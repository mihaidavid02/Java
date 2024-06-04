package aplicatia2;

public class BadAlbum extends Album{
    @Override
    void addSong(Song song){
        Boolean ok=false;
        
        //Verificare numar litere
        if(song.composer.length()==3){
            ok=true;
        }
        
        //Verificare palindrom
        if(ok==true){
            int temp=song.id; 
            int sum=0;
            while(temp>0){    
                sum=(sum*10)+temp%10;    
                temp=temp/10;    
                if(song.id==sum){  
                   ok=true;
                }   
                else{    
                   ok=false;
                }
            }
        }
        
        //Adaugare melodie
        if(ok==true){
            Melodii.add(song);
        }
    }
}
