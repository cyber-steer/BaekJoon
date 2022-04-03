import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = scanner.nextInt();
        int max=arr[0], min=arr[0];
        for(int item : arr){
            if(max < item) max = item;
            if(min >item) min = item;
        }
        System.out.println(min + " "+ max);
    }
}
