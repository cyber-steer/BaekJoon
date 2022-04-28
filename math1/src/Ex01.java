import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int i=0;

        if(c*1 - (a+b*1) > c*2 - (a+b*2)){
            System.out.println(-1);
        }
        else{
            while(true){
                int sum = c*i -(a+b*i);
                i++;
                if(sum>=0) break;
            }
            System.out.println(i);
        }
    }
}
