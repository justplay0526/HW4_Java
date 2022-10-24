import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing_p32 {
    public static void main(String[] args)throws IOException {
        System.out.println("Enter a Integer that ends loop?(0~10)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = Integer.parseInt(br.readLine());

        for (int i = 0; i <= 10; i++) {
            System.out.println("Loop for "+ i +".");
            if(i == res) break;
        }
    }
}
