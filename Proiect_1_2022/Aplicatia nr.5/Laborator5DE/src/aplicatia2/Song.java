package aplicatia2;

public class Song {
    String name;
    int id;
    String composer;
    
    public Song(){
        name="null";
        id=0;
        composer="null";
    }
    
    @Override
    public String toString(){
        return "Song{name= " + name + ", id= " + id + ", composer= " + composer;
    }
}
