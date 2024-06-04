package aplicatia1de;

public class Aplicatia1DE {
    public static void main(String[] args) {
        Student students[] = new Student[4];
        students[0]=new Student("George",8.5);
        students[1]=new Student("Mihai",9.5);
        students[2]=new Student("Andrei",10);
        students[3]=new Student("Alexandru",9);
        
        Internship internships[]= new Internship[4];
        internships[0]=new Internship("Google","9",students);
        internships[1]=new Internship("Amazon","9.7",students);
        internships[2]=new Internship("Facebook","8",students);
        internships[3]=new Internship("Microsoft","10",students);
        
        for(int i=0;i<4;i++){
            internships[i].chooseCandidatesForInterview();
        }
    }  
}
