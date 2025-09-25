import java.util.Scanner;
class Alpha




{
   public static void number (int n){
       for (int i = 0; i < 1; i++){
           for (int j = 1; j <= 1; j++){
            System.out.print((char)('A'+i));
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






