package techhaus;
import java.util.*;
public class q5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = scan.nextInt();
        System.out.println("Tax payable is Rs."+tax(income));
    }
    public static int tax(int a)
    {
        if(a<=250000)
        {
         return 0;   
        }
        else if(a>250000 && a<=500000)
        {
            int t = (int) (0.1*(a - 250000));
            return t;
            
        }
        else if(a>500000 && a<=1000000)
        {
            int t = (int)(25000 + 0.2*(a - 500000));
            return t;
        }
        else
        {
            int t = (int)(25000 + 100000 + 0.3*(a - 1000000));
            return t;            
        }
    }
}
