package laborator6DE;

import java.util.Objects;

public class Student implements Comparable<Student>{
    String name;
    String surname;
    long id;
    double averageGrade; //media unui student
    
    public Student(){
        this.name=null;
        this.surname=null;
        this.id=0;
        this.averageGrade=0;
    }
    
    public Student(String name,String surname,long id,double averageGrade){
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.averageGrade=averageGrade;
    }
    
    @Override
    public int compareTo(Student o){
        if(averageGrade==o.averageGrade){
            if(name.equals(o.name)){
                return surname.compareTo(o.surname);
            }
            else{
                return name.compareTo(o.name);
            }
        }
        else
            return (int)(averageGrade - o.averageGrade);
    }
    
    @Override
    public String toString(){
        return "Nume: "+name+" "+surname+"; Id: "+id+"; Average grade: "+averageGrade;
    }
    
    @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.averageGrade) != Double.doubleToLongBits(other.averageGrade)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surname, other.surname);
    }
}
