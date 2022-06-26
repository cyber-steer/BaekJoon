import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0, i = 0;
        while (num >= sum) {
            i++;
            sum = 2 + 3 * i * (i - 1);
        }
        if (num == 1) {
            sum = 1;
        }
        System.out.println(i);
    }
}
