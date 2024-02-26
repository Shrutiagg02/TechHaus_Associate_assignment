package techhaus;

import java.util.*;

public class q2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the net price: ");
        float net = sc.nextFloat();
        System.out.println("Enter the tax rate: ");
        float tax = sc.nextFloat();
        System.out.println("The gross price is "+GrossPrice(net, tax));
        
    }
    public static float GrossPrice(float a,float b)
    {
        float grossp;
        grossp = a/(1+b);
        return grossp;
    }
}
