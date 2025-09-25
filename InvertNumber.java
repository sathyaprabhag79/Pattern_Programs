/*
5 4 3 2 1
  4 3 2 1
    3 2 1
      2 1
        1
*/

import java.util.Scanner;

public class InvertNumber{
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            
            for (int s = 0; s < i; s++) {
                System.out.print("  "); 
            }

            for (int j = n - i; j >= 1; j--) {
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
