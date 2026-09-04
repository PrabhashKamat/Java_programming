package String;

public class AllSubstring {
    static void main() {
        String s = "gopi";
        for(int i=0;i<s.length();i++){
            for(int j =1+i;j<=s.length();j++){
                System.out.print(s.substring(i,j)+ " ");
            }
            System.out.println();
        }
    }
}
