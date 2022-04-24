import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = ((int) str.charAt(i)) - 65;
            if (n <= 15)
                sum += (n / 3) + 3;
            else {
                if (n > 15 && n < 19){
                    sum += 8;

                }
                else if (n > 18 && n < 22)
                    sum += 9;
                else
                    sum += 10;
            }
        }
        System.out.println(sum);
    }
}
