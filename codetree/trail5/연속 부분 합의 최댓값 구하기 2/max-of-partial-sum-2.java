import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        int answer = Integer.parseInt(input[0]);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int current = Integer.parseInt(input[i]);
            sum += current;
            
            if (sum <= current) {
                sum = current;
            }
            if (answer < sum) {
                answer = sum;
            }
        }

        System.out.println(answer);
    }
}