import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing_p34 {
    public static void main(String[] args)throws IOException {
        System.out.println("Enter a Integer that skips loop?(0~10)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = Integer.parseInt(br.readLine());

        for (int i = 0; i <= 10; i++) {
            if(i == res) continue;
            System.out.println("Loop for "+ i +".");
        }
    }
}
