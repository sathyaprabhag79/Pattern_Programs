/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/
import java.util.Scanner;

public class Number4 {
    public static void number(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= n; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to display n: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 5) {
            number(n);
        } else {
            System.out.println("Please enter a number between 1 and 5.");
        }

        sc.close();
    }
}
