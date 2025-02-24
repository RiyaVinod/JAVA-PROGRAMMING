import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the maximum number to check for prime:");
        int m = s.nextInt();
        for (int n = 2; n <= m; n++) {
            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(n + " is a prime number.");
            }
        }
        s.close();
    }
}
