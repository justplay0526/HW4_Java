import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Testing_p47 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter five people's score");
        Integer score[] = new Integer[5];

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(score, Collections.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            System.out.println("No."+ (i+1) +"'s score is "+ score[i] + ".");
        }
    }
}
