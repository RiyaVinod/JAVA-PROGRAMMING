import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int r = s.nextInt();
        if (r % 2 == 0) {
            System.out.println(r + " is an even number.");
        } else {
            System.out.println(r + " is an odd number.");
        }
        s.close();
