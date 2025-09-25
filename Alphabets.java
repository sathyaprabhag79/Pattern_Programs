import java.util.Scanner;
class Alphabets
{
   public static void star (int n){
       for (int i = 1; i <= 5; i++){
           for (int j = 0; j < i; j++){
            System.out.print(((char)('A'+j))+ " ");
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