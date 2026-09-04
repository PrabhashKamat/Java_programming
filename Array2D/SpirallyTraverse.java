package Array2D;
import java.util.ArrayList;

public class SpirallyTraverse {
    public static ArrayList<Integer> spirally(int[][] arr){
       ArrayList<Integer> ans = new ArrayList<>();
       int m=arr.length,n=arr[0].length;

       int firstrow=0,lastrow=m-1;
       int firstcol=0,lastcol=n-1;
       int tne=m*n;
       while(firstrow<=lastrow && firstcol<=lastcol){
           // Right
           for(int i=firstcol;i<=lastcol;i++)
               ans.add(arr[firstrow][i]);
           firstrow++;
           if(ans.size()==tne) break;
           // Down
           for(int j=firstrow;j<=lastrow;j++)
               ans.add(arr[j][lastcol]);
           lastcol--;
           if(ans.size()==tne) break;

           //Left
           for(int k=lastcol;k>=firstcol;k--)
               ans.add(arr[lastrow][k]);
           lastrow--;
           if(ans.size()==tne) break;

           //upward
           for(int l=lastrow;l>=firstrow;l--)
                ans.add(arr[l][firstcol]);
            firstcol++;
           if(ans.size()==tne) break;

       }
        return ans;
    }
    public static void main(String[] arg) {
            int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            ArrayList<Integer> ans=spirally(arr);
        System.out.println(ans);

    }

}
