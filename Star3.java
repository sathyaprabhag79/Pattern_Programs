import java.util.Scanner;

class Star3 {
    public static void star(int n) {
        for (int i = 0; i < n; i++) {
            
            for (int s = 0; s < i; s++) {
                System.out.print("  "); 
            }

            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        star(n);
    }
}
