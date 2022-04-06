import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strs = new String[n];
        int strCount=0;
        int sum[] = new int[n];
        for(int i=0;i<n;i++){
            strs[i] = scanner.next();
            for(int j=0;j<strs[i].length();j++){
                if(strs[i].charAt(j) =='O')
                    sum[i] += ++strCount;
                else
                    strCount = 0;
            }
            strCount=0;
        }
        for(int i=0;i<sum.length;i++)
            System.out.println(sum[i]);
    }
}
