package Recursion;

public class LookAndSayPattern {
    static void main() {
        System.out.print(countAndSay(5));
    }
    public static String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        System.out.print(s+" ");
        // code here
        String ans ="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int freq =j-i;
                ans +=freq;
                ans+=s.charAt(i);
                i=j;
            }
        }
        int freq =j-i;
        ans +=freq;
        ans+=s.charAt(i);
        return ans;
    }
}
