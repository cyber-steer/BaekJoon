import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim();
        String[] arr = str.split(" ");
        if(arr[0].equals(""))
            System.out.println(0);
        else
            System.out.println(arr.length);
    }
}
