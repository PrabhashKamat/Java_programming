package loops;

import java.util.Scanner;

public class NthTerm {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        for (int i =2 ; i <=3*n-1 ; i+=3) {
            System.out.println(i+"");
        }
    }
}
