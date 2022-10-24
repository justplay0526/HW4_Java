import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing_p16 {
    public static void main(String[] args)throws IOException {
        System.out.println("Input a or b:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);

        switch (letter){
            case 'a':{
                System.out.println("Your input is a.");
                break;
            }
            case 'b':{
                System.out.println("Your input is b.");
                break;
            }
            default:{
                System.out.println("Input a or b.");
                break;
            }
        }
    }
}
