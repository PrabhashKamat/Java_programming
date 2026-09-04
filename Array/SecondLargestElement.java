package Array;

public class SecondLargestElement {
    static void main() {
        int[] arr = {12,23,34,10,10,23,24,199};

        int FirstMax = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(arr[i] > FirstMax) {
                FirstMax=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] >SecondMax && arr[j] !=FirstMax){
                SecondMax =arr[j];
            }
        }
        System.out.println(SecondMax);
    }
}
