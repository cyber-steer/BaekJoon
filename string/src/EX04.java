import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            int num = scanner.nextInt();
            str[i] = scanner.next();
            String temp ="";
            for(int j=0;j<str[i].length();j++){
                for(int k=0;k<num;k++){
                    String t = String.valueOf(str[i].charAt(j));
                    temp += t;
                }
            }
            str[i] = temp;
        }

        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
}
