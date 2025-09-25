import java.util.Scanner;
public class StrongNumber{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=sc.nextInt();
     int sum=0;
     int temp=num;
     while(temp!=0){
       int r=temp % 10;
       int fact = 1;
       while(r>0){
         fact=fact*r;
         r--;
       }
       sum=sum+fact;
       temp=temp/10;
    }
    if(sum==num){
      System.out.println(n+"is Strong number");
    }else{
      System.out.println(n+"is Not Strong number");
  }
  sc.close();
}  