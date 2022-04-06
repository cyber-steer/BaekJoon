import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int arr[] = new int[10];

        String str = (a*b*c) +"";
        for(int i =0; i<str.length();i++){
            switch (str.charAt(i)){
                case '0': arr[0]++; break;
                case '1': arr[1]++; break;
                case '2': arr[2]++; break;
                case '3': arr[3]++; break;
                case '4': arr[4]++; break;
                case '5': arr[5]++; break;
                case '6': arr[6]++; break;
                case '7': arr[7]++; break;
                case '8': arr[8]++; break;
                case '9': arr[9]++; break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
