import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0, count=0;
        for(int i=0;i<9;i++) {
            int a = scanner.nextInt();
            if(a >max) {
                max = a;
                count = i+1;
            }
        }
        System.out.println(max+"\n"+count);
    }
}
