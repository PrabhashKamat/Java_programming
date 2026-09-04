package Array2D;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.print("Enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int num = 3*4;
        System.out.printf("Array Element is(%d) : ",num);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
