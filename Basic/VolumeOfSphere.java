package Basic;
import java.util.Scanner;

public class VolumeOfSphere {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double volume = 1.334*3.14*r*r*r;
        System.out.println("volume of the sphere is "+volume);
    }
}
