package aplicatia1de;

public class Internship {
    private String name;
    private String minGrade;
    private Student[] students;
    
    public Internship(String name,String minGrade,Student[] students){
        this.name=name;
        this.minGrade=minGrade;
        this.students=students;
    }
    
    public String getName(){
        return name;
    }
    
    public String getMinGrade(){
        return minGrade;
    }
    
    public Student chooseCandidateRandomly(){
        int numberInterviewee=(int)(Math.random()*students.length);
        return students[numberInterviewee];
    }
    
    public void chooseCandidatesForInterview(){
        for(Student student : students) {
            if(Double.parseDouble(minGrade)<=student.getGrade()){
                System.out.println("Candidate "+student.getName()+" got a phone interview at "+name);
            }
        }
    }
}
