import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str =str+"   ";
        int count=0;
        int i=0;
        for(i=0; i<str.length();i++){
            switch (str.charAt(i)){
                case ' ':
                    break;
                case 'c':
                    if(i+1 >=str.length()){
                        count++;
                        break;
                    }
                    if(str.charAt(i+1) =='='|| str.charAt(i+1)=='-'){
                        count++;
                        i++;
                    }
                    else count++;
                    break;
                case 'd':
                    if(i+1 >=str.length()){
                        count++;
                        break;
                    }
                    if(str.charAt(i+1) =='z'){
                        if(i+2 >=str.length()){
                            count++;
                            break;
                        }
                        if(str.charAt(i+2) == '='){
                            count++;
                            i +=2;
                        }
                        else{
                            count++;
                            break;
                        }
                    }
                    else if(str.charAt(i+1) == '-'){
                        count++;
                        i++;
                    }
                    else count++;
                    break;
                case 'l':
                case 'n':
                    if(i+1 >=str.length()){
                        count++;
                        break;
                    }
                    if(str.charAt(i+1) =='j'){
                        count++;
                        i++;
                    }
                    else count++;
                    break;
                case 's':
                case 'z':
                    if(i+1 >=str.length()){
                        count++;
                        break;
                    }
                    if(str.charAt(i+1) =='='){
                        count++;
                        i++;
                    }
                    else count++;
                    break;
                default:
                    count++;
            }
        }
        System.out.println(count);
    }
}
