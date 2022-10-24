import java.util.Random;

public class Testing_p49 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] score;
        score = new int[2][5];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                score[i][j] = rand.nextInt(99);
            }
        }
        for (int i = 0; i < score[1].length; i++) {
            System.out.println("The English score of NO."+ (i+1) +" is "+ score[0][i] +".");
            System.out.println("The Math score of NO."+ (i+1) +" is "+ score[1][i] +".");
        }
    }
}
