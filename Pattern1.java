import java.util.Scanner;
class Pattern1
{
   public static void star (int n){
       for (int i = 1; i <= 5; i++){
           for (int j = 0; j <= 4; j++){
            System.out.print(i+" ");
           }
       
       System.out.print("\n");
       }
   }
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to display n:");
       int n = sc.nextInt();
       star(n);

   }
}