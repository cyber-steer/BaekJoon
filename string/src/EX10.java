import java.util.ArrayList;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count =0;

        for(int i=0; i<n;i++){
            String str = scanner.next();
            if(check(str)) count++;
        }
        System.out.println(count);
    }
    public static boolean check(String str){
        ArrayList<Character> c = new ArrayList<>();
        c.add(str.charAt(0));
        for(int i=1;i<str.length();i++){
            int j;
            for(j=0;j<c.size()-1;j++){
                if(str.charAt(i) == c.get(j)) return false;
            }
            if(c.get(j) != str.charAt(i)) c.add(str.charAt(i));
        }
        return true;
    }
}
