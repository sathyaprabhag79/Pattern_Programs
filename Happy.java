import java.util.Scanner;
class Happy{
  public static boolean isHappy(int n)
  {
    while(n>9){
    int sum=0;
    do{
       int d=n%10;
       sum=sum+d*d;
        n=n/10;
    }while(n!=0);
    n=sum;
   }
   return n==1||n==7;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println(isHappy(n));
  }
}