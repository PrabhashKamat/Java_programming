package OOP;
class Students{
    String name;
    private int roll_no = 40;

    public int getRoll_NO() {
        return roll_no;
    }
}

public class PrivateKeyword{
    public static void main(String[] args) {
        Students s1 = new Students();
        int roll=s1.getRoll_NO();
        s1.name = "Prabhash Kamat";
        System.out.printf("Name : %s \nRoll_No: %d",s1.name,roll);
    }
}
