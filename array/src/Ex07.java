import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][];
        double avg[] = new double[n];
        int sum=0, count=0;
        for(int i=0;i<arr.length;i++){
            int student = scanner.nextInt();
            arr[i] = new int[student];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = scanner.nextInt();
                sum += arr[i][j];
            }
            avg[i] = (double) sum/arr[i].length;
            for(int j=0;j<arr[i].length;j++){
                if(avg[i] < arr[i][j]){
                    count++;
                }
            }
            avg[i] = (double) count/arr[i].length*100;
            count=0;
            sum=0;
        }
        for(int i=0;i<avg.length;i++){
            System.out.printf("%.3f",avg[i]);
            System.out.println("%");
        }

    }
}
