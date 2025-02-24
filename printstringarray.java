import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sen:");
        String sen = s.nextLine();
        String[] arr = sen.split(" ");
        System.out.println("The elements of the string array are:");
        for (String str : arr) {
            System.out.println(str);
        }
        s.close();
    }
}
