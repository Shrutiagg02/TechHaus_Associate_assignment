package techhaus;
import java.util.*;
public class q9
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a two digit number: ");
        int num = scan.nextInt();
        TwoDigitSpecialInteger(num);
    }
    public static void TwoDigitSpecialInteger(int a)
    {
        int b,c;
        b = a/10;
        c = a%10;
        int d = (b+c)+(b*c);
        if(d == a)
        {
            System.out.println("This is a two digit special number.");
        }
        else
        {
            System.out.println("This is not a two digit special number");
        }
    }
}
