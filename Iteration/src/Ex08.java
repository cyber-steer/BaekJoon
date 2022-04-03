import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Case #"+(i+1)+": "+a[i]+" + "+b[i]+" = "+(a[i]+b[i]));
        }
    }
}
