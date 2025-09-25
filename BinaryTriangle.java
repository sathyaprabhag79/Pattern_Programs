/* 
        1
      1 0
    1 0 1
  1 0 1 0
1 0 1 0 1
*/

import java.util.Scanner;

public class BinaryTriangle {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
           
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(((j % 2 == 1) ? "1" : "0") + " ");
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
