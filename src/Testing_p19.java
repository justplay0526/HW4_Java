import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing_p19 {
    public static void main(String[] args)throws IOException {
        System.out.println("Are yor a boy?");
        System.out.println("Press Y or N");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char letter = str.charAt(0);

        if(letter == 'Y' || letter == 'y'){
            System.out.println("You are a boy!");
        }
        else if (letter == 'N' || letter == 'n') {
            System.out.println("You are a girl!");
        }
        else{
            System.out.println("Enter Y or N.");
        }
    }
}
