import java.util.Scanner;
class Star1
{
   public static void star(int n){
       for (int i = n; i >= 1; i--){
           for (int j = 1; j <= n; j++){
             if(j>=i){
               System.out.print("*");
             }else{
                System.out.print(" ");
             }
           }
       
       System.out.print("\n");
      }
   }
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to display *:");
       int n = sc.nextInt();
       star(n);

   }
}