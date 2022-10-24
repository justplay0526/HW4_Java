import java.util.Random;

public class Testing_p39 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] score;
        score = new int[5];

        for (int i = 0; i < 5; i++) {
            score[i] = rand.nextInt(99);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("No."+ (i+1) +"'s score is "+ score[i] + ".");
        }

    }
}
