import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing_p45 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter five people's score");
        int[] score = new int[5];

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < score.length-1; i++) {
            for (int j = i+1; j < score.length; j++) {
                if(score[j] > score[i]){
                    int temp = score[j];
                    score[j] = score[i];
                    score[i] = temp;
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println("No."+ (i+1) +"'s score is "+ score[i] + ".");
        }
    }
}
