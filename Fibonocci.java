/*
1 take input n
2 initialize variable a=1 and b=1
3 print a and b in single line
4 take a variable c to store next term in series(c=a+b)
5 loop untill c cross over n
  a.print c
  b.make=a=b
  c.compute c=a+b
  d.loop to 5
*/

import java.util.Scanner;
class Fibonocci
{
  public static void printFibonocci(int n){
    int a=1;
    int b=1;
    System.out.print(a+" "+b+" ");
    int c=a+b;
    while(c<=n){
      System.out.print(c+" ");
        a=b;
        b=c;
	c=a+b;
    }
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number");
    int n=sc.nextInt();
    printFibonocci(n);
  }
}