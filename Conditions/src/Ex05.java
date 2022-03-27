import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour  = scanner.nextInt();
        int min = scanner.nextInt();

        if(min <45){
            hour = (hour==0) ? 23:hour-1;
            min = 15+min;
        }
        else min -= 45;

        System.out.println(hour +" "+min);
    }
}
