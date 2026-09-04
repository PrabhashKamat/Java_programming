package Array2D;
public class MatrixMultiplication {
    public static int[][] matrixmul(int[][] a,int[][] b){
        int m=a.length, n=a.length;
        int[][] c = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
    public static void main(String[] arg) {
        int[][] a = {{1, 2, 3}, {5, 6, 7}, {10, 11, 12}};
        int[][] b = {{12, 11, 10}, {8, 7, 6}, {4, 3, 2}};
        int[][] ans = matrixmul(a, b);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}

