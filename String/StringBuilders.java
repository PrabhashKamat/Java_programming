package String;
import java.lang.String;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Prabhash");
        System.out.println(s);
        System.out.println(s.append("kamat"));
        s.delete(8,14);
        System.out.println(s);

        String s1 = "raghav";


    }
}
