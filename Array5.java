//WAJP to declare and initialize an array for different datatypes.display elements of array using foreach loop.

public class Array5{
   public static void main (String[] args)
   {
     //int array 
     int[] intArr = new int[5];
     
     System.out.println("Display int array default content");
     for(int a : intArr){
        System.out.println(a);
     }
     //boolean arry
     boolean[] boolArr = new boolean[5];

     System.out.println("Display boolean array default content");
     for(boolean a : boolArr){
  
       System.out.println(a);
     }

     //float array
     float[] floatArr = new float[5];

     System.out.println("Display  float default content");
     for(float a : floatArr){
  
       System.out.println(a);
     }

     //char array
     char[] charArr = new char[5];

     System.out.println("Display char array default content");
     for(char a : charArr){
  
       System.out.println(a);
     }
    
     //String array
     String[] StringArr = new String[5];

     System.out.println("Display string/ array default content");
     for(String a : StringArr){
  
       System.out.println(a);
    }
  }
}