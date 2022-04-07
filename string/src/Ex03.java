import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(char c='a';c<='z';c++){
            System.out.print(sizeOf(str,c)+" ");
        }
    }
    public static int sizeOf(String str, char c){
        for(int i=0;i<str.length();i++){
            if(c == str.charAt(i))
                return i;
        }
        return -1;
    }
}
