public class EX02 {
    public static void main(String[] args) {
        for(int i=1;i<=10000;i++){
            if(d(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean d(int n){
        for(int i=1;i<n;i++){
            int sum = i;
            String str = i+"";
            for(int j=0;j<str.length();j++){
                sum += Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            if(sum == n) return false;
        }
        return true;
    }
}