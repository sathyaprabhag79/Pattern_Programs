import java.util.Scanner;
public class PrimeCount{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int count=0;
    for(int i=2;i<=n;i++){
      boolean isPrime=true;
      for(int j=2;j<i;j++){
        if(i % j == 0){
          isPrime=false;
        }
      }
      if(isPrime){
        count++;
      }
    }
    System.out.println(count);
  }
}