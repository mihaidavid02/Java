package aplicatia2;

public class DangerousAlbum extends Album{
    @Override
    void addSong(Song song){
        Boolean ok=true;
        for(int i=0;i<id/2;i++){
            if(song.id/i==0)
                ok=false;
        }
        if(ok==true)
            Melodii.add(song);
    }
}
