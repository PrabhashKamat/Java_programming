package OOP;

public class Marks {
    public static class StudentData{
        String name;
        int roll_no;
        int[] marks;
        StudentData(int s){
          marks = new int[s];
        }
    }

    public static void main(String[] arg){
        StudentData s1 = new StudentData(5);
        s1.marks[0] = 21;
        s1.marks[1] = 34;
        s1.marks[2] = 56;
        s1.marks[3] = 43;
        s1.marks[4] = 233;
        for(int ele : s1.marks) {
            System.out.print(ele + " ");
        }
        System.out.println();

        StudentData s2 = new StudentData(4);
        s2.marks[0] = 234;
        s2.marks[1] = 343;
        s2.marks[2] = 332;
        s2.marks[3] = 233;
        for (int elem : s2.marks) {
            System.out.print(elem + " ");
        }
    }
}
