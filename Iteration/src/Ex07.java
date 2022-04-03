import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a+b;
        }
        for(int i=0;i<n;i++){
            System.out.println("Case #"+(i+1)+": "+arr[i]);
        }
    }
}
