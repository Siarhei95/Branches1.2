package Example1;
import java.util.Scanner;

public class Question_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, min1, min2, max;
        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.print("Enter b: ");
        b = scanner.nextDouble();
        System.out.print("Enter c: ");
        c = scanner.nextDouble();
        System.out.print("Enter d: ");
        d = scanner.nextDouble();
        if (a<b) {
            min1 = a;
        } else {
            min1 = b;
        }
        if (c<d) {
            min2 = c;
        } else {
            min2 = d;
        }
        if (min1<min2) {
            max = min2;
            System.out.println("Max value from min: " + min2);
        }
        else {
            max = min1;
            System.out.println("Max value from min: " + min1);
        }
    }
}
