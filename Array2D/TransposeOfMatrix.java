package Array2D;

public class TransposeOfMatrix {
    static void main() {
        int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }
    }
}
