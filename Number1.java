/*1 2 3 4 5
  1 2 3 4
  1 2 3
  1 2
  1
*/
import java.util.Scanner;
class Number1
{
  public static void number(int n){
    for(i=n;i<n;i--){
      for(j=1;j<=1;j++){
        System.out.print(j+"");
        }
       System.out.print("\n");
      }
   }
   public static void main(String[] args)
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number to display");
     int n=sc.nextInt();
     number(n);
  }
} 