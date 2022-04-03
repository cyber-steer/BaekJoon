import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(true){
            int a = scanner.nextInt();
            int b= scanner.nextInt();
            if(a==0&&b==0) break;
            arr.add(a+b);
        }
        for(int item : arr) System.out.println(item);
    }
}
