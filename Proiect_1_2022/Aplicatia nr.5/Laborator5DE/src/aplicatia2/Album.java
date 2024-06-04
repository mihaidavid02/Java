package aplicatia2;

import java.util.ArrayList;

public class Album extends Song{
    ArrayList <Song> Melodii=new ArrayList<>();
    
    void addSong(Song song){
        Melodii.add(song);
    }
    void removeSong(Song song){
        Melodii.remove(song.id);
    }
    
    @Override
    public String toString(){
        System.out.print( "Album{songs=[");
        for(Song Melodie : Melodii){
            System.out.println( Melodie.toString());
        }
        return null;
    }
}
