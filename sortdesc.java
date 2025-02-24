import java.util.Arrays;
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
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < r; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
        s.close();
    }
}
