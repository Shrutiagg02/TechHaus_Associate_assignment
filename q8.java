package techhaus;
import java.util.*;
public class q8 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of seconds: ");
        long sec = scan.nextLong();
        TimeEquivalent(sec);
    }
    public static void TimeEquivalent(long a)
    {
        int day,hour,min,second;
        day = (int) (a/86400);
        int b =(int) (a%86400);
        hour = b/3600;
        int c = b%3600;
        min = c/60;
        second = c%60;
        System.out.println(day+"Day(s)"+hour+"Hour(s)"+min+"Minute(s)"+second+"Second(s)");
    }
}
