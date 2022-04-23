import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        a = a.charAt(2)+""+a.charAt(1)+""+a.charAt(0);
        b = b.charAt(2)+""+b.charAt(1)+""+b.charAt(0);
        int ia = Integer.parseInt(a);
        int ib = Integer.parseInt(b);

        if(ia>ib) System.out.println(ia);
        else System.out.println(ib);
    }
}
