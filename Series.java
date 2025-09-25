/*
1 take n from user
2 initialize a variable called a=1
3 loop if a<=n
 a.print a
 b.if(a%2==0)then a=(2*a+1);
 c.else if a=(2*a);
 d.loop 3
*/


import java.util.Scanner;
class Series
{
  public static void Myseries(int n)
  {
    int a=1;
    while(a<=n)
    {
      System.out.print(a+" ");
      if(a % 2 == 0){
        a=(2*a+1);
      }else{
        a=(2*a);  
      }
   }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int n=sc.nextInt();
    Myseries(n);  
  }
}