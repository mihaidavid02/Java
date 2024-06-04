package laborator6DE;

import static java.lang.Math.random;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.id > s2.id)
            return 1;
        else if (s1.id < s2.id)
            return -1;
        return 0;
        }
    }

class NrPare{
    int nr;
    
    NrPare(int n){
        if(n%2==0){
            nr=n;
        }
    }
}

class LinkedHashSet extends NrPare{
    public LinkedHashSet(int n) {
        super(n);
    }
    
    public Boolean add(int n){
        if(n%2==0){
            nr=n;
            return true;
        }
        else
            return false;
    }
}

public class Main {
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
                students.add(new Student("Ionescu","Ana",2735,9));
                students.add(new Student("Popescu","Matei",4932,8.75));
                students.add(new Student("Tipatescu","Oana",9367,9.5));
                students.add(new Student("Matei","Ion",4795,7));
                students.add(new Student("Popescu","Andrei",9854,8.75));
                
        Collections.sort(students);
        for(Student i : students){
            System.out.println(i.toString());
        }
        
        //students.sort((o1,o2)-> {return o1.averageGrade-o2.averageGrade;});
        
        PriorityQueue<Student> pQueue=new PriorityQueue<>(5, new StudentComparator());
        pQueue.addAll(students);
          
        ArrayList<String> subjects=new ArrayList<>(Arrays.asList("Mate","Fizica","Engleza"));
        HashMap<Student, LinkedList> map=new HashMap<>();
        LinkedList<String> subjectsList=new LinkedList<>();
        for(Student i : students){
            for(int j=0;j<3;j++){
                int rand=(int) (random()*3);
                subjectsList.add(subjects.get(rand));
            }
            map.put(i, subjectsList);
            subjectsList.clear();
        }
        
        LinkedHashSet<Integer> nrList=new LinkedHashSet<>();
        nrList.add(2);
        nrList.add(3);
        for(int i=0;i<2;i++){
            nrList.poll();
        }
        
    }
}
