package Array;

public class MulIndexOddEven {
    static void main() {
        int[] arr ={12,13,14,23,3,45};
        for(int i=0;i<arr.length;i++){
            if(i % 2!=0){
                arr[i] = arr[i] *2;
            }
            else{
                arr[i] *=10;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
