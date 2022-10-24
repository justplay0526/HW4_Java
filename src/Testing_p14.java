import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing_p14 {
    public static void main(String[] args)throws IOException {
        System.out.println("Input a Integer:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        switch (num){
            case 1:{
                System.out.println("Your input is 1.");
                break;
            }
            case 2:{
                System.out.println("Your input is 2.");
                break;
            }
            default:{
                System.out.println("Input 1 or 2.");
                break;
            }
        }
    }
}
