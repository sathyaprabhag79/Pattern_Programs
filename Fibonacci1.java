import java.util.Scanner;
public class Fibonacci1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int a=0;
    int b=1;
    System.out.println(a+" "+ b +" ");
    int c=a+b;
    while(c<=n){
      System.out.println(c+" ");
      a=b;
      b=c;
      c=a+b;
   }
 }
}