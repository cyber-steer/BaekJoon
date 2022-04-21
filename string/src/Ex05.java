import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];
        String str = scanner.nextLine();
        str = str.toUpperCase();
        for(int i=0;i<str.length();i++){
            arr[((int) (str.charAt(i))-65)]++;
        }
        int max=0;
        char c='?';
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                c = (char) (i+65);
            }
            else if(max == arr[i]) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}
