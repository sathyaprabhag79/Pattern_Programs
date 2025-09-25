import java.util.Scanner;
class Star
{
   public static void number (int n){
       for (int i = n; i >=1; i--){
           for (int j = 1; j <= n; j++){
            System.out.print(i+" ");
           }
       
       System.out.println();
       }
   }
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to display :");
       int n = sc.nextInt();
       number(n);

   }
}
