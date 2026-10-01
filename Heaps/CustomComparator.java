package Heaps;
import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int roll_no;
    double cgpa;
    Student(String name, int roll_no, double cgpa){
        this.name = name;
        this.roll_no = roll_no;
        this.cgpa = cgpa;
    }

    public int compareTo(Student s){
        // Ascending order
//        return Integer.compare(this.roll_no,s.roll_no);

        // Descending order
        return Double.compare(s.cgpa,this.cgpa);
    }
}

public class CustomComparator{
    public static void main(String[] args){
       Student s1 = new Student("Prabhash",40,8.04);
       Student s2 = new Student("Aditya",4,7.6);
       Student s3 = new Student("Amritansh",31,9);
       Student s4 = new Student("Bhargavi", 6,8.4);

       Student[] arr = {s1,s2,s3,s4};
        Arrays.sort(arr);
       for(Student s : arr){
           System.out.println(s.name+"  "+s.roll_no+"  "+s.cgpa);
       }
    }
}
