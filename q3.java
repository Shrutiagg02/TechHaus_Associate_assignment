package techhaus;

import java.util.*;

public class q3 
{
   public class largernum
   {
       public static void main(String[] args) 
       {
           System.out.println("Enter two numbers: ");
           Scanner scan = new Scanner(System.in);
           int i1 = scan.nextInt();    
           int i2 = scan.nextInt();
           System.out.println(larger(i1,i2)+" is larger of the two numbers");
       }
       public static int larger(int a, int b)
       {
           if(a>b)
           return a;
           else 
           return b;
       }
       
   }
}