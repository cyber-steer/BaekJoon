import java.util.Random;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b) {
            if (a == c)
                System.out.println(10000 + a * 1000);
            else
                System.out.println(1000 + a * 100);
        }
        else if (b == c)
            System.out.println(1000 + b * 100);
        else {
            if(a==c)
                System.out.println(1000 + a * 100);
            else {
                if (a > b) {
                    if (a > c)
                        System.out.println(a * 100);
                    else
                        System.out.println(c * 100);
                } else {
                    if (b > c)
                        System.out.println(b * 100);
                    else
                        System.out.println(c * 100);
                }
            }
        }
    }
}
