package String;

public class PassingStringToMethod {
    public static void change(String s){
        s="Aakash";
    }
    public static void main(String[] arg){
        String x ="Prabhash";
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}
