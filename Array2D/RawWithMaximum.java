package Array2D;

public class RawWithMaximum {
    public static void main(String[] arg){
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        int MaxSum = Integer.MIN_VALUE;
        int RowIndex =-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum += arr[i][j];
            }
            if(sum > MaxSum){
                MaxSum = sum;
                RowIndex=i;
            }
        }
        System.out.printf("%d Maximum value at index %d",MaxSum,RowIndex);

    }
}
