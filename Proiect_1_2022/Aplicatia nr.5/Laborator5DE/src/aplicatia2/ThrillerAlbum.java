package aplicatia2;

public class ThrillerAlbum extends Album{
    @Override
    void addSong(Song song){
        if("Michael Jackson".equals(song.composer) && song.id%2==0){
            Melodii.add(song);
        }
    }
}
