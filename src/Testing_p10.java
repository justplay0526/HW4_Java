import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing_p10 {
    public static void main(String[] args)throws IOException {
        System.out.println("Input a Integer:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num == 1){
            System.out.println("Your Input is 1.");
        }
        else{
            System.out.println("Your select is " + num + ".");
        }
        System.out.println("End of the code.");
    }
}
