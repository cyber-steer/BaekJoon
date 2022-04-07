import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(i<100) count++;
            else
                if((i/100)-(i/10%10) == (i/10%10)-(i%10)) count++;
        }
        System.out.println(count);
    }
}
