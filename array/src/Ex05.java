import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] scores = new float[n];
        int max = 0;
        double sum=0;
        double avg;
        for(int i=0; i<scores.length;i++){
            scores[i] = scanner.nextInt();
            for(int j=0;j<=i;j++){
                if(scores[i] > max){
                    max = (int) scores[i];
                }
            }
        }
        for(int i=0;i<scores.length;i++){
            scores[i] = (float)scores[i]/max*100;
            sum += scores[i];
        }
        System.out.println((float) sum/scores.length);
    }
}
