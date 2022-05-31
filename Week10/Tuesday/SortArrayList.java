import java.util.*;
import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(5, "Ashley"));
        students.add(new Student(4, "Bob"));
        students.add(new Student(10, "Cathy"));
        students.add(new Student(1, "Xyio"));

        System.out.println(students);
        Collections.sort(students, new CustomComparator());

        System.out.println(students);


    }

    public static class CustomComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.getId() < s2.getId()) {
                return -1;
            } else if (s1.getId() > s2.getId()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    
}

class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }    

    public String toString() {
        return this.name+" "+this.id;
    }
}