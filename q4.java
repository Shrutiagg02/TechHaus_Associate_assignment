package techhaus;
import java.util.*;
public class q4 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter an array: ");
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            arr.add(scan.nextInt());
        }
        System.out.println("The median of this array is "+median(arr));
    }
    public static int median(ArrayList a)
    {
        Collections.sort(a);
        int l = a.size();
        if(l%2 == 0)
        {
            int b = (int) a.get(l/2);
            int c = (int) a.get(l/2 +1);
            int med = (b+c)/2;
            return med;
        }
        else
        {
            int med = (int) a.get(l/2);
            return med;
        }
    }
}
