import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int r = s.nextInt();
        int[] arr = new int[r];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < r; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < r; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the array elements is: " + sum);
        s.close();
    }
}
