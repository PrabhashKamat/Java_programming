package Array;
public class Segregate0sand1s {
    static void main() {
        int[] arr = {1,0,1,1,0,1,1,0};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
            if(arr[i]==1 && arr[j] ==0){
                arr[i] =0;
                arr[j] = 1;
                i++;
                j--;
            }

        }
        for(int ele : arr) {
            System.out.print(ele + "  ");
        }
    }
}
