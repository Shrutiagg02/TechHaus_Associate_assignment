package techhaus;
import java.util.*;
public class q10
{
    public static void main(String[] args) 
    {
     Scanner scan = new Scanner(System.in);
     ArrayList<Integer> arr = new ArrayList<>();
     System.out.println("Enter an array of numbers");
     while(scan.hasNext())
        {
            arr.add(scan.nextInt());
        }
     System.out.println("The second largest number of this array is "+SecondLargest(arr));
    }
    public static int SecondLargest(ArrayList a)
    {
       Collections.sort(a);
       int l = a.size();
       int s = (int) a.get(l-2);
       return s;   
    }
}
