//WAJP to create an array of length 5 and insert 10,12,7,10,15 to it.display elements of array using foreach loop.

public class Array4{
   public static void main (String[] args)
   {
     int[] arr = {10,12,7,10,15};
     
     //arr.length is is instance variable in which stores in the size of array.
     for(int a : arr){
  
       System.out.println(a);
    }
  }
}