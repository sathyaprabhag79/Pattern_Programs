/*
          1
        2 1
      3 2 1
    4 3 2 1
  5 4 3 2 1
*/ 

import java.util.Scanner;

public class ReverseNumber {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
           
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); // Two spaces to align numbers
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
    }
}
      