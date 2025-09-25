class Prime
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
      int n=sc.nextInt();
      boolean rs=isPrime(n);
        if(rs==true){
          System.out.println(n+"is a prime number");
        }else{
          System.out.println(n+"is not a prime number");
    }
    public static boolean isPrime(int x){
       if(x<=1)
         return false;
    }
    return true;
  }
}  


 