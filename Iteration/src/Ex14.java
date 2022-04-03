import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        while (true) {
            count++;
            int a;
            int b;
            if (temp < 10) {
                a = 0;
                b = temp;
                temp = a+b;
                if(temp >9){
                    temp = temp%10;
                }
                temp = b*10 + temp;
            }
            else{
                a = temp/10;
                b = temp%10;
                temp = a+b;
                if(temp >9){
                    temp = temp%10;
                }
                temp = b*10 + temp;
            }
            if (temp == n) break;
        }
        System.out.println(count);
    }
}
