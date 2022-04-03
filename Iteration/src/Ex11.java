import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for (int i=0;i<n;i++){
            if(arr[i] < max){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
