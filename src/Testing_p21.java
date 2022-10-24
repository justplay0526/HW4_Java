import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing_p21 {
    public static void main(String[] args)throws IOException {
        System.out.println("Select a route?");
        System.out.println("Enter a Integer:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = Integer.parseInt(br.readLine());

        char ans = (res == 1)?'A':'B';

        System.out.println("You selected "+ ans + " route.");
    }
}
