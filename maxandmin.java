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
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < r; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number in the array is: " + max);
        System.out.println("Minimum number in the array is: " + min);
        s.close();
    }
}
