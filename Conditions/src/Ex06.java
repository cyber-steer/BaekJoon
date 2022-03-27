import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int time = scanner.nextInt();

        hour += (min += time)/60;
        if(hour > 23) hour %= 24;
        min = min%60;

        System.out.println(hour+" "+min);
    }
}
