package techhaus;
import java.util.*;
public class q7
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter retail inflation rate and number of years: ");
        float rate = scan.nextFloat();
        float years = scan.nextFloat();
        System.out.println("The compounded inflation is "+CompoundedInflation(rate, years)+"%");
        
    }
    public static float CompoundedInflation(float a, float b)
    {
        float inf = (float) Math.pow((100+a)/100,b);
        float netInf =  ((inf -1)*100);
        return netInf;
    }
    
}
