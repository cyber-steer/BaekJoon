import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
            arr[i] %= 42;

        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                if(i == j) count++;
                if(arr[i] == arr[j])
                    break;
            }
        }
        System.out.println(count);
    }
}
