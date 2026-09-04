package loops;

public class MergeTwoSortedArrays {
    static void main() {
        int[] a = {2,4,5,34,55};
        int[] b ={12,14,16,19,25,235,456};
        int m =a.length;
        int n =b.length;
        int[] c =new int[m+n];
        mergesortedarr(a,b,c);
        for(int l=0;l<c.length;l++){
            System.out.print(c[l]+" ");
        }
    }
    public static void mergesortedarr(int[] a,int[] b,int[] c ){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) {
                c[k] = b[j];
                k++;
                j++;
            }
            else{
                c[k] = a[i];
                k++;
                i++;
            }
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
